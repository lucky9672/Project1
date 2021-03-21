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
public class RetriveValues {
     static final String driver_Manager = "com.mysql.jdbc.Driver";
        static final String db_Url="jdbc:mysql://localhost/employee";
        static final String user="root";
        static final String password="";
    public static void main(String[] args) throws Exception
    {
       Connection conn=null;
       Statement smt=null;
       Class.forName(driver_Manager);
       conn=DriverManager.getConnection(db_Url,user,password);
       smt=conn.createStatement();
        
       String sql="select sid,sname,sage,salart from student1";
       ResultSet rs=smt.executeQuery(sql);
       while(rs.next())
       {
           int sid=rs.getInt("sid");
           String sname=rs.getString("sname");
           String sage=rs.getString("sage");
           String salart=rs.getString("salart");
           
           System.out.println("sid="+sid);
           System.out.println("sname="+sname);
           System.out.println("sage="+sage);
           System.out.println("salart="+salart);
       }
       conn.close();
       smt.close();
       
    }
    
}
