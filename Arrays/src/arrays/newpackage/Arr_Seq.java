/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays.newpackage;

/**
 *
 * @author LAKSHMI NARAYANA
 */
public class Arr_Seq {
    public static void main(String args[])
    {
        int[] a={1,9,3};
        int[] b={2,8,5};
        int s=0;
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<b.length;j++)
            {
                if(a[i]>a[j])
                {
                   s=a[j]; 
                }
                System.out.print(s+" ");
            }
        }
    }
    
}
