//package com.javatpoint.servlets;  
package test;
import java.io.IOException;  
import java.io.PrintWriter;  
import java.util.List;  
import javax.servlet.ServletException;  
import javax.servlet.annotation.WebServlet;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
//import test.*; 
//import com.javatpoint.dao.EmpDao;  
@WebServlet("/ViewServlet")  
public class ViewServlet extends HttpServlet {  
    private static final long serialVersionUID = 1L;  
    protected void doGet(HttpServletRequest request, HttpServletResponse response)   
           throws ServletException, IOException {  
        response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
        String spageid=request.getParameter("page");  
        int pageid=Integer.parseInt(spageid);  
        int total=5;  
        if(pageid==1){}  
        else{  
            pageid =pageid-1;  
            pageid =pageid*total;  
        }  
        int cnt = EmpDao.getCount(); 
        cnt = (cnt%10)+1;
        List<Emp> list=EmpDao.getRecords(pageid,total);  
        out.print("<h1>Page No: "+spageid+"</h1>");  
        out.print("<table border='1' cellpadding='4' width='60%'>");  
        out.print("<tr><th>Id</th><th>Name</th><th>Salary</th>");  
        for(Emp e:list){  
            out.print("<tr><td>"+e.getid()+"</td><td>"+e.getname()+"</td><td>"+e.getsalary()+"</td></tr>");  
        } 
        out.print("</table>");  
        for(int i=1;i<=cnt;i++){
            out.print("<a href='ViewServlet?page="+i+"'>"+(i)+"</a> ");
        }
        //out.print("<a href='ViewServlet?page=1'>1</a> ");  
        //out.print("<a href='ViewServlet?page=2'>2</a> ");  
        //out.print("<a href='ViewServlet?page=3'>3</a> ");   
        out.close();  
    }  
}  