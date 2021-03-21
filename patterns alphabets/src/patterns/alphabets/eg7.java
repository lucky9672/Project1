import java.util.*;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package patterns.alphabets;

/**
 *
 * @author LAKSHMI NARAYANA
 */
public class eg7 {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int i,j;
        int n=in.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n-i;j++)
            {
                System.out.printf(" ");
            }
               for(j=1;j<=i;j++)
               {
                 System.out.printf("%c",(char)(j+64)); 
               }
               for(j=i-1;j>=1;j--)
               {
                System.out.printf("%c",(char)(j+64)); 
               }
               System.out.println(" ");
    
}
    }
}
