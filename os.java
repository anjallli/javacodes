import java.io.*;

class A
{
	
}

public class os
{
	public static void main(String[] args) throws Exception
	{
	     A ob = new A();
         System.out.println(ob.getClass());
         System.out.println(ob.getClass().getSuperclass());

         os s = new os();
         System.out.println(s.getClass());
         System.out.println(s.getClass().getSuperclass());

	}
}