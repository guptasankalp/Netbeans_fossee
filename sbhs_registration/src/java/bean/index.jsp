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
      
       public int registrator (user u){
             
     int status =0;
    try{
        

          java.lang.Class.forName("com.mysql.jdbc.Driver");
        Connection conn = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/sankalp?zeroDateTimeBehavior=convertToNull", "root", "sanki");
          //  Statement st = conn.createStatement();
          // String query = "INSERT INTO Registration values ('"++"',"+institute+"','"++"','"++"' ,'"++"','"++"','"++"','"++"','"++"')"
             PreparedStatement ps=conn.prepareStatement("insert int o master values(?,?,?,?,?,?,?,?,?)");
			ps.setString(1,u.getnam());
			ps.setString(2,u.getinsti());
                        ps.setString(3,u.getcity());
                        ps.setString(4,u.getmail());
                        ps.setString(5,u.getadd());
                        ps.setString(6,u.getstate());
                        ps.setString(9,u.getcontct());
                        ps.setString(7,u.getsex());
                        ps.setString(8,u.getcourse());
                        
		status =ps.executeUpdate();
            //   statement.setString(1, filePath);
 
         //   int row = st.executeUpdate();
           // if (row > 0) {
            //out.println("One data inserted");
                               
            
            conn.close();
            //}
          //  Out.println("succesful data inserted");
 
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
                String s=request.getParameter("name");
                String s1=request.getParameter("noi");
                String s2=request.getParameter("city");
                String s3=request.getParameter("emailid");
                String s4=request.getParameter("paddress");
                String s5=request.getParameter("state");
                String s6=request.getParameter("mobileno");
                String s7=request.getParameter("gender");
                String s8=request.getParameter("course");
              
                
                user u =new user();
                u.setnam(s);
                u.setinsti(s1);
                u.setcity(s2);
                u.setmail(s3);
                u.setadd(s4);
                u.setstate(s5);
                u.setcontct(s6);
                u.setsex(s7);
                u.setcourse(s8);
                
                
                   test c=new test();
                    c.registrator(u);
            %>
            
            
            
            
              
               
        
        <h1>Hello World! ITS ME </h1>
        <form name =" Remote_Single_board_heating_server">
         <table width="20%" bgcolor="00A6FF" align="center">

<tr>
<td colspan=2>
    
<center><font size=4><b>Registration Form</b></font></center>

   </td>
</tr>

<tr>
<td>Name of candidate</td>
<td><input type=text name=name id="textname" size="30"></td>
</tr>

<tr>
<td>Name of Institute</td>
<td><input type=text name=noi id="noi" size="30"></td>
</tr>

<tr>
<td>city</td>
<td><input type="text" name="city" id="fathername" size="30"></td>
</tr>

<tr>
<td>Postal Address</td>
<td><input type="text" name="paddress" id="paddress" size="30"></td>
</tr>

<tr>
<td>State</td>
<td><input type=text name=state id="state" size="30"></td>
</tr>

<tr>
<td>EmailId</td>
<td><input type="text" name="emailid" id="emailid" size="30"></td>
</tr>

<tr>
<td>MobileNo</td>
<td><input type="text" name="mobileno" id="mobileno" size="30"></td>
</tr>

<tr>
<td>gender</td>
<td><input type="radio" name="sex" value="Male" >M
<input type="radio" name="sex" value="female">F</td>
</tr>


<tr>
<td>Course</td>
<td><select name="Course">
<option value="-1" selected>select</option>
<option value="B.Tech">B.TECH</option>
<option value="MCA">MCA</option>
<option value="MBA">MBA</option>
<option value="BCA">BCA</option>
</select></td>
</tr>

<tr>

<td><input type="reset"></td>
<td colspan="2"><input type="submit" value="Submit Form" /></td>
</tr>


</table>
        </form>

        
    </body>
</html>

