import java.io.*;
class A
{
	void display() throws ArithmeticException
	{
	     try
	     {
	          int ans = 16/0;
	          System.out.println("End of A's Try!!!");
	     }
	     catch(NumberFormatException ne)
	     {
	           ne.printStackTrace();
	     }
	     finally
	     {
	           System.out.println("End od A's Finally!!!");     
	     }

	     System.out.println("End of display!!!");
	}
}

public class Exception1
{
	public static void main(String args[]) throws Exception
	{
           A ob = new A();
           ob.display();

           System.out.println("End of main!!!");
	}
}	    	    