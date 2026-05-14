import java.util.ArrayList;
import java.util.Scanner;


public class Name {

	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList al = new ArrayList();
		System.out.print("How Many City You want to Store:");
		int city=sc.nextInt();
		for(int i=0;i<city;i++)
		{
			System.out.print("Enter City Name:");
			String cityname=sc.next();
			al.add(cityname);
			
			
		}
		System.out.println("City Name:" +al);
		al.removeAll(al);
		System.out.println("All Elements are removed" + al);
		

	}

}
