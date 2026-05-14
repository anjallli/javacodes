import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
public class Project {
public static void main(String[] args) {
Connection con = null;
PreparedStatement ps=null;
Statement stmt=null;
BufferedReader br = new BufferedReader( new 
InputStreamReader(System.in));
try 
{
Class.forName("org.postgresql.Driver");
con=DriverManager.getConnection("jdbc:postgresql:test","postgres","Pass@word");
stmt=con.createStatement();
//ResultSet rs=stmt.executeQuery("create table 
PROJECT(project_id int primary key,project_name varchar(30),project_desciption 
varchar(50),project_status varchar(20))");
System.out.print("Enter Project ID:");
int id=Integer.parseInt(br.readLine());
System.out.print("Enter Project Name:");
String name=br.readLine();
System.out.print("Enter Project Description:");
String desc=br.readLine();
System.out.print("Enter Project Status");
String Status=br.readLine();
ps=con.prepareStatement("insert into PROJECT values(?,?,?,?)");
ps.setInt(1, id);
ps.setString(2, name);
ps.setString(3,desc);
ps.setString(4, Status);
int i=ps.executeUpdate();
if(i==0)
System.out.println("Unable to insert");
else
System.out.println("Data Inserted Succesfully");
con.close();
}
catch(Exception e)
{
e.printStackTrace();
}
}
}