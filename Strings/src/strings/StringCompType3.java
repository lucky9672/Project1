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
public class StringCompType3 {
    public static void main(String[] args){
        String s1="Application";
        String s2="Application";
        String s3= new String("Application");
        String s4="Software";
        System.out.println(s1==s2);//true (because both refer to same instance)  
        System.out.println(s1==s3);//false(because s3 refers to instance created in nonpool)
        
    }
    
}
