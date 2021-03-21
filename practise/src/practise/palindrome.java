import java.util.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package practise;

/**
 *
 * @author LAKSHMI NARAYANA
 */
public class palindrome {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n,r=0,t;
        n=in.nextInt();
        t=n;
        while(t!=0){
         r=r*10;
         r=r+t%10;
         t=t/10;
         
        }
        System.out.println(r);
    }
}
