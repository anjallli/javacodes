import java.io.*;

interface A
{
	public static final String s="Rutuja";
	public static final int j=20;
	public abstract void display();
}

class B implements A
{
	String p="Anjali";
	int i=10;

	public void display()
	{
		System.out.println("My friend");
		 
	}
	void show()
	{
		System.out.println(p);
		System.out.println(s);
	}
	void no()
	{
	    System.out.println(p+i);
		System.out.println(s+j);	
	}

}

 public class inter
{
	public static void main (String args[])
	{
	   
	     A oba = new B();
	     oba.display();

	     B obb = new B();
	     obb.show();
	     obb.no();

	}
}	