/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import person.bean.staff;

/**
 *
 * @author hidayah
 */
public class empController extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet empController</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet empController at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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

        PrintWriter out = response.getWriter();
        List errorMsgs = new LinkedList();

        try {

            String name = request.getParameter("name");
            int salary = Integer.parseInt(request.getParameter("salary"));
            String designation = request.getParameter("designation");

            if (name == null || name.trim().length() == 0) {
                errorMsgs.add("Please enter the name");
            }

            if (salary == 0) {
                errorMsgs.add("Please enter salary.");
            }

            if (designation == null || designation.trim().length() == 0) {
                errorMsgs.add("Please enter the designation");
            }

            if (!errorMsgs.isEmpty()) {
                request.setAttribute("errorMsgs", errorMsgs);
                RequestDispatcher view = request.getRequestDispatcher("/error.jsp");
                view.forward(request, response);
            }

            try {
                String driver = "org.apache.derby.jdbc.ClientDriver";
                String connectionString = "jdbc:derby://localhost:1527/emp;create=true;user=app;password=app";

                //Load the driver
                Class.forName(driver);

                //connect to the sample database
                Connection conn = DriverManager.getConnection(connectionString);

                PreparedStatement pstmt = conn.prepareStatement("SELECT max(id)+1 from STAFF");
                ResultSet res = pstmt.executeQuery();
                int id = 0;
                while (res.next()) {
                    id = res.getInt(1);
                }
                if (id == 0) {
                    id = 1;
                }

                staff st = new staff(id, name, salary, designation);

                pstmt = conn.prepareStatement("INSERT INTO STAFF (ID,NAME, SALARY, DESIGNATION) VALUES (?,?,?,?)");

                pstmt.setInt(1, id);
                pstmt.setString(2, name);
                pstmt.setInt(3, salary);
                pstmt.setString(4, designation);
                pstmt.executeUpdate();

                request.setAttribute("Staff", st);
                RequestDispatcher view = request.getRequestDispatcher("/success.jsp");
                view.forward(request, response);

            } catch (SQLException e) {

                errorMsgs.add("An unexpected error Database: " + e.getMessage());
                request.setAttribute("errorMsgs", errorMsgs);
                RequestDispatcher view = request.getRequestDispatcher("/error.jsp");
                view.forward(request, response);
            } catch (ClassNotFoundException ex) {

                Logger.getLogger(empController.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (RuntimeException e) {

            errorMsgs.add("An unexpected error: " + e.getMessage());
            request.setAttribute("errorMsgs", errorMsgs);
            RequestDispatcher view = request.getRequestDispatcher("/error.jsp");
            view.forward(request, response);
        }

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
