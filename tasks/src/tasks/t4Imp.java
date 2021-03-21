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
public class t4Imp {
   
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for(int j = 0; j < n; j++){
                a = a + (int)Math.pow(2,j)*b;
                System.out.print(a + " ");
            }
            System.out.println("");
        }
        
    }
}
    

