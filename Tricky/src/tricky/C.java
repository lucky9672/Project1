
class Student{
    String s="Byee";
    
}
class Employee{
    int x=10;
    
}
class School
{
    Student m1()
    {
        Student st=new Student();
         System.out.println(st.s);
        return st;
    }
    Employee m2()
    {
        Employee em=new Employee();
         System.out.println(em.x);
        return em;
        
    }
    static String m3()
    {
        String st=new String();
        st="Hii";
        System.out.println(st);
        return st;
    }
}

public class C {
    public static void main(String[] args)
    {
        School sc=new School();
        sc.m1();
        sc.m2();
        sc.m3();
    }
    
}
