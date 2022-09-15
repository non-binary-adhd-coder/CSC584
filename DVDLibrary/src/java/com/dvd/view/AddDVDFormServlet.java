/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dvd.view;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Iterator;
/**
 *
 * @author hidayah
 */

public class AddDVDFormServlet extends HttpServlet {

    private String[] genres = null;

    public void init() throws ServletException {
        // Specify the content type is HTML
        String genre_list = getInitParameter("genre-list");
        if (genre_list == null) {
            genre_list = "Comedy,Action,Drama";
        }
        genres = genre_list.split(","); //q4
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
         // Specify the content type is HTML
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        // Generate the HTML response
        out.println("<html>");
        out.println("<head>");
        out.println(" <title>DVD Library Application: Add DVD Form (Servlet)</title >");
        out.println("</head>");
        out.println("<body>");
        // Generate main body
        out.println("<h1>Add DVD</h1>");
        
        List errorMsgs = (List) request.getAttribute("errorMsgs");
        if (errorMsgs != null) {
            out.println("<h2>Error Messages</h2>");
            out.println(
            "<font color='red'>Please correct the following errors:");
            out.println("<ul>");
            Iterator items = errorMsgs.iterator();
            while (items.hasNext()) {
                String message = (String) items.next();
                out.println(" <li>" + message + "</li>");
            }
            out.println("</ul>");
            out.println("</font><p>");
        }
        
        out.println("<form action='add_dvd.do' method='POST'>");

        // Display the title field
        out.println(" Title: <input type='text' name='title' /> <br/><br/>");
        // Display the year field
        out.println(" Year: <input type='text' name='year' /> <br/><br/>");
        // Repopulate the Genre drop-down menu
        out.println(" Genre: <select name='genre'>");
        for (int i = 0; i < genres.length; i++) {
            out.print(" <option value='" + genres[i] + "'>");
            out.println(genres[i] + "</option>");
        }
        out.println(" </select>");
        out.println(" or new genre: <input type='text' name='newGenre' /> <br / > <br / >");
        out.println(" <input type='submit' value='Add DVD' />");
        out.println("</form>");
        out.println("</body>");
        out.println("</html>");
        out.close();
    }
}
