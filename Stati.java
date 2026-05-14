import java.io.*;

class A
{
	
	static int j=33;
	int p=4;

	static void show()
	{
         System.out.println(j);
	}

	void display()
	{
	     System.out.println(p);
	     System.out.println(j);
	}
}

public class Stati
{
	public static void main(String args[])
	{
		A.show();
		A ob = new A();
	    ob.display();
        
	   
	}
}