import java.io.*;  
import java.sql.*;  
import javax.servlet.ServletException;  
import javax.servlet.http.*;  
public class Register extends HttpServlet {  
public void doPost(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
response.setContentType("text/html");  
PrintWriter out = response.getWriter();          
String n=request.getParameter("UserName");  
String p=request.getParameter("UserPass");  
String e=request.getParameter("UserEmail");  
String c=request.getParameter("UserCountry");
try{
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection("jdbc:mysql://localhost/registration","root","");  
PreparedStatement ps=con.prepareStatement("insert into registeruser values(?,?,?,?)");    
ps.setString(1,n);  
ps.setString(2,p);  
ps.setString(3,e);  
ps.setString(4,c);           
int i=ps.executeUpdate(); 
if(i>0)  
out.print("You are successfully registered...");          
}catch(Exception e2) 
{
    System.out.println(e2);
}          
out.close();  
}  
}