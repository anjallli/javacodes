import java.io.*;

class C
{
	 int i;
	 static int c=0;

	 C()
	 {
	    i=0;
	    c++;
	 }
	 C(int x)
	 {
	    i=x;
	    c++;
	 }

	 void display()
	 {
	    System.out.println(i);
	 }
	 static void show()
	 {
	    System.out.println("NO. of objects created ="+c);
	 }
}

public class Com
{
	public static void main(String args[])
	{

	          C ob1 = new C();
	          C ob2 = new C();

	          ob1.display();
	          ob2.display();

	          C.show();
	}
}