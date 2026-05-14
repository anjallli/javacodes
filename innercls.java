class A
{
	int i=11;
	static int s=3;

    class B
    {
        int j=6;

        void dispB()
        {
             System.out.println("disp-B");
             System.out.println("Value of i=" +i);
             System.out.println("Value of j=" +j);
        }
    }

    void dispA()
    {
         System.out.println("disp-A");
         System.out.println("Value of i=" +i);
    }
}

public class innercls
{
	public static void main(String[] args)
	{
	     A aob = new A();
	     aob.dispA();

	     A.B bob = new A().new B();
	     bob.dispB();
	}
}
