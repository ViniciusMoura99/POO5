<%-- 
    Document   : details
    Created on : 07/05/2019, 08:38:03
    Author     : Marcos
--%>

<%@page import="br.com.fatecpg.jdbc.Product"%>
<%@page import="br.com.fatecpg.jdbc.Manufacturer"%>
<%@page import="br.com.fatecpg.jdbc.Order"%>
<%@page import="br.com.fatecpg.jdbc.Customer"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Produtos - JavaDB</title>
    </head>
    <body>
        <h1>JavaDB</h1>
        <h2>Produtos do fabricante</h2>
        <%try{%>
                    <%int id = Integer.parseInt(request.getParameter("id"));%>
                
                    <%Manufacturer m = Manufacturer.getManufacturer(id);%>
                    <%if(m != null){%>
                        <h3>ID:<u><%=id%></u></h3>
                        <h3>Name:<u><%=m.getName()%></u></h3>
                        <hr/>
                        <table border="1">
                            <tr>
                                <th>ID</th>
                                <th>Código</th>
                                <th>Custo</th>
                                <th>Descrição</th>
                            </tr>
                            <%for(Product p: Product.getList(id)){%>
                            <tr>
                                <td><%=p.getId()%></td>
                                <td><%=p.getCode()%></td>
                                <td><%=p.getPurchase()%></td>
                                <td><%=p.getDesc()%></td>
                            </tr>
                        
                            <%}%>
                        </table>
                    <%}else{%>
                         <h3>Produto <%=id%> não encontrado!</h3>
                    <%}%>
        <%}catch (Exception e){%>
                         <h3 style="color: red"><%=e.getMessage()%></h3>
                    <%}%>
               
    </body>
</html>
