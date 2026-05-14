import java.io.*;

Class A

{
	int i=11;
	A()

	{
	    this(-1);
	}

	A(int i)
	
	{
	   this.i=i;
	}

	void display()
	{
	    int i=33;
	    System.out.println(this.i);
	    System.out.println(i);
	    show();
	    this.show();
	}
	void show()
	{
	    System.out.println("I am in show!!");
	}
}

public class Demo
{
	public static void main(String args[])
	{
	       A ob1=new A();
	       ob1.display();
	       System.out.println(".......................");
	       A ob2=new A(5);
	       ob2.display();
	}
}