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
public class StringUnic {
    public static void main(String[] args) 
    {
        String[] names1 = new String[] {"Ava", "Emma", "Olivia"};
        String[] names2 = new String[] {"Olivia", "Sophia", "Emma"};
        String[] Names = mergeNames(names1, names2);
        for(String n: Names)
            System.out.print(" "+ n);
    }

    public static String[] mergeNames(String[] n1, String[] n2)
    {
        Set<String> mySet1 = new HashSet<String>(Arrays.asList(n1));
        Set<String> mySet2 = new HashSet<String>(Arrays.asList(n2));
        Set<String> union = new HashSet<String>(mySet1);
        union.addAll(mySet2);
        return  union.toArray(new String[union.size()]);
    }
}
    

