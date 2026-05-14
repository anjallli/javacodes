import java.util.*;
import java.io.*;
public class LinkedListDemo
{
Public static void main(String args[])throws Exception
{
int n;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
LinkedList li=new LinkedList();
System.out.println(“\Enter number of your friends:”);
n=Interger.parseInt(br.readLine()));
System.out.println(“\Enter your friends names:”);
for(int i=1;i<=n;i++)
{
li.add(br.readLine());
}
System.out.println(“\Linked List content is:”);
}
}
