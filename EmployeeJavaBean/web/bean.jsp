<%-- 
    Document   : bean
    Created on : Jun 19, 2022, 6:51:04 PM
    Author     : hidayah
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JavaBean Staff</title>
    </head>
    <body>
        <h1>JavaBean Staff</h1>
        <jsp:useBean id="staff" scope="request" class="person.bean.staff" />
        <jsp:setProperty name="staff" property="firstname" param="firstname" />
        <jsp:setProperty name="staff" property="lastname" param="lastname"/>
        <jsp:setProperty name="staff" property="age" />
        <table border="0" cellspacing="4" cellpadding="4">
            <thead>
                <tr>
                    <th>Display Staff Info</th>
                    <th></th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>Staff First Name:</td>
                    <td><jsp:getProperty name="staff" property="firstname" /></td>
                </tr>
                <tr>
                    <td>Staff Last Name:</td>
                    <td><jsp:getProperty name="staff" property="lastname" /></td>
                </tr>
                <tr>
                    <td>Staff Age:</td>
                    <td><jsp:getProperty name="staff" property="age" /></td>
                </tr>
                <tr>
                    <td>Staff Fullname:</td>
                    <td><%= staff.getFullName()%></td>
                </tr>
            </tbody>
        </table>
      </body>
</html>
