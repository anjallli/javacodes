import java.io.*;
import java.util.*;

public class LinkedL
{
	public static void main(String args[])
	{
	    LinkedList<String> lst = new LinkedList<String>();
	    lst.add("red");
	    lst.add("blue");
	    lst.add("yellow");
	    lst.add("green");
        
	    System.out.println("Displaying list using Iterator ");

        ListIterator ir = lst.listIterator();

        while(ir.hasPrevious())
        {
        	System.out.println("Element= " + ir.previous());

        }

        LinkedList<String> lst2 = new LinkedList<String>();
	    lst2.add("pink");
	    lst2.add("black");

        System.out.println("New Created linked list =" + lst2);
        System.out.println("Old linked list before insertion =" + lst);

        int i = lst.indexOf("blue");
        lst.addAll(i + 1, lst2);

        System.out.println("New linked list after insertion =" + lst);        

    }
}    