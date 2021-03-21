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
public class Fibbonacci {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
    
        int n=in.nextInt();
        int f1=0;
        int f2=1;
        for(int i=0;i<n;i++)
        {
            System.out.println(f1+" ");
        
            int sum=f1+f2;
            f1=f2;
            f2=sum;
        }
    }
}
