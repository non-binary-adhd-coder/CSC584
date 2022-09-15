/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

/**
 *
 * @author hidayah giving option if changed password is not valid, then go back to login.html
 */
import config.MyConnection;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.UserDao;

public class LoginServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("uname");
        String password = request.getParameter("pswd");
        UserDao l = new UserDao(new MyConnection().getConnection());
        PrintWriter pw = response.getWriter();
        if (l.validateUser(username, password)) {
            RequestDispatcher dis = request.getRequestDispatcher("WelcomeServlet");
            dis.forward(request, response);
        } else {
            pw.println("<html><body>");
            pw.println("<h1>Wrong Id AND/OR Password</h1></body></html>");
            RequestDispatcher dis = request.getRequestDispatcher("login.html");
            dis.include(request, response);
        }
    }
}
