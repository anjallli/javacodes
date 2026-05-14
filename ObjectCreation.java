/* Showing static block is executed before constructor*/

import java.io.*;

class ObjectCreation
{
	Block()

	{
	      System.out.println("I am in Default constructor");
	}

	static

	{
	      System.out.println("I am in static block");
	}

	}

	public class Bl
	{
	    public static void main(String args[])

	    {
	               Block ob = new Block();
	    }
}