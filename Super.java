import java.io.*;

 class A
    {
        int i;

        A();
        {
            int i=10;
        }

        A(int x)
        {
            int i=x;
        }

        void display()
        {
             System.out.println("I am in A's Display");
             System.out.println(i);
           
        }
    }

    class B extends A
    {
        int j;

        B()
        {
            super();
            j=18;
        }

        B(int x, int y)
        {
            super(x);
            j=y;
        }

         void display()
         {
             super.display();
             System.out.println("I am in B's display");
             System.out.println(j);
             
               
         }
    }

    public class Super
{
	public static void main(String args[]) throws Exception
	{
	   
	     B obb = new B();
	     obb.display();
         System.out.println("..................................");

	     A tob = new B(44,33);
         tob.display();
	}
}