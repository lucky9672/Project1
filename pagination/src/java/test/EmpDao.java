//package com.javatpoint.dao;  
package test;
import test.*;         
import java.sql.*;  
import java.util.ArrayList;  
import java.util.List;  
public class EmpDao {  
  
    public static Connection getConnection(){  
        Connection con=null;  
        try{  
            Class.forName("com.mysql.jdbc.Driver");  
            con=DriverManager.getConnection("jdbc:mysql://localhost/employee","root","");  
        }catch(Exception e){   
            System.out.println(e);
        }  
        return con;  
    } 
    public  static int getCount(){
        try{ 
             Connection con=getConnection();  
         PreparedStatement ps=con.prepareStatement("select count(*) from emp ");
         ResultSet rs=ps.executeQuery(); 
          while (rs.next()) {
            return rs.getInt(1);
            }
        }catch(Exception e){
            System.out.println(e);}
          
            
       return 1;
    }
    public static List<Emp> getRecords(int start,int total){  
        List<Emp> list=new ArrayList<Emp>();  
        try{  
            Connection con=getConnection();  
            PreparedStatement ps=con.prepareStatement("select * from emp limit "+(start)+","+total);  
            ResultSet rs=ps.executeQuery();  
            while(rs.next()){  
                Emp e=new Emp();  
                e.setid(rs.getInt(1));  
                e.setname(rs.getString(2));  
                e.setsalary(rs.getFloat(3));  
                list.add(e);  
            }  
            con.close();  
        }catch(Exception e){System.out.println(e);}  
        return list;  
    }  
}  