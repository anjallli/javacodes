import java.io.*;
import java.util.*;

public class Hashtable
{
	public static void main(String args[]) throws Exception
	{
	   Hashtable<Integer,String> ht = new Hashtable<Integer,String>();
	    ht.put(101,"AAA");
	    ht.put(102,"BBB");
	    ht.put(103,"CCC");
	    ht.put(104,"DDD");
        
        System.out.println("Hash Table: " +ht);

        Enumeration keys = ht.keys();
        while(keys.hasMoreElements())
        {
             Integer id = (Integer)keys.nextElement();
             String name = ht.get(id);
             System.out.println(id + "--->" + name);
             
        }

	}
}