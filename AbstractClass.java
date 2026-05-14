import java.io.*;

abstract class AbstractClass
{
	void f1()
	{
	    System.out.println("F1-A");
	}
	abstract void f2();
	abstract void f3();
}

class B extends A
{
	void f2()
	{
	    System.out.println("F2-B");
	}

	void f3()
	{
	    System.out.println("F3-B");
	}

	void f4()
	{
	    System.out.println("F4-B");
	}
}

public class abs
{
	public static void main(String[] args)
	{
	A oba=new B();
	oba.f1();
	oba.f2();
	oba.f3();

	B obb= new B();
	obb.f1();
	obb.f2();
	obb.f3();
	obb.f4();

	}
}