/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.alphabets;

/**
 *
 * @author LAKSHMI NARAYANA
 */
public class eg5 {
    public static void main(String[] args){
        int i,j;
        int n=5;
        for(i=n;i>=1;i--)
        {
            for(j=n;j>=i;j--)
            {
              System.out.print((char)(j+64));   
            } System.out.println(" ");
        }
    
}
}

