import javax.servlet.*;
import java.io.*;//for PrintWriter object
public class MyServlet implements Servlet {
 public void init(ServletConfig config)throws ServletException{
 }
 public void destroy(){
 }

 public ServletConfig getServletConfig(){
 return null;
 }
 
 public String getServletInfo(){
   return null;
 }
 public void service(ServletRequest request,ServletResponse response)
 throws ServletException,IOException{
  response.setContentType("text/html");
  PrintWriter out=response.getWriter();
  out.println("<h3>Hello World !</h3>");
 }
}