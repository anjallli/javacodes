import java.io.*;

class A
{
	int i;
	int j;

	A()
	{
	  i= -1;
	  j= -1;
	}

	A(int x, int y)
	{
	  i=x;
	  j=y;

    }

    A(A temp)
    {
       i=temp.i;
       j=temp.j;
    }

    void display()
    {
       System.out.println(i);
       System.out.println(j);
    }
}

public class Cons
{
	public static void main(String args[])
	{
	    A ob1 = new A();
	    A ob2 = new A(5,7);
	    A ob3 = new A(ob1);

	    ob1.display();
	    System.out.println(".....................");

        ob2.display();
	    System.out.println(".....................");
        
        ob3.display();
	  
	}
}

