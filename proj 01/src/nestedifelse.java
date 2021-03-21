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
public class nestedifelse {
    public static void main(String[] args){
        int gainingMarks,passingMarks;
        char grade;
        passingMarks=35;
        Scanner in=new Scanner(System.in);
        gainingMarks=in.nextInt();
        if(gainingMarks >=passingMarks ){
            if(gainingMarks>=90)
                grade='A';
            else if(gainingMarks>=70)
                grade='B';
             else if(gainingMarks>=65)
                grade='C';
            else
                 grade='D';
            System.out.println("your grade is "+ grade);
}
        else{
            grade='F';
           System.out.println("your grade is "+ grade); 
        }
    }}

