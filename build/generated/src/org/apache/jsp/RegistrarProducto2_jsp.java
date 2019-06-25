package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Modelo.CategoriaDB;
import Modelo.Categoria;
import java.util.ArrayList;
import java.util.ArrayList;
import java.sql.ResultSet;
import Utils.Conexion;
import java.sql.CallableStatement;

public final class RegistrarProducto2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");

String usu=null;
String nom=null;
HttpSession sesionOK=request.getSession();
if(sesionOK.getAttribute("perfil")!=null){
nom=(String)sesionOK.getAttribute("nom")+" "+(String)sesionOK.getAttribute("ape");
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
      out.write("        <a class=\"navbar-brand\" href=\"Index.jsp\" ><img width=\"250\"  src=\"img/LOGO_EMPRESA_1.png\" ></a>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("      <ul class=\"nav navbar-nav\">\n");
      out.write("          <li><a href=\"Index.jsp\">Catálogo</a></li>\n");
      out.write("        ");
if(sesionOK.getAttribute("perfil")!=null && sesionOK.getAttribute("perfil").equals("Administrador")){
      out.write("\n");
      out.write("                <li><a href=\"Servlet_logueo?accion=cerrar\">Cerrar Sesión</a></li>\n");
      out.write("                ");
 }
      out.write("\n");
      out.write("                \n");
      out.write("      </ul>      \n");
      out.write("      <ul class=\"nav navbar-nav navbar-right\" >\n");
      out.write("          ");
if(sesionOK.getAttribute("perfil")!=null){
                    
      out.write("\n");
      out.write("                    <li>\n");
      out.write("                    <a class=\"navbar-brand\" href=\"#\">");
out.println("Bienvenido: "+nom);
      out.write("</a></li>\n");
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
      out.write("        <h2 align=\"center\">Registrar Producto</h2>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <form class=\"form-horizontal\" action=\"Servlet_controlador\" method=\"get\">\n");
      out.write("            <table border=\"0\" width=\"350\" align=\"center\">\n");
      out.write("                ");
 String imagen=request.getParameter("img");
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td>Nombre: </td>\n");
      out.write("                    <td><input type=\"text\" name=\"txtNom\" placeholder=\"Entre 3 y 40 caracteres\" minlength=\"3\" maxlength=\"40\" required /></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr> \n");
      out.write("                    <td>Categoria: </td>\n");
      out.write("                    <td colspan=\"2\">\n");
      out.write("                <select name=\"Cbx_CAT\" size=\"1\">\n");
      out.write("                ");

                ArrayList<Categoria> ca=CategoriaDB.ListaCategoria();
                for(Categoria c: ca){
                
      out.write("\n");
      out.write("                <option value=\"");
      out.print(c.getId());
      out.write('"');
      out.write('>');
      out.print(c.getNombre());
      out.write("</option>\n");
      out.write("                ");
}
      out.write("\n");
      out.write("                </select>\n");
      out.write("                </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Precio: </td>\n");
      out.write("                    <td><input type=\"number\" name=\"txtPrecio\" value=\"1\" step=\"0.1\" min=\"1\" max=\"1500\" required /></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td colspan=\"5\" align=\"center\"><input type=\"submit\" value=\"Registrar\" name=\"CargarImagen\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                <input type=\"hidden\" name=\"txtImagen\" value=\"");
      out.print(imagen);
      out.write("\"/>\n");
      out.write("                <input type=\"hidden\" name=\"accion\" value=\"RegistrarProducto\"/>\n");
      out.write("            </table>\n");
      out.write("        </form>\n");
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
