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
public class polymorphism {
    public void animal(){
        System.out.println("H");
    }
}
    class dog extends polymorphism{
        
    public void animal(){
        System.out.println("E");
    }
    
}

class cat extends polymorphism{
        
    public void animal(){
        System.out.println("LL");
    }
    
}
class mainclass{
    public static void main(String[] args){
     polymorphism obj=new polymorphism();//create polymorphism object
     polymorphism mydog=new dog();//creating dog object
     polymorphism mycat=new cat();//creating cat object
     obj.animal();
     mydog.animal();
      mycat.animal();
     
    }
}

