package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Modelo.CategoriaDB;
import Modelo.Categoria;
import Modelo.ProductoDB;
import java.util.ArrayList;
import Modelo.Producto;

public final class Registrar_005fProducto_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

String usu=null;
String nom=null;
String cod_usu=null;
HttpSession sesionOK=request.getSession();
if(sesionOK.getAttribute("perfil")!=null){
nom=(String)sesionOK.getAttribute("nom")+" "+(String)sesionOK.getAttribute("ape");
cod_usu=(String)sesionOK.getAttribute("codigo");        
}

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"icon\" type=\"image/png\" href=\"img/Logo_1.jpg\"/>\n");
      out.write("        <title>Registrar Producto</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css/estilos.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css/owl.carousel.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.6.1/css/font-awesome.min.css\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/flaticon.css\"> \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <nav class=\"navbar navbar-default navbar-fixed-top\">\n");
      out.write("  <div class=\"container\">\n");
      out.write("    <div class=\"navbar-header\">\n");
      out.write("        <a class=\"navbar-brand\" href=\"index.jsp\" ><img width=\"250\"  src=\"img/LOGO_EMPRESA_1.png\" ></a>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("      <ul class=\"nav navbar-nav\">\n");
      out.write("          <li><a href=\"index.jsp\">Catálogo</a></li>\n");
      out.write("          <li><a >Categoria</a>\n");
      out.write("              <ul>\n");
      out.write("                  ");
if(sesionOK.getAttribute("perfil")!=null && sesionOK.getAttribute("perfil").equals("Administrador")){
      out.write("\n");
      out.write("                  <li><a href=\"Agrega_categoria.jsp\">Añadir Categoria</a></li>\n");
      out.write("                ");
 }
                  ArrayList<Categoria> ca=CategoriaDB.ListaCategoria();
                for(Categoria c: ca){
      out.write("\n");
      out.write("                  <li ><a href=\"Filtro.jsp?id=");
      out.print(c.getId());
      out.write('"');
      out.write('>');
      out.print(c.getNombre());
      out.write("</a></li>\n");
      out.write("                  ");
}
      out.write("\n");
      out.write("              </ul>\n");
      out.write("          </li>\n");
      out.write("          \n");
      out.write("          \n");
      out.write("        ");
if(sesionOK.getAttribute("perfil")!=null && sesionOK.getAttribute("perfil").equals("Administrador")){
      out.write("\n");
      out.write("                <li><a href=\"Registrar_Producto.jsp\">Registrar producto</a></li>\n");
      out.write("                <li><a >Reportes</a>\n");
      out.write("                <ul>\n");
      out.write("                    <li><a href=\"Ventas_del_dia.jsp?op=1\">Historial de Ventas</a></li>\n");
      out.write("                    <li><a href=\"Ventas_del_dia.jsp?op=2\">Cliente del mes</a></li>\n");
      out.write("                    <li><a href=\"Ventas_del_dia.jsp?op=3\">Prod. Más Vendido</a></li>\n");
      out.write("                    <li><a href=\"Ventas_del_dia.jsp?op=4\">Historial de Compras</a></li>\n");
      out.write("                    <li><a href=\"Ventas_del_dia.jsp?op=5\">Movimiento de Productos</a></li>\n");
      out.write("                    <li><a href=\"Ventas_del_dia.jsp?op=6\">Pedidos</a></li>\n");
      out.write("                </ul>\n");
      out.write("                    </li>\n");
      out.write("                ");
 }
                
      out.write("\n");
      out.write("                ");
if(sesionOK.getAttribute("perfil")!=null && sesionOK.getAttribute("perfil").equals("Cliente")){
                    
      out.write("\n");
      out.write("                <li><a href=\"RegistrarVenta.jsp\">Ver Carrito</a></li>\n");
      out.write("                ");
}
      out.write("\n");
      out.write("                    \n");
      out.write("      </ul>      \n");
      out.write("      <ul class=\"nav navbar-nav navbar-right\" >\n");
      out.write("          ");
if(sesionOK.getAttribute("perfil")!=null){
                    
      out.write("\n");
      out.write("                    <li><a  href=\"#\">");
out.println("Bienvenido: "+nom);
      out.write("</a>\n");
      out.write("                        <ul>\n");
      out.write("                        ");
if(sesionOK.getAttribute("perfil")!=null && sesionOK.getAttribute("perfil").equals("Cliente")){
      out.write("\n");
      out.write("                        \n");
      out.write("                            <li><a href=\"Ventas_del_dia.jsp?op=7&cod=");
      out.print(cod_usu);
      out.write("\">Mis Pedidos</a></li>\n");
      out.write("                        ");
}
      out.write("\n");
      out.write("                        <li><a href=\"Servlet_logueo?accion=cerrar\">Cerrar Sesión</a></li>\n");
      out.write("                        </ul> \n");
      out.write("                    </li>\n");
      out.write("                ");

                }
                if(sesionOK.getAttribute("perfil")==null){
                
      out.write("\n");
      out.write("                <li><a href=\"Login.jsp\">Iniciar Sesion</a></li>\n");
      out.write("                ");

                }
                
      out.write("\n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("      <br>\n");
      out.write("      <br>\n");
      out.write("      <br>\n");
      out.write("      <br>\n");
      out.write("        <h2 align=\"center\">Cargar Imagen</h2>\n");
      out.write("        <table border=\"0\" width=\"400\" align=\"center\">\n");
      out.write("            <form action=\"Servlet_controlador?accion=SubirImagen\" enctype=\"multipart/form-data\" method=\"post\" name=\"formulario\">\n");
      out.write("                <tr>\n");
      out.write("                    <th>Imagen: </th>\n");
      out.write("                    <th><input type=\"file\" name=\"imagen\" id=\"imagen\"/></th>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <th colspan=\"2\"><input type=\"submit\" value=\"Registrar\" name=\"CargarImagen\" id=\"btn\"/></th>\n");
      out.write("                </tr>\n");
      out.write("            </form>\n");
      out.write("        </table>\n");
      out.write("        \n");
      out.write("        <script>\n");
      out.write(" window.onload=function (){\n");
      out.write("                var btn=document.getElementById(\"btn\");\n");
      out.write("                btn.onclick=function(){\n");
      out.write("                    var imagen=document.getElementById(\"imagen\").files;\n");
      out.write("                    if(imagen.length==0){\n");
      out.write("                        \n");
      out.write("                    alert(\"Seleccione Una IMAGEN\");\n");
      out.write("                        \n");
      out.write("                    }else{\n");
      out.write("                         for(x=0;x<imagen.length;x++){\n");
      out.write("                             if(imagen[x].type!=\"image/png\" && imagen[x].type!=\"image/jpg\" && imagen[x].type!=\"image/jpeg\" && imagen[x].type!=\"image/gif\"){\n");
      out.write("                                 alert(\"El Archivo \"+imagen[x].name+\" no es una imagen causita\");\n");
      out.write("                                 return;\n");
      out.write("                             }\n");
      out.write("                             if(imagen[x].size > 1024*1024*1){\n");
      out.write("                                 alert(\"El tamaño maximo permitido es 1Mb\");\n");
      out.write("                                 return;\n");
      out.write("                             }\n");
      out.write("                         }\n");
      out.write("                        \n");
      out.write("                    }\n");
      out.write("                    document.formulario.submit();\n");
      out.write("                }\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("</script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
