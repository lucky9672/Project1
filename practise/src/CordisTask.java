import java.util.*;
public class CordisTask
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a Your input :");
		Scanner sc= new Scanner(System.in);
		int input=sc.nextInt();
		double k=input;
		int count=0,v=0;
		int [] a=new int[10];
		for(int i=0;;i++)
		{
		    if(Math.pow(5,i) <= input)
		    {
		       a[i]= (int)Math.pow(5,i);
		        count++;
		    }
		    else
                    {
		        break;
                    }
		}
		
		for(int j=count-1;j>=0;j--)
		{
		    if(a[j]<=k)
		        {
		            k=k-a[j];
		            if(k==0)
		                {
		                    System.out.println("Passed"); 
		                    v++;
		                    break;
		                }
		            else
		                continue;
		        }
		       
		}
		 if(v==0)
		            System.out.println("Failled"); 
	}
}
