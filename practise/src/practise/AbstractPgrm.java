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
abstract class AbstractPgrm {
    public String str="person";
    public int age=45;
    public abstract void study();//creating abstract method it is having no body
   
    
}
class student extends AbstractPgrm {
    public int year=2019;
    public void study(){
        System.out.println("your abstract program");
    }
}
class innerclass{
        public static void main(String[] args){
            student obj=new student();
           
           System.out.println("name: "+ obj.str) ;
           System.out.println("age: "+ obj.age);
           System.out.println("year: "+ obj.year);
           obj.study();
}
}

