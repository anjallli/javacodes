import java.io.*;
class Object
{
	   static int s=11;
	   int i;

	   static void show()
	   {
	        System.out.println(s);
	   }

	   void display()
	   {
	        System.out.println(s);
	        
	   }
}

public class Object1
{
	   public static void main(String args[])
	   {
	         B.show();

	         B ob = new B();
	         ob.display();

	         ob.show();
	   }
}