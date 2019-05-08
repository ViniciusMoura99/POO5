/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatecpg.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author vsreis
 */
public class PurchaseOrder {
    
    int orderNumber;
    int productId;
    int quantity;
    double shippingCost;
    Date salesDate;
    Date shippingDate;
    String freightCompany;
    
    public static ArrayList<PurchaseOrder> getPuchaseOrderList(int costumerId) throws Exception{
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        String url = "jdbc:derby://localhost:1527/sample";
        Connection connection = DriverManager.getConnection(url, "app", "app");
        String sql = "SELECT * FROM PURCHASE_ORDER WHERE CUSTOMER_ID = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, costumerId);
        ResultSet results = statement.executeQuery();
        
        ArrayList<PurchaseOrder> purchaseOrderList = new ArrayList();
        
        while (results.next()) {            
            PurchaseOrder products = new PurchaseOrder(
                    results.getInt("ORDER_NUM"),
                    results.getInt("PRODUCT_ID"),
                    results.getInt("QUANTITY"),
                    results.getDouble("SHIPPING_COST"),
                    results.getDate("SALES_DATE"),
                    results.getDate("SHIPPING_DATE"),
                    results.getString("FREIGHT_COMPANY")
            );
            purchaseOrderList.add(products);
            
        }
        
        return purchaseOrderList;
    }

    public PurchaseOrder(int orderNumber,int productId , int quantity, double shippingCost, Date salesDate, Date shippingDate, String freightCompany) {
        this.productId = productId;
        this.orderNumber = orderNumber;
        this.quantity = quantity;
        this.shippingCost = shippingCost;
        this.salesDate = salesDate;
        this.shippingDate = shippingDate;
        this.freightCompany = freightCompany;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getShippingCost() {
        return shippingCost;
    }

    public void setShippingCost(double shippingCost) {
        this.shippingCost = shippingCost;
    }

    public Date getSalesDate() {
        return salesDate;
    }

    public void setSalesDate(Date salesDate) {
        this.salesDate = salesDate;
    }

    public Date getShippingDate() {
        return shippingDate;
    }

    public void setShippingDate(Date shippingDate) {
        this.shippingDate = shippingDate;
    }

    public String getFreightCompany() {
        return freightCompany;
    }

    public void setFreightCompany(String freightCompany) {
        this.freightCompany = freightCompany;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }
    
}
