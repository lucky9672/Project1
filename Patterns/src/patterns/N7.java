import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package patterns;

/**
 *
 * @author LAKSHMI NARAYANA
 */
public class N7 {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int i,j;
        for(i=1;i<=n;i++)
        {
         for(j=1;j<i;j++)
         {
             System.out.print(" ");
         }
         for(j=i;j<=n;j++)
         {
             System.out.print(j);
         }
         System.out.println();
        }
         for(i=n-1;i>=1;i--)
        {
         for(j=1;j<i;j++)
         {
             System.out.print(" ");
         }
         for(j=i;j<=n;j++)
         {
             System.out.print(j);
         }
         System.out.println();
        }
    }
    }
       
      