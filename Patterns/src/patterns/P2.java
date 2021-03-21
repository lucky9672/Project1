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
public class P2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        
        int i,j;
        // TODO code application logic here
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n-i;j++){
            
                System.out.print(" ");
            }
          
               for(j=1;j<=2*i-1;j++) {
            System.out.print("*");
               }
            System.out.println();
        }
    }
    
}
   

