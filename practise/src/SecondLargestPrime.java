import java.util.Scanner;
 public class SecondLargestPrime
{
    public static boolean prime(int n)
    {
        int i;
        
        int count=0;
        for(i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {
               count++; 
            }
            if(count==0 && n!=1)
            {
                
                return true;
            }
        }
        return false;
        
    }
    
            public static void main(String args[])
            {
                int c=0;
                int p=0;
                int i;
                for(int j=100;j>0;j--)
                    {
                        if(prime(j))
                        {
                            c++;
                        }
                        if(c==2)
                        {
                            p=j+1;
                            break;
                        }
                    }
                    System.out.println(p);
            }
        }

    

