/* Write 'n' integers from the user and store them in a collection. Display them in the sorted order. The collection should not accept duplicate elemnets(use suitabel collection)
*/

import java.io.*;
import java.util.*;

public class Treeset2 
{
	public static void main(String args[]) throws Exception
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	    TreeSet<Integer> ts = new TreeSet<Integer>();

	     System.out.println("How many elements you want to store: ");
	     int n = Integer.parseInt(br.readLine());

	     int i = 1;

	     while(i<=n)
	     {
	          System.out.println("Enter the num: ");
	          int num = Integer.parseInt(br.readLine());
	          Integer numob = new Integer(num);

	          boolean status = ts.add(numob);
 
	          if(status == true)
                  i++;
              else
                  System.out.println(num + "is already present int the collection!");
	     }

         System.out.println("\nElements after sort: ");

         Iterator ir = ts.iterator();
         while(ir.hasNext())
         {
             System.out.println("Element= " + ir.next());
         }
	}
}