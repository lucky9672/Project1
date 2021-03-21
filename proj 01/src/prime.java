import java.util.*;
public class prime {
  public static void main(String[] args){  
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int i,j;
      for(i=2;i<=n;i++)
      {
          for(j=2;j<i;j++)
          {
          if(i%j==0)
          {
              break;       
      }
          else if(i==j+1)
                  {
                       System.out.println(i);
                  }
                  
  }
      }
      
  }
}

          

