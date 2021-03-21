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
public class temparaturetofohraneheit {
    public static void main(String[] args){
      float temparature;
      Scanner in=new Scanner(System.in);
      temparature=in.nextFloat();
      temparature=(((temparature-32)*5)/9);
      System.out.println("temparature in celsius= " + temparature);
    
}
}
