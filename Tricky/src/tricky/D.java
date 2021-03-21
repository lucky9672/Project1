
 class P
 {
     
 }
 class Q extends P
 {
     
 }
 class R extends Q
 {
     
 }
 class S
 {
     void m1(P p)
     {
         System.out.println("P class");
     }
      void m1(Q q)
     {
         System.out.println("Q class");
     }
       void m1(R r)
     {
         System.out.println("R class");
     }
 }
public class D {
    public static void main(String[] args)
    {
        S obj=new S();
        P p=new P();
        obj.m1(p);
        Q q=new Q();
        obj.m1(q);
        R r=new R();
        obj.m1(r);
       //obj.m1(null);
    }
    
}
