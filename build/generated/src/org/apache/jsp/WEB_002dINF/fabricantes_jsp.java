package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import br.com.fatecpg.jdbc.Manufacturer;
import java.util.ArrayList;

public final class fabricantes_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Fabricantes - JavaDB</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <h1>JavaDB</h1>\r\n");
      out.write("        <h2>Fabricantes</h2>\r\n");
      out.write("        ");
try{
      out.write("\r\n");
      out.write("            ");
ArrayList<Manufacturer> list = Manufacturer.getList();
      out.write("\r\n");
      out.write("            <table border=\"1\">\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <th>ID</th>\r\n");
      out.write("                    <th>Nome</th>\r\n");
      out.write("                    <th>Cidade</th>\r\n");
      out.write("                    <th>Estado</th>\r\n");
      out.write("                    <th>Email</th>\r\n");
      out.write("                </tr>\r\n");
      out.write("                ");
for(Manufacturer m: list){
      out.write("\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>");
      out.print( m.getId() );
      out.write("</td>\r\n");
      out.write("                    <td>");
      out.print( m.getName() );
      out.write("</td>\r\n");
      out.write("                    <td>");
      out.print( m.getCity());
      out.write("</td>\r\n");
      out.write("                    <td>");
      out.print( m.getState());
      out.write("</td>\r\n");
      out.write("                    <td>");
      out.print( m.getEmail() );
      out.write("</td>\r\n");
      out.write("                    <td><a href=\"produto.jsp?id=");
      out.print(m.getId());
      out.write("\">Ver produtos</a></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                ");
}
      out.write("\r\n");
      out.write("            </table>\r\n");
      out.write("        ");
} catch(Exception e){
      out.write("\r\n");
      out.write("        <h3 style=\"color: red\">");
      out.print(e.getMessage());
      out.write("</h3>\r\n");
      out.write("        ");
}
      out.write("\r\n");
      out.write("        \r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
