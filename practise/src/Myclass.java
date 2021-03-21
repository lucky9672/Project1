/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LAKSHMI NARAYANA
 */
public class Myclass {
   // public class Myclass{
      public static void main(String[] args){
       inner inn=new inner();
       
   inner.outerclass out=inn.new outerclass();
   System.out.println(inn.x + out.y);

    
}
  }

    

