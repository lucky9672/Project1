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
public class convertingCharToStr {
    public static void main(String[] args){
        String str1="All";//creating string by java string literals
       char ch[]={'a','r','e',' ','m','y'};
       String s2=new String(ch);
       String s3=new String("Friends");//creating java string by new key woard
       System.out.println(str1+" "+s2+" "+s3);
    }
    
}
