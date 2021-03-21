/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oops;

/**
 *
 * @author LAKSHMI NARAYANA
 */
public class Constructor {
    int rolNo;
    float empSalary;
    String empName;
    Constructor(int r,float s,String n)
    {
        rolNo=r;
        empSalary=s;
        empName=n;
        
}
    void disp()
    {
        System.out.println(rolNo+" "+empSalary+" "+empName);
    }
    public static void main(String[] args)
    {
        Constructor c=new Constructor(10,50.3f,"satya");
        c.disp();
    }
}
