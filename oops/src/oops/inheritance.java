import java.util.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author LAKSHMI NARAYANA
 */
public class inheritance {
   void f1()
   {
       System.out.println("hii");
   }
       
}
 class programmer extends inheritance{
    void f2()
    {
        System.out.println("How are you");
    }
        
public static void main(String[] args){
 programmer p=new programmer();
  
p.f2();
   
    
}
}
