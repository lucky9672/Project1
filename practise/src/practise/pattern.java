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
public class pattern {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n;
        n=in.nextInt();
        for(int i=n;i>=1;i--)
        {
            for(int j=i;j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
