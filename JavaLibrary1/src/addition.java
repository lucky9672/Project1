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
public class addition {
    public void add(){ 
    int a,b;
    Scanner in=new Scanner(System.in);
    a=in.nextInt();
    b=in.nextInt();
   b+=a;
    System.out.println(b);
    
}
 public static void main(String []args){
 addition obj=new  addition();//return type
obj.add();
 }
}
