/* Write a java program which accepts number from command prompt Divide 16 by accepted number and display division handle all possible exceptions */

import java.io.*;

public class Trycatchblock
{
	public static void main(String[] args)
    {
        double ans = 0.0;

        try
        {
             int den = Integer.parseInt(args[0]);
             ans = 16.0 / den;

        }

        catch(ArrayIndexOutOfBoundsException ae)
        {
             System.out.println("You haven't send any number from commandline");
             System.out.println("Problem: " + ae);

             ae.printStackTrace();

             ans = 16.0/2;
        }

        catch(NumberFormatException ae)
        {
             System.out.println("You haven't send any number from commandline");
             System.out.println("Problem: " + ae);

             ans = 16.0/2;
        }

        catch(ArithmeticException ae)
        {
             System.out.println("Division is not possible case of Denominator is ZERO");
             System.out.println("Problem: " + ae);

             ans = 16.0/2;
        }

        catch(Exception ae)
        {
  
             System.out.println("Unknown Problem: " + ae);
             System.exit(0);
        }
        
        System.out.println("Division is" +ans );
        System.out.println("I am Ending...!!!");

    }
}