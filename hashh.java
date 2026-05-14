import java.io.*;
import java.util.*;

public class hashh 
{
	public static void main(String args[]) throws Exception
	{
	    LinkedHashSet h = new LinkedHashSet();
	    h.add("Delhi");
	    h.add("Mumbai");
	    h.add("Pune");
        h.add("Pune");
        h.add("Banglore");
        
        System.out.println("Linked Hash Set: " +h);

        HashSet hs = new HashSet();
        hs.add("Pune");
        hs.add("Pune");
        hs.add("Mumbai");
        hs.add("Delhi");
        hs.add("Benglore");
	    System.out.println("Hash Set: " +hs);


	}
}