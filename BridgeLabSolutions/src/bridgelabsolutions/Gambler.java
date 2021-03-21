import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package bridgelabsolutions;

/**
 *
 * @author LAKSHMI NARAYANA
 */
public class Gambler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in=new Scanner(System.in);
        int initial=in.nextInt();
        int goal=in.nextInt();
        int trails=in.nextInt();
        int bets=0;
        int wins=0;
        int cash=initial;
        for(int t=0;t<trails;t++)
        {
        while(cash>0 && cash<goal)
        {
            bets++;
            if(Math.random()<0.5)
            {
                cash++;
                }
            else{
                  cash--;
                }
            
        }
        if(cash==goal)
        {
            wins++;
        }
    }
        System.out.println(wins+"wins of"+trails);
        System.out.println("percentage of games won="+100.0 * wins/trails);
        System.out.println("Avarage # bets="+1.0 * bets/trails);
    }
    
}
