import java.util.Scanner;
public class B {
    int a=20,b=30, c;
    //System.out.println(a+" "+b);
    
    int function(int a,int b)
    {
      return(a+b);
   
       
    }
    
    public static void main(String[] args)
    {
        B ob=new B();
    int x= ob.function(2,3);
       System.out.println(x);
    }
    
}

