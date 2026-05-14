import java.io.*;

 class Student
 {
    int rno;
    String name;
    double per;

    Student(int rno, String name, double per)
    {
        this.rno = rno;
        this.name = name;
        this.per = per;
    }

        void display()
        {
             System.out.println(rno +"\t" + name+ "\t" +per+ "\t");   
           
        }
}

    class Student2 extends Student
    {
        String email;
        String whatsapp;

        Student2(int rno, String name, double per, String email, String whatsapp)
        {
            super(rno,name,per);
            this.email = email;
            this.whatsapp = whatsapp;
        }
        

         void display()
         {
             super.display();
             System.out.println(email+ "\t"+ whatsapp);
       }
    }

    public class mix
{
	public static void main(String args[]) throws Exception
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("How many Students:");
        int n = Integer.parseInt(br.readLine());

        Student2 ob[]=new Student2[n];

        for(int i=0; i<n; i++)
        {
            System.out.println("Enter name: ");
            String name= br.readLine();
          
             System.out.println("Enter Percentage: ");
             double per= Double.parseDouble(br.readLine());

             System.out.println("Enter email: ");
             String email= br.readLine();
             
             System.out.println("Enter Whatsapp number: ");
             String whatsapp= br.readLine();
             
             ob[i] = new Student2(101+i,name,per,email,whatsapp);

             System.out.println("RNO\tNAME\tPERCENTAGE\tEMAIL\tWHATSAPP");
             
             
             {
                ob[i].display();
             }

        } 
	   
    }
}