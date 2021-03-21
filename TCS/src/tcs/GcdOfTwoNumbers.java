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
public class GcdOfTwoNumbers {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int i,g=1;//h=0 i.e.hcf
        int n1=in.nextInt();
        int n2=in.nextInt();
        for(i=1;i<=n1||i<=n2;i++)//use || or &&
        {
           if(n1%i==0&&n2%i==0)
           
               g=i;
    }
            System.out.println("gcd of two numbers is:"+g);

    
}
    }

