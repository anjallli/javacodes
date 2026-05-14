import java.io.*;

class A
{
	int i = 7;
	int j = 4;

	public String toString()
    {
        String s = "Value of i = " +i +  "Value of j = " +j;
        return s;
    }
}

public class Tostring
{
	public static void main(String[] args) throws Exception
	{
	    A ob = new A();
	    System.out.println(ob);
	}
}