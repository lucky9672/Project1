import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LAKSHMI NARAYANA
 */
public class PrimeNumbers {
  public static void main(String[] args){  
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int i,j;
      for(i=2;i<=n;i++)
      {
          for(j=2;j<i;j++)
          {
          if(i%j==0)
          {
              break;       
      }
          else if(i==j+1)
                  {
                       System.out.println(i);
                  }
                
  }
      }
  }
}

          


