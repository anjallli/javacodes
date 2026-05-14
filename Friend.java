import java.util.LinkedList;
import java.util.Scanner;


public class Friend {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList ll= new LinkedList();
		System.out.print("How Many Friens Name You Want to store:");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter Friends Name:");
			String name=sc.next();
			ll.add(name);
		}
		System.out.println("Friends Name :"+ll);
		
		

	}

}
