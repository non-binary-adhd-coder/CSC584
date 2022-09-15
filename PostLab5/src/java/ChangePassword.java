/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import static com.sun.codemodel.JOp.div;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

/**
 *
 * @author hidayah
 */
public class ChangePassword extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    private PreparedStatement pstmt;
    private ResultSet rs;
    private Statement stmt;
    private String Back;

    public void init() throws ServletException {
        initializeJdbc();
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        //Obtain parameter from the client
        String userName = request.getParameter("username");
        String oldPass = request.getParameter("oldpass");
        String newPass = request.getParameter("newpass");
        String confirm = request.getParameter("conpass");

        try {
            /*if (!newPass.equals(confirm)) {
                out.println("The password confirmation does not match.");
                return;//End the method
            }
            updatePass(newPass, userName);
            out.println("Hello, " + userName + ", your password has been updated");*/
            if (userName != null || oldPass != null) {
                String sql = "Select * from account where username='" + userName
                        + "' and password='" + oldPass + "'";
                rs = stmt.executeQuery(sql);
                if (rs.next()) {
                    if (!newPass.equals(confirm)) {
                        out.println("The password confirmation does not match.");
                        out.println("<div> <a href = \"ChangePassword.html\" >Back </a></div>");
                        return;
//End the method
                    }

                    updatePass(newPass, userName);
                    String n = rs.getString("name");
                    out.println("Hello, " + n + ", your password has been updated...");
                    out.println("<div> <a href = \"ChangePassword.html\" >Back </a></div>");
}
else{
out.println("Username and old password is invalid");

//out.println(<div><a href = "ChangePassword.html">Back</a></div>);
return;//End the method
                }
            }
        } catch (Exception ex) {
            out.println("Error: " + ex.getMessage());
        } finally {
            out.close(); //close stream
        }
    }

    private void initializeJdbc() {
        try {
//Declare driver and connection string
            String driver = "org.apache.derby.jdbc.ClientDriver";
            String connectionString
                    = "jdbc:derby://localhost:1527/account;create=true;user=account;password=account";
//Load the driver
            Class.forName(driver);
//Connect to the sample database
            Connection conn = DriverManager.getConnection(connectionString);
//Create a Statement
            pstmt = conn.prepareStatement("update account set password = ? where username =  ? ");
            stmt = conn.createStatement();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void updatePass(String newPass, String userName) throws SQLException {
        pstmt.setString(1, newPass);
        pstmt.setString(2, userName);
        pstmt.executeUpdate();
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ChangePassword</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ChangePassword at " + request.getContextPath() + "</h1>");
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
