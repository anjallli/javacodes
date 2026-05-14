class MythreadDemo
 {
 public static void main(String args[])
 {
 Thread t=Thread.currentThread();
 System.out.prinltn("Current Thread is:"+t);
 try
 {
 for(int n=100;n>0;n--)
 {
 System.out.println(n);
 Thread.sleep(6000);
 }
t.setName("Demo Thread");
 System.out.prinltn("After changing the name thread is :"+t);
 }
catch(InterruptedException e)
{
 System.out.println("Thread interrupted");
 }
 }}
