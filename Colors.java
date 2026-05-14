import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;


public class Colors {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	Set ts=new TreeSet();
	for(int i=0;i<3;i++)
		
	{
		System.out.print("Enter Color:");
		String color=sc.next();
		ts.add(color);
	}
	
	System.out.println("Colors are:"+ts);
	

	}

}
