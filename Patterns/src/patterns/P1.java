import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package patterns;

/**
 *
 * @author LAKSHMI NARAYANA
 */
public class P1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int i,j;
        // TODO code application logic here
        for(i=n;i>=1;i--)
        {
            for(j=i;j>=1;j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
