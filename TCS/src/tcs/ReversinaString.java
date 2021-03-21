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
public class ReversinaString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.next();
        String reverse=" ";
        // TODO code application logic here
        for(int i=str.length()-1;i>=0;i--)
        {
            reverse=reverse+str.charAt(i);
    }
                System.out.println("Enter a string");
        System.out.println(reverse);   
}
}
