/* Design a Circle class to calculate Area of circle
Use appropriate constructs[Using final keyword]*/

import java.io.*;

class Circle
{
	static final double PI=3.14;
	double radius;

	Circle(double radius)
	
	{
	     this.radius=radius;

	}

	double getArea()
	{
	     return(Circle.PI*radius*radius);
	}

	public class Areaofcircle
	{
	     public static void main(String[] args) throws Exception
	     {
	         BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

	         System.out.println("Enter radius to Calculate area of circle:");
	         double r = Double.parseDouble(br.readLine());

	         Circle c = new Circle(r);

	         double ans = c.getArea();

	         System.out.println("Area of Circle:" + ans);
	     }
	}
}