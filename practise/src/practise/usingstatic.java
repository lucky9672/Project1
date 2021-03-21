import java.util.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*package practise;

/**
 *
 * @author LAKSHMI NARAYANA
 */
public class usingstatic {
    static void hii()// once static is using not required to creare an object to the class
    {
        System.out.println("hii");
    }
    public void hello()
    {
      System.out.println("hello");  
    }
    public static void main(String[] args){
        hii();
       usingstatic obj=new usingstatic();
       obj.hello();
        
    }
    
}
