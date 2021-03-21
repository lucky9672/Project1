/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tcs;

/**
 *
 * @author LAKSHMI NARAYANA
 */
public class Binary_Decimal {
    public static void main(String[] args)
    {
        System.out.println("Enter Binary No:");
        String s="10011";
        int decimal=Integer.parseInt(s,2);// 2 is redix it means 2 pow 0,2 pow 1, 2 pow 2.....etc.
        System.out.println("Decimal No:"+decimal);
    }
    
}
