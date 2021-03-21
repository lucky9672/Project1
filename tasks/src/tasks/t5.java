import java.util.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package tasks;

/**
 *
 * @author LAKSHMI NARAYANA
 */
public class t5 {
    static boolean flag = true; static int B,H;

static{

Scanner scan = new Scanner(System.in);
B = scan.nextInt();
scan.nextLine();
H = scan.nextInt();
scan.close();
if((B<=0 && H<=0)||(B>=0 && H>=0)){
    flag = true;

}else if((B<=0 && H>=0)||(B>=0 && H<=0)){
    flag=false;
    System.out.println("java.lang.Exception: Breadth and height must be positive");
}
}
    

public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main
}

//end of class

