package tcs;

import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package tcs;

/**
 *
 * @author LAKSHMI NARAYANA
 */
public class SpiriaMatrix {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[][] spiral=new int[n][n];
        int value=0;
        int minCol=0;
        int maxCol=n-1;
        int minRow=0;
        int maxRow=n-1;
        int i,j;
        while(value<=n*n)
        {
           for(i=minRow;i<=maxRow;i++)
           {
               spiral[minRow][i]=value;
               value++;
           }
           for(i=minCol+1;i<=maxCol;i++)
           {
               spiral[i][maxCol]=value;
               value++;
           }
           for(i=maxRow-1;i>=minRow;i--)
           {
               spiral[maxRow][i]=value;
               value++;
           }
           for(i=maxCol-1;i>=minCol+1;i--)
           {
               spiral[i][minCol]=value;
               value++;
           }
              for(i=minRow+1;i<=maxRow-1;i++)
              {
                  spiral[minRow+1][i]=value;
                  value++;
              }
              for(i=minCol+2;i<=maxCol-1;i++)
              {
                  spiral[i][maxCol-1]=value;
                  value++;
              }
              for(i=maxRow-2;i>=minRow+1;i--)
              {
                  spiral[maxRow-1][i]=value;
                  value++;
              }
              for(i=maxCol-2;i>=minRow+2;i--)
              {
                  spiral[i][minRow+1]=value;
                  value++;
              }
                 for(i=minRow+2;i<=maxRow-2;i++)
                 {
                     spiral[minRow+2][i]=value;
                     value++;
                 }
           
               
        }

                
              
          
                 for (i=0;i<spiral.length;i++)
        {
            for (j=0;j<spiral.length;j++)
            {
                System.out.print(spiral[i][j]+ " ");
            }
             
            System.out.println();

            
                
    
}
    }
}
