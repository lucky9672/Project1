import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;

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
public class DropDatabase {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
  static final String DB_URL = "jdbc:mysql://localhost/";

  static final String USER = "root";
  static final String PASS = "";

  public static void main(String[] args) throws Exception {
    Connection conn = null;
    Statement stmt = null;

    Class.forName(JDBC_DRIVER);
    conn = DriverManager.getConnection(DB_URL, USER, PASS);
    System.out.println("Deleting database...");
    stmt = conn.createStatement();

    String sql = "DROP DATABASE mydatabas123e";
    stmt.executeUpdate(sql);

    stmt.close();
    conn.close();
  }
}

