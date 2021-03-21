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
public class Array {
    public static void main(String[] args) throws Exception
    {
        Scanner in=new Scanner(System.in);
      //int n=in.nextInt();
      int a[]={12,15,45,15,12};
      
      int i,j;
      
      for(i=0;i<a.length-1;i++)
      {
          
          for(j=1;j<a.length;j++)
          {
             if(a[i]!=a[j])
             {
            
               System.out.println(a[i]);
             }
             
          }
      }
      
        
}
}

