<%-- 
    Document   : custumerOrderDetails
    Created on : 08/05/2019, 13:37:19
    Author     : Marcos
--%>
<%@page import="br.com.fatecpg.jdbc.PurchaseOrder"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Java DB</h1>
        <h2>Pedidos do Cliente</h2>
        <%try{%>
        <% int id = Integer.parseInt(request.getParameter("id"));%>
        <% ArrayList<PurchaseOrder> lista = PurchaseOrder.getPuchaseOrderList(id); %>
        <%if(lista != null && !lista.isEmpty()){ %>
        <table border="1">
            <tr>
                <th>Nº Ordem</th>
                <th>ID Produto</th>
                <th>Quantidade</th>
                <th>Valor</th>
                <th>Data de Envio</th>
                <th>Data da Venda</th>
            </tr>
            <% for(PurchaseOrder purchase: lista){%>
            <tr>
                <td><%=purchase.getOrderNumber()%></td>
                <td><%=purchase.getProductId()%></td>
                <td><%=purchase.getQuantity()%></td>
                <td><%=purchase.getShippingCost()%></td>
                <td><%=purchase.getShippingDate()%></td>
                <td><%=purchase.getSalesDate()%></td>
            </tr>
            <%}%>
        <%}else{%>
        <h3>Pedidos do Cliente <%=id%> não encontrados! </h3>
        <% } %>
        </table>
        <%}catch(Exception e){%>
        <h3 style="color: red"> <%= e.getMessage() %> </h3>
        <%}%>
    </body>
</html>
