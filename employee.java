
class employee
{
	int emp ID = 5;
	void showEmpID()
	{
	     System.out.println(empID);
	}
}

class company
{
	public static void main(String args[])
	{
	     employee e; 
	     e = new employee();
	     e.showEmpID();
	}
}