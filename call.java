
import java.io.*;
import java.text.SimpleDateFOrmat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Calendar;

public class call
{
	public static void main(String args[]) throws Exception
	{
	      Date d = new Date();

	      SimpleDateFormat sdf = null;
	      String str = null;

	      sdf = new SimpleDateFormat("dd/MM/yyyy");
	      str = sdf.format(d);
	      System.out.println("Current Date is:" +str);
       
          sdf = new SimpleDateFormat("MM-dd-yyyy");
	      str = sdf.format(d);
	      System.out.println("Current Date is:" +str);

	      sdf = new SimpleDateFormat("E,MMM dd yyyy");
	      str = sdf.format(d);
	      System.out.println("Current Date is:" +str);

	      sdf = new SimpleDateFormat("E,MMM MM HH:mm:ss z yyyy");
	      str = sdf.format(d);
	      System.out.println("Current Date & Time is:" +str);

	      sdf = new SimpleDateFormat("MM/dd/yy hh:mm:ss a Z");
	      str = sdf.format(d);
	      System.out.println("Current Date & Time is:" +str);

	      sdf = new SimpleDateFormat("HH:mm:ss");
	      str = sdf.format(d);
	      System.out.println("Current Date is:" +str);

	      Calendar cal= new GregorianCalendar();

	      int weekOfYear  = cal.get(Calendar.WEEK_OF_YEAR);
	      int weekOfMonth = cal.get(Calendar.WEEK_OF_MONTH);
	      int dayOfYear   = cal.get(Calendar.DAY_OF_YEAR);
	      int dayOfMonth  = cal.get(Calendar.DAY_OF_MONTH);

	      System.out.println("Week of Year:" + weekOfYear);
	      System.out.println("Week of Month:" + weekOfMonth);
	      System.out.println("Day of Year:" + dayOfYear);
	      System.out.println("Day of Month:" + dayOfMonth);
	}
}