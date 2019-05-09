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
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Marcos
 */
public class Manufacturer {
    private int id;
    private String name;
    private String city;
    private String state;
    private String email;
    
    public static Manufacturer getManufacturer(int manufacturerId) throws Exception {
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        String url = "jdbc:derby://localhost:1527/sample";
        Connection con = DriverManager.getConnection(url, "app", "app");
        String SQL = "SELECT * FROM MANUFACTURER WHERE MANUFACTURER_ID = ?";
        PreparedStatement st = con.prepareStatement(SQL);
        st.setInt(1, manufacturerId);
        ResultSet rs = st.executeQuery();
        Manufacturer m = null;
        ArrayList <Manufacturer> list = new ArrayList<>();
        if (rs.next()){
            m = new Manufacturer(rs.getInt("MANUFACTURER_ID"), rs.getString("NAME"), rs.getString("CITY"), rs.getString("STATE"), rs.getString("EMAIL"));
        }
        rs.close(); st.close(); con.close();
        return m;
    }
    
        public static ArrayList<Manufacturer> getList() throws Exception {
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        String url = "jdbc:derby://localhost:1527/sample";
        Connection con = DriverManager.getConnection(url, "app", "app");
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM MANUFACTURER");
        ArrayList <Manufacturer> list = new ArrayList<>();
        while (rs.next()){
            Manufacturer m = new Manufacturer(rs.getInt("MANUFACTURER_ID"), rs.getString("NAME"), rs.getString("CITY"), rs.getString("STATE"), rs.getString("EMAIL"));
            list.add(m);
        }
        rs.close(); st.close(); con.close();
        return list;
    }

    public Manufacturer(int id, String name, String city, String state, String email) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.state = state;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
