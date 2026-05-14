import java.util.*;
class HashMapDemo
{
Public static void main(String args[])
{
HashMap <Interger,String> ha=new HashMap<Interger,String>();
ha.put(10,”Java”);
ha.put(20,”Operating System”);
ha.put(30,”SoftwareTesting Tools”);
ha.put(40,”Complier Constructor”);
ha.put(50,”Web Technologies”);
System.out.println( “Before Sorting:”);
Set set=ha.entrySet();
Iterator it=set.iterator();
While(it.hasNext())
{
Map.Entry me=(Map.Entry)it.next();
System.out.print(me.getKeys()+”:”);
System.out.println(me.getValues());
}
Map<Integer,String> map=new HashMap<Integer,String>(hm);
System.out.println(“After Sorting:”);
Set set1=map.entrySet();
Iterator it2=set2.it();
While(it2.hasNext())
{
Map.Entry me2=(Map.Entry)it2.next();
System.out.print(me2.getKeys()+”:”);
System.out.prinln(me2.getValues());
}
}
}
