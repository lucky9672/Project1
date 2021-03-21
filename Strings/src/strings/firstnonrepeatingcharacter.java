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
public class firstnonrepeatingcharacter {
    public static void main(String[] args){
        String s="bhehzgecc";
        for(int i=0;i<s.length();i++){
            boolean unique=true;
            for(int j=0;j<s.length();j++){
                if(i!=j&&s.charAt(i)==s.charAt(j)){
            
                unique=false;
                break;
                
            }
            
        }
        if(unique){
            System.out.println(s.charAt(i));
            break;//if remove break print all unique values
            
       
    }
        }
    }
}

