import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package oops;

/**
 *
 * @author LAKSHMI NARAYANA
 */
class User
{
    void register()
    {
        System.out.println("register() of user");
    }
    void login()
    {
       System.out.println("login() of user"); 
    }
}
class FreeJobSeeker extends User
{
    void searchForJob()
    {
        System.out.println("SerchForJob () of FreeJobSeeker");
    }
        void login()
        {
            System.out.println("login() of FreeJobSeeker");
        }
        
}
class PaidJobSeeker extends User
{
    void payment()
    {
       System.out.println("payment() of PaidJobSeeker");
    }
}
class JobProvider extends User
{
    void addJob()
    {
      System.out.println("addJob() of JobProvider");   
    }
}
public class UpcastingDowncasting {
    public static void main(String[] args) throws Exception
    {
        Scanner in=new Scanner(System.in);
         System.out.println("Enter Class Name :");
         String sname=in.next();
         Class c=Class.forName(sname);
         Object obj=c.newInstance();
         User u=(User)obj;
         u.login();
         if(u instanceof FreeJobSeeker)
         {
             FreeJobSeeker fjs=(FreeJobSeeker)u;
             fjs.searchForJob();
             
             
         }
          if(u instanceof PaidJobSeeker)
         {
             PaidJobSeeker pjs=(PaidJobSeeker)u;
             pjs.payment();
             
         }
           if(u instanceof JobProvider)
         {
             JobProvider jp=(JobProvider)u;
             jp.addJob();
             
         }
         
    }
    
}
