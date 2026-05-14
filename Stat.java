/* Why we have to declare static variable?
-Sharing */

class A
{
	int i;
	static int c=3;

	A()
	{
	   i=2;
	   c++;
	}

	A(int x)
	{
        i=x;
        c++;
	}

	void display()
	{
	    System.out.println(i);

	}

	static void show()
	{
	    System.out.println("No of objects created=" +c);
	}
}

public class Stat
{
	public static void main(String Args[])
	{
	      A ob1 = new A();

	      A ob2 = new A(4);

	      ob1.display();
	      ob2.display();

	      A.show();
	}
}