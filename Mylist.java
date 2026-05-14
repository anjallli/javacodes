import java.io.*;
import java.util.*;

      
class MyList<T> extends ArrayList
{
	int c;

	MyList()
	{
		super();
		c=0;
	}
	MyList(int sz)
	{
		super(sz);
		c=sz;
	}

	int capacity()
	{
		return c;
	}
	
	public boolean add(Object o)
	{
		super.add(o);
		c++;
		return true;
	}
}

public class Mylist
{
	public static void main(String args[]) throws Exception
	{
		
		MyList a = new MyList();


		System.out.println(a.size());
		System.out.println(a.capacity());

		a.add("Pune");
		a.add("mumbai");
		a.add("bangore");

		System.out.println(a);

	
		System.out.println(a.capacity());

	}
}