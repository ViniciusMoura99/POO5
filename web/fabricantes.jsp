<%-- 
    Document   : fabricantes
    Created on : 07/05/2019, 20:47:58
    Author     : fernando.santos
--%>

<%@page import="br.com.fatecpg.jdbc.Manufacturer"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Fabricantes - JavaDB</title>
    </head>
    <body>
        <h1>JavaDB</h1>
        <h2>Fabricantes</h2>
        <%try{%>
            <%ArrayList<Manufacturer> list = Manufacturer.getList();%>
            <table border="1">
                <tr>
                    <th>ID</th>
                    <th>Nome</th>
                    <th>Cidade</th>
                    <th>Estado</th>
                    <th>Email</th>
                </tr>
                <%for(Manufacturer m: list){%>
                <tr>
                    <td><%= m.getId() %></td>
                    <td><%= m.getName() %></td>
                    <td><%= m.getCity()%></td>
                    <td><%= m.getState()%></td>
                    <td><%= m.getEmail() %></td>
                    <td><a href="produto.jsp?id=<%=m.getId()%>">Ver produtos</a></td>
                </tr>
                <%}%>
            </table>
        <%} catch(Exception e){%>
        <h3 style="color: red"><%=e.getMessage()%></h3>
        <%}%>
        
    </body>
</html>
