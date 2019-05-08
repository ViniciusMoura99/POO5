package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import br.com.fatecpg.jdbc.PurchaseOrder;
import java.util.ArrayList;

public final class custumerOrderDetails_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <h1>Java DB</h1>\r\n");
      out.write("        <h2>Pedidos do Cliente</h2>\r\n");
      out.write("        ");
try{
      out.write("\r\n");
      out.write("        ");
 int id = Integer.parseInt(request.getParameter("id"));
      out.write("\r\n");
      out.write("        ");
 ArrayList<PurchaseOrder> lista = PurchaseOrder.getPuchaseOrderList(id); 
      out.write("\r\n");
      out.write("        ");
if(lista != null && !lista.isEmpty()){ 
      out.write("\r\n");
      out.write("        <table border=\"1\">\r\n");
      out.write("            <tr>\r\n");
      out.write("                <th>Nº Ordem</th>\r\n");
      out.write("                <th>ID Produto</th>\r\n");
      out.write("                <th>Quantidade</th>\r\n");
      out.write("                <th>Valor</th>\r\n");
      out.write("                <th>Data de Envio</th>\r\n");
      out.write("                <th>Data da Venda</th>\r\n");
      out.write("            </tr>\r\n");
      out.write("            ");
 for(PurchaseOrder purchase: lista){
      out.write("\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>");
      out.print(purchase.getOrderNumber());
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print(purchase.getProductId());
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print(purchase.getQuantity());
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print(purchase.getShippingCost());
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print(purchase.getShippingDate());
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print(purchase.getSalesDate());
      out.write("</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            ");
}
      out.write("\r\n");
      out.write("        ");
}else{
      out.write("\r\n");
      out.write("        <h3>Pedidos do Cliente ");
      out.print(id);
      out.write(" não encontrados! </h3>\r\n");
      out.write("        ");
 } 
      out.write("\r\n");
      out.write("        </table>\r\n");
      out.write("        ");
}catch(Exception e){
      out.write("\r\n");
      out.write("        <h3 style=\"color: red\"> ");
      out.print( e.getMessage() );
      out.write(" </h3>\r\n");
      out.write("        ");
}
      out.write("\r\n");
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
