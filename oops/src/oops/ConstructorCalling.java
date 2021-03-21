/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oops;

/**
 *
 * @author LAKSHMI NARAYANA
 */
public class ConstructorCalling {
    int rolno;
    String name;
    float marks;
    ConstructorCalling()
    {
        System.out.println("No P");
    }
    ConstructorCalling(int r)
    {
        this();
        rolno=r;
        System.out.println("rolno= :"+rolno);
        System.out.println("1 p");
    }
     ConstructorCalling(int r1,String n)
    {
        this(25);
        rolno=r1;
        name=n;
        System.out.println("rolno= :"+rolno);
        System.out.println("name= :"+name);
        System.out.println("2 p");
    }
     ConstructorCalling(int r2,String n1,float m)
    {
        this(26,"hello");
        rolno=r2;
        name=n1;
        marks=m;
        System.out.println("rolno= :"+rolno);
        System.out.println("name= :"+name);
        System.out.println("3 p");
    }
     public static void main(String[] args)
     {
       ConstructorCalling c=new  ConstructorCalling(27,"how are you",90.02f);
       
    
}
}
