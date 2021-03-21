import java.sql.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package Jdbc;

/**
 *
 * @author LAKSHMI NARAYANA
 */
public class DropTable {
     static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
  static final String DB_URL = "jdbc:mysql://localhost/man";

  static final String USER = "root";
  static final String PASS = "";

  public static void main(String[] args) throws Exception {
    Connection conn = null;
    Statement stmt = null;

    Class.forName(JDBC_DRIVER);
    conn = DriverManager.getConnection(DB_URL, USER, PASS);
    System.out.println("Deleting table");
    stmt = conn.createStatement();

    conn = DriverManager.getConnection(DB_URL, USER, PASS);

    stmt = conn.createStatement();

    String sql = "DROP TABLE cat ";

    stmt.executeUpdate(sql);

    System.out.println("successfully table is deleted");
    stmt.close();
    conn.close();
  }
}

    

