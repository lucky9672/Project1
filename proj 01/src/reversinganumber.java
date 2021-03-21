
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
public class reversinganumber {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, r, sum = 0;
        n = in.nextInt();

        while (n > 0) {
            r = n % 10;
            sum = (sum * 10) + r;
            n = n / 10;

        }
        System.out.print("n value=" + sum);
    }

}
