import java.util.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package tasks;

/**
 *
 * @author LAKSHMI NARAYANA
 */
public class t7 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
    
        int n;
        n=in.nextInt();
        String s=Integer.toString(n);
        
        String s2="not";
        
        if((n>=-100)&(n<=100))
        {
            System.out.println("good");
        }
        else{
             System.out.println(s2);
        }
    }
        
    
}
