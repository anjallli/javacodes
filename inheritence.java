import java.io.*;

 class A
    {
        int i=11;

        void display()
        {
             System.out.println("I am in A's Display");
             System.out.println(i);
           
        }
    }

    class B extends A
    {
        int j=10;
         void display()
         {
             super.display();
             System.out.println("I am in B's display");
             System.out.println(j);
             
               
         }
    }

    public class inheritence
{
	public static void main(String[] args) throws Exception
	{
	     A oba = new A();
	     oba.display();
         System.out.println("..................................");

	     B obb = new B();
	     obb.display();
         System.out.println("..................................");

	     A tob = new B();
         tob.display();
	}
}