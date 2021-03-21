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
public class MidSum {
    public static void main(String[] args)
    {
        Scanner in= new Scanner(System.in);
        int n=in.nextInt();
        int sum=0;
        int n1=n/10;
        int n2=n1%10;
        sum=sum+n2;
      for(int i=1;i<=2;i++)
      {
          n=n/10;
      }
      int fn=n%10;
      System.out.println(sum+fn);
}
}
