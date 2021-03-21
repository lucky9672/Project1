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
public class encapsulation {
    private String name;
    private int age;
    private int year;
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public int getYear()
    {
        return year;
    }
    public void setName(String newName){
        name=newName;
    }
    
     public void setAge(int newAge){
       age=newAge;
    }
      public void setYear(int newYear){
        year=newYear;
    }
}
     

