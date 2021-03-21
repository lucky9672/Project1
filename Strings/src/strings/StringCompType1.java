/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings;

/**
 *
 * @author LAKSHMI NARAYANA
 */
public class StringCompType1 {
      public static void main(String[] args){
          String s1="application";
          String s2="application";
          String s3=new String("application");
          String s4="Software";
          System.out.println(s1.equals(s2));//true
          System.out.println(s1.equals(s3)); //true
           System.out.println(s1.equals(s4));//false
}
}
