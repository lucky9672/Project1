import java.sql.*;  
import java.io.*;  
import java.lang.IndexOutOfBoundsException;
public class InsertImage {  
public static void main(String[] args){  
try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost/test","root","");              
PreparedStatement ps=con.prepareStatement("insert into imgtable values(?,?)"); 
ps.setString(1,"sonoo");   
FileInputStream fin=new FileInputStream("d:\\ZenQ.jpg");  
ps.setBinaryStream(2,fin,fin.available());  
int i=ps.executeUpdate();  
System.out.println(i+" records affected");           
con.close();  
}catch (Exception e) {e.printStackTrace();}  
}  
}  