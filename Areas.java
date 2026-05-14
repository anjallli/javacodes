import java.io.*;

interface Shape
{
	abstract public void area(); 
    
}

class Circle implements Shape
{
	
    static final public double PI = 3.14;
    double radius;

    Circle(double radius)
    {
    	this.radius = radius; 
    }

    public void area()
    {
    	double ans = PI * radius * radius;
    	System.out.println("Area of circle: " + ans);
    }
	
}

class Rectangle implements Shape
{
	double length;
	double breadth;

	Rectangle(double length,double breadth)
	{
		this.length = length;
		this.breadth = breadth;
	}

	public void area()
	{
		double ans = length * breadth;
		System.out.println("Area of Rectangle: " + ans); 
	}
}

class Triangle implements Shape
{
	double base;
	double height;

	Triangle(double base,double height)
	{
		this.base = base;
		this.height = height;
	}

	public void area()
	{
		double ans = 0.5 * base * height;
		System.out.println("Area of Triangle: " + ans); 
	}
}


public class Areas
{
	public static void main (String args[]) throws Exception
	{
	   Circle c = new Circle(2.5);
	   c.area();
       
	   Rectangle r = new Rectangle(2,2);
	   r.area();

	   Triangle t = new Triangle(2,3);
	   t.area();

	}
}	     
	   