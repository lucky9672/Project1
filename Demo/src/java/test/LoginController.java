package test;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginController
 */
//@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
            /*
             String username = request.getParameter("username");
        String password = request.getParameter("password");
         
        System.out.println("username: " + username);
        System.out.println("password: " + password);
 
        // do some processing here...
         
        // get response writer
        PrintWriter writer = response.getWriter();
         
        // build HTML code
        String htmlRespone = "<html>";
        htmlRespone += "<h2>Your username is: " + username + "<br/>";      
        htmlRespone += "Your password is: " + password + "</h2>";    
        htmlRespone += "</html>";
         
        // return response
        writer.println(htmlRespone);*/
        
                String un=request.getParameter("username");
		String pw=request.getParameter("password");
		//System.out.println("exit..."); 
  
                // Terminate JVM 
                //System.exit(0); 
		// Connect to mysql and verify username password
		
		try {
		Class.forName("com.mysql.jdbc.Driver");
		 // loads driver
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/login", "root", ""); // gets a new connection
 
		PreparedStatement ps = c.prepareStatement("select email,pass from userdetails where email=? and pass=?");
		ps.setString(1, un);
		ps.setString(2, pw);
                
                // get response writer
        PrintWriter writer = response.getWriter();
         
        // build HTML code
        String htmlRespone = "<html>";
        htmlRespone += "<h2>Your username is: " + un + "<br/>";      
        htmlRespone += "Your password is: " + pw + "</h2>";    
        htmlRespone += "</html>";
         
        // return response
        writer.println(htmlRespone);
        
                
		ResultSet rs = ps.executeQuery();
 
		while (rs.next()) {
			response.sendRedirect("success.html");
			return;
		}
		response.sendRedirect("error.html");
		return;
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

