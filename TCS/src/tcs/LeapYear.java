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
public class LeapYear {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int y=in.nextInt();
        if(y%4==0||y%100==0||y%400==0)
        {
            System.out.println("is a leap year");
        }
        else
        {
         System.out.println("is not a leap year");   
        }
    }
    
}
