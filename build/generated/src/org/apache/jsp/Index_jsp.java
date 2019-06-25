package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Modelo.CategoriaDB;
import Modelo.Categoria;
import Modelo.ProductoDB;
import java.util.ArrayList;
import Modelo.Producto;

public final class Index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Autopartes Ventanilla</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css/estilos.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css/owl.carousel.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.6.1/css/font-awesome.min.css\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/flaticon.css\"> \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <main>\n");
      out.write("        <nav class=\"navbar navbar-default navbar-fixed-top\">\n");
      out.write("  <div class=\"container\">\n");
      out.write("    <div class=\"navbar-header\">\n");
      out.write("        <a class=\"navbar-brand\" href=\"Index.jsp\" ><img width=\"250\"  src=\"img/LOGO_EMPRESA_1.png\" ></a>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("      <ul class=\"nav navbar-nav\">\n");
      out.write("          <li><a href=\"Index.jsp\">Catálogo</a></li>\n");
      out.write("          <li><a href=\"Index.jsp\">Categoria</a>\n");
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
      out.write("                <li><a href=\"Index.jsp\">Reportes</a>\n");
      out.write("                <ul>\n");
      out.write("                    <li><a href=\"Ventas_del_dia.jsp?op=1\">Ventas de hoy</a></li>\n");
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
if(sesionOK.getAttribute("perfil")!=null){
                    
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
      out.write("                        <li><a >Editar mis Datos</a></li>\n");
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
      out.write("       <section id=\"producto\">\n");
      out.write("           <div class=\"container\">\n");
      out.write("               <div class=\"row\">\n");
      out.write("                   <div class=\"col-md-12\">\n");
      out.write("                       <div class=\"titulo\">\n");
      out.write("                           <h2>Catálogo de Productos</h2>\n");
      out.write("                           <div class=\"hr\"></div>\n");
      out.write("                       </div>\n");
      out.write("                       <form action=\"Busqueda.jsp\" method=\"post\">\n");
      out.write("                       <input type=\"text\" name=\"txtN\" placeholder=\"Buscar\" />\n");
      out.write("                       <input type=\"submit\" name=\"btnBuscar\" value=\"BUSCAR\"/>\n");
      out.write("                       <br>\n");
      out.write("                       <br>\n");
      out.write("                       \n");
      out.write("                       </form>\n");
      out.write("                   </div>\n");
      out.write("                   \n");
      out.write("                   ");

            ArrayList<Producto> List=null;
            if(sesionOK.getAttribute("perfil")!=null && sesionOK.getAttribute("perfil").equals("Administrador")){
            List=ProductoDB.ListarProductoADMIN();
            }else{
            List=ProductoDB.ListarProducto();
            }
            int salto=0;
            for(Producto p:List){
            
      out.write("\n");
      out.write("             <div class=\"col-sm-4 col-lg-4 col-md-4\" wi >\n");
      out.write("                        <div class=\"thumbnail text-center\">                            \n");
      out.write("                            <img src=\"img/");
      out.print(p.getImagen());
      out.write("\" class=\"img-responsive\" alt=\"\">\n");
      out.write("                            <div class=\"caption\">\n");
      out.write("                                <h4 class=\"pull-right precio\">s/ ");
      out.print(p.getPrecio());
      out.write("</h4>\n");
      out.write("                                <h4><a href=\"Ver_PROD.jsp?Id=");
      out.print(p.getCod());
      out.write('"');
      out.write('>');
      out.print(p.getNombre());
      out.write("</a>\n");
      out.write("                                </h4>\n");
      out.write("                                \n");
      out.write("                                ");
if(sesionOK.getAttribute("perfil")!=null && sesionOK.getAttribute("perfil").equals("Administrador")){
      out.write("\n");
      out.write("                                <h4><p> Estado: ");
      out.print(p.getEstado());
      out.write("<p></h4>\n");
      out.write("                                \n");
      out.write("                                <a class=\"btn btn-primary\" href=\"ActualizarProducto.jsp?id=");
      out.print(p.getCod());
      out.write("\">Editar</a>\n");
      out.write("                                <a class=\"btn btn-primary\" href=\"Servlet_controlador?id=");
      out.print(p.getCod());
      out.write("&Est=");
      out.print(p.getEstado());
      out.write("&accion=CambiarEstado\">Cambiar Estado</a>\n");
      out.write("                                ");
if(p.getStock()==0){
      out.write("\n");
      out.write("                                <a class=\"btn alert-warning\"  href=\"Abastecer_Producto.jsp?Id=");
      out.print(p.getCod());
      out.write("\" title=\"Producto Sin Stock\">Abastecer</a>\n");
      out.write("                                ");
}else{
      out.write("\n");
      out.write("                                <a class=\"btn btn-primary\" href=\"Abastecer_Producto.jsp?Id=");
      out.print(p.getCod());
      out.write("\">Abastecer</a>\n");
      out.write("                                ");
}
      out.write("\n");
      out.write("                                \n");
      out.write("                    ");
}else{
      out.write("\n");
      out.write("                    <a class=\"btn btn-primary\" ");
if(sesionOK.getAttribute("perfil")==null ){
      out.write("href=\"Login.jsp\"");
}else{
      out.write("href=\"Agregar_carrito.jsp?id=");
      out.print(p.getCod());
}
      out.write("\">Comprar</a>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                        </div>                                \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                   ");
}
      out.write("\n");
      out.write("                   \n");
      out.write("                   \n");
      out.write("                   \n");
      out.write("                   \n");
      out.write("                </div>\n");
      out.write("           </div>\n");
      out.write("       </section>\n");
      out.write("   </main> \n");
      out.write("  <script src=\"js/jquery.js\"></script>\n");
      out.write("<script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"js/owl.carousel.js\"></script>\n");
      out.write("<script src=\"js/code.js\"></script> \n");
      out.write("\n");
      out.write("<table border=\"0\" align=\"center\">\n");
      out.write("    <tr >\n");
      out.write("        <th>Contactenos: </th>\n");
      out.write("        <th><img width=\"50\"  src=\"img/cellPhone.png\" > 6063359 </th>\n");
      out.write("        <th><img width=\"50\"  src=\"img/gmail.png\" > AuropartesVentanilla@gmail.com</th>\n");
      out.write("    </tr>\n");
      out.write("</table>\n");
      out.write("\n");
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
