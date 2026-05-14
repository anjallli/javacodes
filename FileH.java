import java.io.*;

public class FileH
{
	public static void main(String args[]) throws Exception
	{
        File f = new File(args[0]);

        if(! f.exists())
        {
             System.out.println(args[0] + "does not exist");
             System.exit(0);
        }	
        
        if(! f.isFile())
        {
        	System.out.println(args[0] + "is not a file");
        	System.exit(0);
        }


           System.out.println("File Name: " + f.getName());
           System.out.println("File path: " + f.getAbsolutePath());
           System.out.println("File Size: " + f.length());
           System.out.println("Readable: " + f.canRead());
           System.out.println("Writable: " + f.canWrite());
           System.out.println("Executable: " + f.canExecute());
	}
}	    	    