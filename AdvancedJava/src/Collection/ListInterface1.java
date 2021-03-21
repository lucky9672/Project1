import java.util.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package Collection;

/**
 *
 * @author LAKSHMI NARAYANA
 */
public class ListInterface1 {
    public static void main(String[] args)
    {
        List al=new ArrayList();
         System.out.println("first index");
        al.add("a");
        al.add("b");
        al.add("c");
        al.add("d");//[a,b,c,d]
        al.add(1,"x");//[a,x,b,c,d]
        al.set(2,"y");//[a,x,y,c,d];old value can be removed in that place new value is added
        al.add(null);//[a, x, y, c, d, null]
        al.remove(5);//[a, x, y, c, d}
         System.out.println(al);
        List al2=new ArrayList();
         System.out.println("Second index");
         al2.add("p");
        al2.add("q");
        al2.add("r");
         System.out.println(al2);
         al.addAll(2,al2);// in 0 index what ever it is it prints firest then prints all in accesnding order
          System.out.println(al);//[a, x, p, q, r, y, c, d]
         
        
    }
    
}



















