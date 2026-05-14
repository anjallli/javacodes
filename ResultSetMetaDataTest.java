import java.sql.*;
3) class ResultSetMetaDataTest
4) {
5) public static void main(String args[])throws Exception
6) {
7) Class.forName("org.postgresql.Driver");
8) Connection 
con=DriverManager.getConnection("jdbc:postgresql:test","postgres","Pass@word");
9) Statement stmt=con.createStatement();
10) ResultSet rs=stmt.executeQuery("select *from DONAR");
11) ResultSetMetaData rsmd=rs.getMetaData();
12) int n= rsmd.getColumnCount();
13) System.out.println("No.of Columns="+n);
14) for(int i=1;i<=n;i++)
15) {
16) System.out.println("Column Number:"+i);
17) System.out.println("====================");
18) System.out.println("Column Name="+rsmd.getColumnName(i));
19) System.out.println("Column Type="+rsmd.getColumnTypeName(i));
20) System.out.println("Column Width="+rsmd.getColumnDisplaySize(i));
21) System.out.println("Column Presicion="+rsmd.getPrecision(i));
22) System.out.println("Is Currency="+rsmd.isCurrency(i));
23) System.out.println("Is Read-Only"+rsmd.isReadOnly(i));
24) System.out.println("Is Writable="+rsmd.isWritable(i));
25) System.out.println("Is Searchable="+rsmd.isSearchable(i));
26) System.out.println("Is Signed="+rsmd.isSigned(i));
27) }
28) con.close();
29) }
30) }
