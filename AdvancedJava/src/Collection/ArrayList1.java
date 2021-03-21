import java.util.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package Collection;

/**
 *
 * @author LAKSHMI NARAYANA
 */
public class ArrayList1 {
    public static void main(String[] args)
    {
        List<String> al=new ArrayList<String>();
        al.add("hii");
        al.add("How");
        al.add("are");
        al.add("You");
        ListIterator<String> itr=al.listIterator();
        while(itr.hasNext())
        {
            System.out.println("index:"+itr.nextIndex()+" value:"+itr.next());
        }
        System.out.println("previous");
         while(itr.hasPrevious()){    
          
        System.out.println("index:"+itr.previousIndex()+" value:"+itr.previous());    
        }    
    }
    
}
