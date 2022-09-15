<%-- 
    Document   : empform
    Created on : Jun 30, 2022, 2:21:21 PM
    Author     : hidayah
--%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<sql:setDataSource var="myDatasource"
driver="org.apache.derby.jdbc.ClientDriver"
url="jdbc:derby://localhost:1527/emp" user="app"
password="app"/>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Employee Form</title>
    </head>
    <body>
                      
        <h1>Add New Employee</h1>
        <form action="/Employee/empController" method="POST">
            <table>
                <tr>
                    <td>Name:</td>
                    <td><input type="text" name="name"/></td>
                </tr>
                <tr>
                    <td>Salary:</td>
                    <td><input type="number" name="salary"/></td>
                </tr>
                <tr>
                    <td>Designation:</td>
                    <td><input type="text" name="designation"/></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Save"/></td>
                </tr>
            </table>
            
        </form>
    </body>
</html>
