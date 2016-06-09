
import gnu.io.CommPort;
import gnu.io.CommPortIdentifier;
import gnu.io.SerialPort;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author anamika
 */
public class NewServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       response.setContentType("text/event-stream;charset=UTF-8");
       PrintWriter out = response.getWriter();
        
        try {
            
            /* TODO output your page here. You may use following sample code. */
        
           
             
            String portName=null;
        try
        {
        	 try {
        	// String target1 ="sudo -i rm -f /var/lock/LCK*";
                 portName = "/dev/ttyUSB0";
                 
               
                
         } catch (Throwable t) {
                 t.printStackTrace();
         }
               Con c=new Con();
            
         
             
           String fan = request.getParameter("mypostvar");
            String heat = request.getParameter("mypostvar1");
              double a=0.0;
              if(fan!=null&&heat!=null){
            a=c.connect(portName,Integer.parseInt(heat),Integer.parseInt(fan));
                  System.out.println(a+"yahan ");
                   PrintWriter writer = response.getWriter();
                   if(a!=0.0)
            writer.write("data: "+a+"\n\n");
                   
              
            
          
            
             Thread.sleep(1000);
          }
            
            
            
                 
                 
            
          // request.setAttribute("name", c.arr);
            
            
        }
        catch ( Exception e )
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    
            
            
        } finally {
            out.close();
        }
    }
     
    
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        processRequest(request, response);
        
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
