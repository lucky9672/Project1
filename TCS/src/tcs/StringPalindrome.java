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
public class StringPalindrome {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
                 String original,reverse;
                 original=in.next();
                 reverse="";
                 int a=original.length();
                 for(int i=a-1;i>=0;i--)
                 {
                     reverse=reverse+original.charAt(i);
                 }
                     if(reverse.equalsIgnoreCase(original))
                     {
                         System.out.println("is palindrome");
                     }
                     else
                     {
                      System.out.println("is not a palindrome"); 
                     }
                 }
}
