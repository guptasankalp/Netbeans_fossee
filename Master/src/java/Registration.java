/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author sankalp
 */
public class Registration extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
      //  try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
       //     public static void main(String[] args) {
      //  String url = "";
        //String user = "root";
        //String password = "sanki";
 
        //String filePath = "D:/Photos/Tom.png";
        String name = name.getText();
        String institute = institute.getText();
        
        try {
            
            Class.forName("java.sql.DriverManager");
            Connection conn = (Connection)
            DriverManager.getConnection("jdbc:mysql://localhost:3306/sankalp", "root", "sanki");
            Statement st = conn.createStatement();
            String query = "INSERT INTO Registration values ('"+name+"',"+institute+"','"++"','"++"' ,'"++"','"++"','"++"','"++"','"++"')"
 
         //   statement.setString(1, filePath);
 
            int row = statement.executeUpdate();
            if (row > 0) {
                System.out.println("One data inserted");
                               
            
            
            conn.close();
            }
        }   
        
         catch (SQLException ex) {
              Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, ex);
                 ex.printStackTrace();
                                 }
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            String a ;
            System.out.println("klbsocbsdovbodisbvoidbvoiibdovbdovbdbvdfbvofbvfbv bfvnefbvfvf");
            a=request.getParameter("name").toString();
            
            out.println("hello"+ a);
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
