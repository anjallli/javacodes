import java.io.*;
import java.util.*;

public class Demo2
{
	public static void main(String args[]) throws Exception
	{
	    LinkedList<String> l = new LinkedList<String>();
	    l.add("red");
	    l.add("blue");
	    l.add("yellow");
	    l.add("green");
        
        ListIterator i = l.listIterator();
	    System.out.println("Forward Direction: ");

	    while(i.hasNext())
	    {
	    	System.out.println(i.next());
	    }
        
        System.out.println("Backward Direction: ");

        while(i.hasPrevious())
        {
        	System.out.println(i.previous());
        }

        LinkedList<String> l2 = new LinkedList<String>();
        l2.add("Pink");
        l2.add("Black");

        System.out.println("Before: " +l);
        int j = l.indexOf("blue");

        l.addAll(j+1, l2);

        System.out.println("After: " +l);
	}
}