
import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package tricky;

/**
 *
 * @author LAKSHMI NARAYANA
 */
public class A {
    public static void main(String[] args)
    {
    int x, y;

      System.out.println("Enter x and y");

      Scanner in = new Scanner(System.in);

  

      x = in.nextInt();

      y = in.nextInt();

  

      System.out.println("Before Swapping\nx = "+x+"\ny = "+y);

  

      x = x + y;

      y = x - y;

      x = x - y;

  

      System.out.println("After Swapping without third variable\nx = "+x+"\ny = "+y);
    }
}


