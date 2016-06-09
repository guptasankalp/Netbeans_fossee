<%-- 
    Document   : index
    Created on : 30 May, 2016, 4:20:56 AM
    Author     : sankalp
--%>
<%@page import="bean.user"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.*"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.lang.*"%>


<%@page import=" java.io.IOException" %>
<%@page import ="java.io.PrintWriter"%>
<%@page import ="javax.servlet.RequestDispatcher"%>
<%@page import ="javax.servlet.ServletException"%>
<%@page import ="javax.servlet.http.HttpServlet"%>
<%@page import ="javax.servlet.http.HttpServletRequest"%>
<%@page import ="javax.servlet.http.HttpServletResponse"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP TRIAL Page</title>
    </head>
    <body>
        
        <%!
            
 class test
  {
      
       public boolean check(String name, String pass)
       {
             
    boolean status =false;
    try{
        

          java.lang.Class.forName("com.mysql.jdbc.Driver");
        Connection conn = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/sankalp?zeroDateTimeBehavior=convertToNull", "root", "sanki");
          //  Statement st = conn.createStatement();
          // String query = "INSERT INTO Registration values ('"++"',"+institute+"','"++"','"++"' ,'"++"','"++"','"++"','"++"','"++"')"
             PreparedStatement ps=conn.prepareStatement("select * from master where name=? and password=?");
			ps.setString(1,name);
                        ps.setString(2,pass);
                                       
                        
		ResultSet rs = ps.executeQuery();
                status = rs.next();
            
            conn.close();
 
    }

  
        
  catch (Exception e) {
              //Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, e);
                e.printStackTrace();
                               }
         return status;
       }
  
 }
            %>
        
            <%
                

                {           
        String n=request.getParameter("name");
       
        String p=request.getParameter("password");
        
        test t=new test();
        if(t.check(n,p))
        { out.print("verified");
            RequestDispatcher rd=request.getRequestDispatcher("first_page");
            rd.include(request, response);
        
        }
        else{
            //out.print("Sory !! username or password does not exist... TRY AGAIN !! ");
            out.print("HIT YOUR details");
            
            RequestDispatcher rd= request.getRequestDispatcher("index.jsp");
            }
                }
        %>
        
              
            
            
            
              
               
        
        <h1>Hello World! ITS ME </h1>
        <form name =" Remote_Single_board_heating_server">
         <table width="20%" bgcolor="00A6FF" align="center">

<tr>
<td colspan=2>
    
<center><font size=4><b>Login</b></font></center>

</td>
</tr>

<tr>
<td>Name </td>
<td><input type=text name="name" id="textname" size="30"></td>
</tr>

<tr>
    
    <td>Password</td>
    <td> <input type="password" name ="password" size="30"></td>
</tr>
<tr>


<td colspan="2"><input type="submit" value="Login" /></td>
</tr>


</table>
        </form>

        
    </body>
</html>

