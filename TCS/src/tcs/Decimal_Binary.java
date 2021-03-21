import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package tcs;

/**
 *
 * @author LAKSHMI NARAYANA
 */
public class Decimal_Binary {
    public static void main(String[] ags)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Decimal No:");
        int n=in.nextInt();
        String x="";
        int a;
        while(n>0)
        {
         a=n%2;
         x=x+" "+a;
         n=n/2;
        }System.out.println("Binary:"+x);
            
    }
    
}
