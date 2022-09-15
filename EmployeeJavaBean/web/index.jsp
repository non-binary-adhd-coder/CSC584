<%-- 
    Document   : index
    Created on : Jun 19, 2022, 6:51:29 PM
    Author     : hidayah
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Staff JSP Page</title>
    </head>
    <body>
        <h1>Staff Details</h1>
        <form method="POST" action="bean.jsp">
            <table>
                <tr>
                    <td>First Name:</td>
                    <td><input type="text" name="firstname"></td>
                </tr>
                <tr>
                    <td>Last Name:</td>
                    <td><input type="text" name="lastname"></td>
                </tr>
                <tr>
                    <td>Age:</td>
                    <td><input type="text" name="age"></td>
                </tr>
                <tr><td><input type="submit" value="Submit"></td></tr>
            </table>
        </form>
    </body>
</html>
