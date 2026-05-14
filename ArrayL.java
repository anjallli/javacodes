import java.io.*;
import java.util.*;

public class ArrayL
{
	public static void main(String args[]) throws Exception
	{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	    System.out.println("How many cities: ");
	    int n = Integer.parseInt(br.readLine());

	    ArrayList<String> aob = new ArrayList<String>();

	    for(int i = 1; i <= 1; i++)
	    {
	        System.out.println("Enter city: ");
	        String c = br.readLine();

	        aob.add(c);
	    }

	    System.out.println("Data: " + aob);

	    Iterator iob = aob.iterator();

	    while(iob.hasnext())
	    {
	         String name = (String) iob.next();
	
	    }

	}
}