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
public class returntype {
    int a=10;
    int b=20;
   int c=52;
    
 
 void add(){
       c=c+30;
    }

    
   public static void main(String[] args){ 
    
    returntype b = new returntype();
    b.add();
    System.out.println(b.c);
    
}
   
}
