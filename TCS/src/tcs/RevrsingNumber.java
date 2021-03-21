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
public class RevrsingNumber {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int sum=0;
        int r;
        while(n!=0)
        {
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }System.out.println(sum);
        
    }
}
