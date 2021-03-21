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
public class eg6 {
    public static void main(String[] args){
    int i,j;
int n=5;
for(i=1;i<=n;i++)
{
    for(j=1;j<=i;j++)
    {
    System.out.print((char)(n-i+1+64));
}
  System.out.println(" "); 
}}
}
