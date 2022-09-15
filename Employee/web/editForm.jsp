<%-- 
    Document   : editform
    Created on : Jun 30, 2022, 2:21:33 PM
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
        <c:set var="id" value="${param.id}"/>
        <c:set var="name" value="${param.name}"/>
        <c:set var="salary" value="${param.salary}"/>
        <c:set var="designation" value="${param.designation}"/>

        <sql:query var="result" dataSource="${myDatasource}">
            SELECT * FROM STAFF WHERE ID =?
            <sql:param value="${id}"/>
        </sql:query>

        <c:forEach var="table" items="${result.rows}">
            <c:set var="name_query" value="${table.name}"/>
            <c:set var="salary_query" value="${table.salary}"/>
            <c:set var="designation_query" value="${table.designation}"/>
        </c:forEach>
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        </head>
        <body>
            <h1>Edit Employee</h1>

            <form action="/Employee/editEmpController" method="POST">
                <table border="0">

                    <tbody>
                        <tr>
                            <td>Name:</td>
                            <td><input type="text" name="name" value="${name_query}" /></td>
                        </tr>
                        <tr>
                            <td>Salary: </td>
                            <td><input type="text" name="salary" value="${salary_query}"</td>
                        </tr>
                        <tr>
                            <td>Designation: </td>
                            <td><input type="text" name="designation" value="${designation_query}"</td>
                        </tr>
                        <tr>
                            <td><input type="text" name="id" value="${id}" /></td>
                            <td><input type="submit" value="Edit Data" />
                            <input type="submit" value="Delete Data" /></td>
                        </tr>

                        </tr>

                    </tbody>
                </table>

            </form>
            <p><a href="viewEmp.jsp">View Employee</a></p>
        </body>
    </html>

