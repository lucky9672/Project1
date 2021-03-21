package strings;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LAKSHMI NARAYANA
 */
public class StringcompType2 {
    public static void main(String[] args){
          String s1="application";
          String s2="application";
          String s3=s2.toUpperCase( );
          String s4="HELLO";
          System.out.println(s1.equals(s3));
          System.out.println(s1.equalsIgnoreCase(s3));
            System.out.println(s1.equalsIgnoreCase(s4));
}
}
