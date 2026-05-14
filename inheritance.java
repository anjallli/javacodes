import java.io.*;

 class A
    {
        int i=29;

        void display()
        {
             System.out.println("I am in Display");
             System.out.println(i);
           
        }
    }

    class B extends A
    {
        int j=20;
         void show()
         {
             System.out.println("I am in B's show");
             System.out.println(j);
             display();
               
         }
    }

    public class inheritance
{
	public static void main(String[] args) throws Exception
	{
	     A oba = new A();
	     oba.display();

	     System.out.println("..................................");

	     B obb = new B();
	     obb.show();

	     System.out.println("..................................");

	     A tob = new B();

	     tob.display();
	}
}