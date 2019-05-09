<%-- 
    Document   : index
    Created on : 06/05/2019, 19:52:42
    Author     : thiag
--%>

<%@page import="br.com.fatecpg.jdbc.Customer"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Clientes - JavaDB</title> 
    </head>
    <body>
        <h1>JavaDB</h1>
        <h2>Clientes</h2>
        <%try{%>
        <%ArrayList<Customer> list = Customer.getList(); %>
        <table border="1">
            <tr>
                <th>ID</th>
                <th>Nome</th>
                <th>E-mail</th>
                <th>Detalhes</th>
                <th>Lista de Compras</th>
            </tr>
            <% for(Customer c: list){ %>
            <tr>
                <td><%=c.getId()%></td>
                <td><%=c.getName()%></td>
                <td><%=c.getEmail()%></td>
                <td><a href="details.jsp?id=<%=c.getId()%>">Ver detalhes</a></td>
                <td><a href="custumerOrderDetails.jsp?id=<%=c.getId()%>">Ver lista de compras</td>
            </tr>
            <%}%>
        </table>
        <%}catch(Exception e){%>
        <h3 style="color: red"> <%= e.getMessage() %> </h3>
        <%}%>
    </body>
</html>
