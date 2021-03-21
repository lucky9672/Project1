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
public class StringCompType4 {
    public static void main(String[] args){
        String s1="Application";
        String s2="Application";
        String s3="Applicant";
        System.out.println(s1.compareTo(s2));//s1>s2
        System.out.println(s1.compareTo(s3));//s1>s3
        System.out.println(s2.compareTo(s1));//s2>s1
        System.out.println(s3.compareTo(s1));//s3<s1
}
}
