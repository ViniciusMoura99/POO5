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
 * @author thiag
 */
public class Fabricantes {

    private int Id;
    private String name;
    private String city;
    private String email;
    private String state;

    public static Fabricantes getFabricantes(int id) throws Exception {
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        String url = "jdbc:derby://localhost:1527/sample";
        Connection con = DriverManager.getConnection(url, "app", "app");
        String SQL = "SELECT * FROM MANUFACTURER WHERE MANUFACTURER_ID = ?";
        PreparedStatement st = con.prepareStatement(SQL);
        st.setInt(1, id);
        ResultSet rs = st.executeQuery();
        Fabricantes f = null;
        if (rs.next()) {
            f = new Fabricantes(
                    rs.getInt("MANUFACTURER_ID"),
                    rs.getString("NAME"),
                    rs.getString("CITY"),
                    rs.getString("STATE"),
                    rs.getString("EMAIL"));

        }
        rs.close();
        st.close();
        con.close();
        return f;
    }

    public static ArrayList<Fabricantes> getLista() throws Exception {
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        String url = "jdbc:derby://localhost:1527/sample";
        Connection con = DriverManager.getConnection(url, "app", "app");
        java.sql.Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM MANUFACTURER");
        ArrayList<Fabricantes> lista = new ArrayList<>();
        while (rs.next()) {
            Fabricantes f = new Fabricantes(rs.getInt("MANUFACTURER_ID"), rs.getString("NAME"), rs.getString("CITY"), rs.getString("STATE"), rs.getString("EMAIL"));
            lista.add(f);
        }
        rs.close();
        st.close();
        con.close();
        return lista;
    }

    public Fabricantes(int Id, String name, String city, String state, String email) {
        this.Id = Id;
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
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
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
