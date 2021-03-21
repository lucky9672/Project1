import java.util.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package practise;

/**
 *
 * @author LAKSHMI NARAYANA
 */
public class usingFinal {
     int x=12;// if we take int,it is possible to assign a value
    public static void main(String[] args){
    usingFinal obj=new  usingFinal();
    obj.x=24; // cannot assign a value to " final"
    System.out.println(obj.x);
    
    }
    
    
}
