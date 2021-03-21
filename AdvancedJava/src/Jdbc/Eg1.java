import java.sql.*;
 class A{

    private static String jdbcDriver = "com.mysql.jdbc.Driver";
    private static String dbName = "book";


    void f1() {
        try{
        Class.forName(jdbcDriver);
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/?user=root&password=");
        Statement s = conn.createStatement();
        int Result = s.executeUpdate("CREATE DATABASE "+dbName);
        }
       catch(Exception e)
               {
               
               }
    }
}

class B extends A{
        static String user="root";
        static String pass="";
        static final String url="jdbc:mysql://localhost/book";
        void f2()
        {
            try{
           Connection conn = DriverManager.getConnection(url,user,pass);
           Statement s = conn.createStatement();
           String sql="create table person"
                   +"(id int,"
                   + "name varchar(250),"
                   +"address varchar(250),"
                   + "salary int,"
                   + "age int)";
                   
           int Result=s.executeUpdate(sql);
                      

        }
            
            catch(Exception e)
            {
                
            }
        }
       
        
}
class Eg1 extends B{
    void f3()
    {
        try{
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/book","root","");
         Statement s = conn.createStatement();
        String sql="insert into person values(101,'lucky','sangam',25000,25)";
        int Result=s.executeUpdate(sql);
    }
        catch(Exception e)
        {
            
        }
    }
    public static void main(String[] args)
    {
        Eg1 eg=new Eg1();
        eg.f1();
       //B ob=(B)eg;
       eg.f2();
        eg.f3();
    }
}
       
        


