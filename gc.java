import java.io.*;

class A
{
	int i,j;
	A()
	{
	     System.out.println("I am in Constructor");
	     i=20;
	     j=10;
	}

	public void finalize()
	{
	     System.out.println("I am in Finalize");

	}
}

public class gc
{
	public static void main(String[] args) throws Exception
	{

	     A ob = new A();
	     ob = null;
         
         System.gc();
	     

	}
} 