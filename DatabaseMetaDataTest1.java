import java.sql.*;
class DatabaseMetaDataTest1 
{
public static void main(String args[]) throws Exception
{
Class.forName("org.postgresql.Driver");
Connection con=DriverManager.getConnection("jdbc:postgresql:tybcs","postgres","");
DatabaseMetaData dbmd=con.getMetaData();
System.out.println("Database Name="+dbmd.getDatabaseProductName());
System.out.println("Database Version="+dbmd.getDatabaseProductVersion());
System.out.println("Database Driver Name="+dbmd.getDriverName());
System.out.println("Driver Major Version"+dbmd.getDriverMajorVersion());
System.out.println("Driver Major Version="+dbmd.getDriverMinorVersion());
System.out.println("URL of Database="+dbmd.getURL());
System.out.println("Current UserName="+dbmd.getUserName());
System.out.println("=========Tables=========");
String t[]={"TABLE"};
ResultSet rs=dbmd.getTables(null,null,null,t);
while(rs.next())
{
System.out.println(rs.getString("TABLE_NAME"));
}
System.in.read();
System.out.println("=========VIEWS==========");
String v[]={"VIEW"};
rs=dbmd.getTables(null,null,null,v);
while(rs.next())
{
System.out.println(rs.getString("TABLE_NAME"));
}
con.close();
}
}
