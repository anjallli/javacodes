import java.io.*;
import java.util.*;
public class ArrayListA1
{
public static void main(String args[])throws Exception
{
ArrayList<Integer> s=new ArrayList<Integer>();
DataInputStream dis=new DataInputStream(System.in);
System.out.print("how many elements you want to store = ");
int n=Integer.parseInt(dis.readLine());
for(int i=1;i<=n;i++)
{
System.out.print("Enter the num = ");
int num=Integer.parseInt(dis.readLine());
Integer numOb=new Integer(num);
if(s.contains(numOb))
{
System.out.println(num+" is already present in the collection.......");
i--;
}
else
{
s.add(new Integer(numOb));
}
}
System.out.println("\nDISPLAYING ELEMENTS BEFORE SORT= "+s);
Collections.sort(s);
System.out.println("\nACEESSING ELEMENTS SEPARATLY\n");
Iterator ir=s.iterator();
while(ir.hasNext())
{
System.out.println("Element = "+ir.next());
}
}
}
