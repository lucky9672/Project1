import java.util.Scanner;
//package arrays.newpackage;

public class TwodArray {
    public static void main(String ar[])
    {
        Scanner in=new Scanner(System.in);
        //int n=in.nextInt();
        int[][] a={{1,5,6},{9,8,7}};
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                System.out.println(a[i][j]);
            }
        }
    }
    
}
