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
public class firstnonrepeatingcharacterEg2 {
    public static void main(String[] args){
        String s="vbhbbccd";
        for(char ch:s.toCharArray())
        {
            if(s.indexOf(ch)==s.lastIndexOf(ch)){
                System.out.println(ch);
                break;
            }
        }
            
    }
}
