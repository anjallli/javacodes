import java.util.*;
class Vecdemo
{
	public static void main(String args[])
	{
	    Vector<String> v = new Vector<String>(2,3);    //capacity,capacity increment

	    System.out.println("initial Capacity= " + v.capacity());
        System.out.println("SIZE=" +v.size());    //0

        v.add("Pune");
        v.add("Delhi");
        v.add("Mumbai");

        System.out.println("After adding Capacity =" + v.capacity());    //5
        System.out.println("After adding size: " + v.size());    //3
        System.out.println("ELEMENTS OF VECTOR= " +v);

        Iterator ir = v.iterator();     // Traversing each element of vector
        while(ir.hasNext())
        {
            System.out.println(ir.next());
        }
	}
	
}
