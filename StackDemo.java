
import java.util.*;

class StackDemo
{
	public static void main(String args[]) 
	{
	    Stack<String> s = new Stack<String>();
	    s.push("Delhi");
	    s.push("Mumbai");
	    s.push("Pune");
        
        
	    System.out.println("Elements of stack: ");

	   while(!s.empty())
	   {
	   	System.out.println(s.pop());
	   	System.out.println(s);
	   }

	}
}