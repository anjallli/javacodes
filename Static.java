import java.io.*;

class A
{
	
	static int s=11;
	int i;

	static void show()
	{
         System.out.println(s);
	}

	void display()
	{
	     System.out.println(s);
	     System.out.println(i);
	}
}

public class Static
{
	public static void main(String args[])
	{
	    A.show();

	    A ob=new A();
	    ob.display();

	    ob.show();
	}
}