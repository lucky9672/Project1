import java.util.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package practise;

/**
 *
 * @author LAKSHMI NARAYANA
 */
public class StaticMethod {
    static void cse(){
        System.out.println("Cse");
    }
    public void marks(int marks){
     System.out.println("marks is: "+ marks);   
    }
    public static void main(String[] args){
         cse();
     StaticMethod obj=new StaticMethod();
     obj.marks(200);//call a method
    
}
}
