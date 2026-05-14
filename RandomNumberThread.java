import java.util.Random;
class RandomNumberThread extends Thread
{
public void run()
{
Random random = new Random();
for (int i = 0; i &lt; 10; i++) {
int randomInteger = random.nextInt(100);
System.out.println(&quot;Random Integer generated : &quot; + randomInteger);
if((randomInteger%2) == 0) {
SquareThread sThread = new
SquareThread(randomInteger);
sThread.start();
}
else {
CubeThread cThread = new CubeThread(randomInteger);
cThread.start();
}
try {
Thread.sleep(1000);
}
catch (InterruptedException ex) {
System.out.println(ex);
}
}
}
}