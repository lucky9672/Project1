import java.util.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LAKSHMI NARAYANA
 */
public class armstrongnumber {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n,n1,r,sum=0;
        n=in.nextInt();
        n1=n;
        while(n!=0)
        { 
            r=n%10;
            sum=sum+(r*r*r);
            n=n/10;
        }
       
            System.out.println(sum);
        }
       
}

