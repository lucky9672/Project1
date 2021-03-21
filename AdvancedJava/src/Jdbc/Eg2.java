import java.sql.*;
 class A1{

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

class B1 extends A1{
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
class C1 extends B1{
    void f3()
    {
        try{
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/book","root","");
         Statement s = conn.createStatement();
        String sql="insert into person values(103,'raj','hyderabad',45000,29)";
        int Result=s.executeUpdate(sql);
    }
        catch(Exception e)
        {
            
        }
    }
}
class Eg2 extends C1{
      void f4()
    {
        try{
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/book","root","");
         Statement s = conn.createStatement();
        String sql="alter table person change p_id pid int";
        int Result=s.executeUpdate(sql);
    }
        catch(Exception e)
        {
            
        }
    }
    public static void main(String[] args)
    {
        Eg2 eg=new Eg2();
        eg.f1();
       //B ob=(B)eg;
       eg.f2();
        eg.f3();
        eg.f4();
    }
}
       