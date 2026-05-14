
import java.util.*;

class Qdemo
{
	public static void main(String args[]) 
	{
	    Queue q = new LinkedList();
	    q.add("Delhi");
	    q.add("Mumbai");
	    q.add("Pune");
	    q.add("Banglore");
        
         System.out.println("Elements of Queue: ");
 
         Iterator ir = q.iterator();
         while(ir.hasNext())
	     {
	   	 System.out.println(ir.next());
	     }
         
         System.out.println("First Element: " +q.peek());
         System.out.println("Deleted Element: " +q.remove());
         System.out.println("Deleted Element: " +q.remove());
         System.out.println("Elements of queue: " +q);

	}
}