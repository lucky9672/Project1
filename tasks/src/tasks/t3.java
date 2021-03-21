import java.util.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package tasks;

/**
 *
 * @author LAKSHMI NARAYANA
 */
public class t3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        if((N%2==1)||(N%2==0&&N<=20))
        {
            System.out.println("Wired");
        }
        else if((N%2==0&&N<=5)||(N%2==0&&N>20))
        {
            System.out.println("Not Wired");
        }
        else{
            System.out.println(" ");
        }
    }

        }
    

