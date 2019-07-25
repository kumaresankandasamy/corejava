<%@ page import ="java.sql.ResultSet" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.Connection"  %>
<%@ page import="java.sql.DriverManager" %>
<form method="post">
<table border=2 name="user">
<tr>
<td>id
</td>
<td>name
</td>
<td>age
</td>
<td>location
</td>
</tr>
<%
   try
   {
       Class.forName("com.mysql.jdbc.Driver");
       String url="jdbc:mysql://localhost:3306/ListUsersServlet";
       String username="root";
       String password="admin";
       String query="select * from ListUsersServlet";
       Connection conn=DriverManager.getConnection(url, username, password);
       Statement stmt=conn.createStatement();
       ResultSet rs=stmt.executeQuery(query);
       while(rs.next())
       {
   %>
           <tr><td><%rs.getInt("id"); %></td></tr>
           <tr><td><%rs.getString("name"); %></td></tr>
           <tr><td><%rs.getInt("age"); %></td></tr>
           <tr><td><%rs.getString("location"); %></td></tr>
   <%
       }
   %>
</table>
<%
        rs.close();
        stmt.close();
        conn.close();
   }
   catch(Exception e)
   {
        e.printStackTrace();
   }
   %>
</form>`