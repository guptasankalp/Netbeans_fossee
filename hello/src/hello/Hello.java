/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;

/**
 *
 * @author sankalp
 */
public class Hello {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
<tr>
<td>city</td>
<td><input type="text" name="city" id="fathername"
size="30"></td>
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
<td>gender</td>
<td><input type="radio" name="sex" value="male" >Male
<input type="radio" name="sex" value="Female">Female</td>
</tr>


<tr>
<td>Course</td>
<td><select name="Course">
<option value="-1" selected>select..</option>
<option value="B.Tech">B.TECH</option>
<option value="MCA">MCA</option>
<option value="MBA">MBA</option>
<option value="BCA">BCA</option>
</select></td>
</tr>



<tr>
<td>PinCode</td>
<td><input type="text" name="pincode" id="pincode" size="30"></td>

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
<td><input type="reset"></td>
<td colspan="2"><input type="submit" value="Submit Form" /></td>
</tr>

        public String getcity() {  
    return city;  
}  
  
public void setcity(String city) {  
    this.city= city;  
} 

public String getmail() {  
    return mail;  
}  
  
public void setmail(String mail) {  
    this.mail= mail;  
}
public String getadd() {  
    return add;  
}  
  
public void setadd(String add) {  
    this.add= add;  
} 
public String getstate() {  
    return state;  
}  
  
public void setstate(String state) {  
    this.state= state;  
}
        
        
        
        
        			ps.setString(3,u.getcity());
                        ps.setString(4,u.getmail());
                        ps.setString(5,u.getadd());
                        ps.setString(6,u.getstate());
                        ps.setString(7,u.getcontct())
        
    }
    
}
        String s2=request.getParameter("city");
                String s3=request.getParameter("emailid");
                String s4=request.getParameter("paddress");
                String s5=request.getParameter("state");
                String s6=request.getParameter("mobileno");
                //String s7=request.getParameter("noi");
                //String s8=request.getParameter("noi");
                //String s=request.getParameter("noi