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
public class factorial {
    public static void main(String[] args){
     int n,i,fact=1;
     Scanner in=new Scanner(System.in);
     n=in.nextInt();
     if(n<0)
         System.out.println("Non-negative");
     else{
    for(i=1;i<=n;i++)
        fact=fact*i;
        System.out.println(fact);
         
     }
    }
}
