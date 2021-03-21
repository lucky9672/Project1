/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tasks;

/**
 *
 * @author LAKSHMI NARAYANA
 */
public class method {
    static void M1(){
        System.out.println("Welcome to java");
    }
    static int M2(){
        return(2*3+4-5*7/6+5%2);
    }
     static int M3(){
        return(2+3*5-8/2+9%2);
    }
     int M4(){
       method.M2();
       method.M3();
       int s1=method.M2();
       int s2=method.M3();
       int sum=s1+s2;
       System.out.println(sum);
       return(sum);
       }
     static String M5(){
         String s1="Satya";
         String s2="10";
         return(s1+s2);
}
     static int M6(int x,int y){
         return x+y;
     }
     static int M7(){
         int x=method.M6(-8,2);
         return x;
     }
     static double M8(int x){
     return x+2.3;
     }
     int M9(){
         double x=method.M8(0);
         int y=(int)x;
         return y;
     }
     static char M10(){
         int x=65;
         char ch=(char)x;
         return ch;
     }
     static boolean M11(int x){
       if(x>5){
           return true;
       } 
       else
       {
           return false;
       }
     }
     static boolean M12(){
         boolean x=method.M11(6);
         return x;
     }
     String M13()
     {
         boolean x=method.M12();
         String s=String.valueOf(x);
         return s;
     }
     double M14()
     {
         return 10;
     }   
     public static void main(String[] args){
         method.M1();
          System.out.println(method.M2());
           System.out.println(method.M3());
           method m = new method();
           System.out.println(m.M4());
            System.out.println(method.M5());
         System.out.println(method.M6(2,5));
         System.out.println(method.M7());
         System.out.println(method.M8(2));
         System.out.println(m.M9());
         System.out.println(method.M10());
          System.out.println(method.M11(6));
          System.out.println(m.M12());
         System.out.println(m.M13());
          System.out.println(m.M14());
}
}
