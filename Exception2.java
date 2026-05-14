class A
{
	
	void display() throws ArithmeticException
	{
	      double ans = 16/0;
	}
}

public class Exception2
{
	public static void main(String args[]) throws Exception
	{
           A ob = new A();
           ob.display();

           System.out.println("End of main!!!");
	}
}	           
