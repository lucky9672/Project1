import java.util.StringTokenizer;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package strings;

/**
 *
 * @author LAKSHMI NARAYANA
 */
public class tokanizer {
    public static void main(String[] args){
         StringTokenizer st = new StringTokenizer("all are my friends");
         while(st.hasMoreTokens()){
             System.out.println(st.nextToken());
         }
             
       
    
}
}