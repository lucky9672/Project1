import java.util.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package strings;

/**
 *
 * @author LAKSHMI NARAYANA
 */
public class reversingStringWithMetod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        String str=in.nextLine();
        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb.reverse().toString());
    }
    
}
