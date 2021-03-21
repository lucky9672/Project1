import java.net.*;


class FindIP
{
public static void main(String []args)throws Exception
{
System.out.println(InetAddress.getLocalHost());
System.out.println(InetAddress.getByName("www.google.com"));
}
}
