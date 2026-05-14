Import java.IOException;
Import javax.servlet.*;
Import javax.servlet.http.*;
Public class Servlet1 extends HttpServlet
{
Private static final long serialversionUID=1L;
Public Servlet()
{
Super();
Protected void doGet (HttpServletRequest request, HttpServletRequest reponse) 
PrintWriter out=response.getWriter();
String id=request.getParameter(“id”);
Out.print(“<h1>Display the record</h1>”);
Out.print(“<table border=’1’><tr><th>ID</th><th>Name</th><th>Address</th></tr>”);
Try{
Class.forName(“jdbc.postgresql.Driver”);
Connection con=DriverManager.getConnection(“jdbc:postgres:test”,”postgres”,”Pass@word”);
Statement stmt=con.createStatement();
ResultSet rs=stmt.executeQuery(“select *from customer where id=”+id+”);
While(rs.next())
{
Out.print(“<tr><td>”);\
Out.println(rs.getInt(1));
Out.print(“</td>”);
Out.print(rs.getString(2));
Out.print(“</td>”);
Out.print(“</td>”);
Out.print(rs.getString(3));
Out.print(“</td>”);
Out.print(i);
Out.print(“</tr>”);
}
}
Catch(Exception p)
{ System.out.println(p);
}
Out.print(“</table>”);
}
