<%-- 
    Document   : indexFornecedor
    Created on : 07/05/2019, 15:55:26
    Author     : thiag
--%>

<%@page import="br.com.fatecpg.jdbc.Fabricantes"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Fabricantes - JavaDB</title>
    </head>
    <body>
        <h1>Java DB</h1>
        <h2>Fabricantes</h2>
        <%try{%>
        <% ArrayList<Fabricantes> lista = Fabricantes.getLista(); %>
        <table border="1">
            <tr>
                <th>ID</th>
                <th>Nome</th>
                <th>Cidade</th>
                <th>Estado</th>
                <th>E-mail</th>
            </tr>
            <% for(Fabricantes f: lista){%>
            <tr>
                <td><%=f.getId()%></td>
                <td><%=f.getName()%></td>
                <td><%=f.getCity()%></td>
                <td><%=f.getState()%></td>
                <td><%=f.getEmail()%></td>
                
            </tr>
            <%}%>
        </table>
        <%}catch(Exception e){%>
        <h3 style="color: red"> <%= e.getMessage() %> </h3>
        <%}%>
    </body>
</html>
