Import java.io.*;
Import java.lang.String.*;

Class TestPrint extends Thread
{
String msg=””;
int n;
TestPrint(String msg,int n)
{
this.msg=msg;
this.n=n;
}
Public void run()
{
Try
{
For(int i=1;i<=n;i++)
{
System.out.println(msg+” “+i+”times”);
}
System.out.println(“\n”);
}
Catch(Exception e)
{
}}}

Class DemoMythread
{ 
Public static void main(String args[]);
{
Int n = Integer.parseInt(args[0])

TestPrint t1=new TestPrint(“COVID”,n);
T1.start();
TestPrint t2=new TestPrint(“LOCKDOWN2020”,n+10);
T2.start();
TestPrint t3=new TestPrint(“Vaccinated2021”,n+20);
T3.start();
}
}
