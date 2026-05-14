import java.util.HashMap;
import java.util.Hashtable;
import java.util.Scanner;


public class Contact {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Hashtable<String,Long>ht=new Hashtable<String,Long>();
		for(int i=0;i<3;i++)
		{
			System.out.print("Enter Name:");
			String name=sc.next();
			System.out.print("Enter Contact No:");
			long no=sc.nextLong();
			ht.put(name,no);
			
		}
		System.out.println("Displaying Hashtable:"+ht);
		
		
		

	}

}
