

<%@page import="br.com.fatecpg.jdbc.Customer"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Compras - JavaDB</title>
    </head>
    <body>
        <h1>Java DB</h1>
        <h2>Compras do cliente</h2>
        <% try { %>
        <% int id = Integer.parseInt(request.getParameter("id")); %>
        <% Customer c = Customer.getCustomer(id);%>
        <%if(c != null){ %>
        <h3>ID: <u><%=id%></u></h3>
        <h3>Name: <u><%=c.getName()%></u></h3>
        <hr/>
        <%}else{%>
        <h3>Cliente <%=id%> não encontrado! </h3>
        <% } %>
        <% } catch (Exception e) { %>
        <h3 style="color: red"> <%= e.getMessage() %> </h3>
        <% }%>
    </body>
</html>
