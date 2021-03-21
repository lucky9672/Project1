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
public class Constructor_1 {
    int x;
    Constructor_1(int y)
    {
        x=y;
    }
    int square()
    {
       return (x*x);
       //System.out.println(square);
    }
    int cube()
    {
       return (x*x*x);
        //System.out.println(qbe);
    }
   void sum()
    {
      
     int a = square();
      int b =  cube();
   
        System.out.println(a+b);
    }
    public static void main(String[] args)
    {
        
    Constructor_1 obj=new Constructor_1(5);
    obj.square();
    obj.cube();
    obj.sum();
     
}
}
