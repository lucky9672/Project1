/*
 *  A   To change this license header, choose License Headers in Project Properties.
 * BA  To change this template file, choose Tools | Templates
 *CBA  and open the template in the editor.
 */
package patterns.alphabets;

/**
 *
 * @author LAKSHMI NARAYANA
 */
public class eg4 {
    public static void main(String[] args)
    {
        int i,j;
        int n=5;
        for(i=1;i<=n;i++)
        {
            for(j=i;j>=1;j--)
            {
                System.out.print((char)(j+64));
            }
            System.out.println(" ");
        }
    }
    
}
