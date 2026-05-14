import java.util.*;
import java.io.*;
public class Phonebook
{
Public static void main(String args[])
{
Try
{
FileInputStream fis=new FileInputStream(“home/desktop/myfile.txt”);
Scanner(fis).useDelimiter(“\t”);
Hashtable<String,String> ht=new Hashtable<String,String>();
String [] strarray;
String a,str;
While(sc.hasNext())
{
a=sc.nextLine();
strarray=a.split(\t”);
ht.put(strarray[0],strarray[1]);
System.out.println(“Hashtable values are:”+strarray[0]+”:”+strarray[1]);
Scanner s=new Scanner(System.in);
System.out.println(“Enter the name as given in the phone book”);
Str=s.next();
If(ht.containsKey(str))
{
System.out.println(“Phone no is:”+ht,get(str));
}
else
{
System.out.println(“Name is not Matching with the phone book”);
}
}
Catch(Exception e)
{
System.out.println(e);
}
}
}