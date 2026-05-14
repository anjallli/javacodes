
interface A
{
	public static final String x="Anjali";
	public static final int i=1;
    

}

interface B
{
	public static final String y="Rutuja";
	public abstract void display();
	public abstract void show();
}

class C implements A,B
{
	String z="Shashi";
    int j=2;
    int k=3;

    public void display()
    {
    	System.out.println(i);
    	System.out.println(j);
    	System.out.println(k);
    }

    public void show()
    {
    	System.out.println(x);
    	System.out.println(y);
    	System.out.println(z);
    }
	
}

public class Interface1
{
	public static void main (String args[])
	{
	   
	     A oba = new C();
	    
         C obb = new C();
         obb.display();
         obb.show();

	}
}	