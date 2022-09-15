<%-- 
    Document   : Update
    Created on : Jun 9, 2022, 11:53:41 AM
    Author     : hidayah
--%>

<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<sql:setDataSource var="myDatasource"
                   driver="org.apache.derby.jdbc.ClientDriver" 
                   url="jdbc:derby://localhost:1527/StudentDB" user="app"
                   password="app"/>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update Data</title>
    </head>
    <body>

        <c:set var="id" value="${param.id}"/>
        <c:set var="name" value="${param.name}"/>
        <c:set var="branch" value="${param.branch}"/>

        <c:if test="${(id!=null)&&(name!=null)&&(branch!=null)}" var="result">        

            <sql:update var="res" dataSource="${myDatasource}">
                UPDATE STUDENT SET NAME = ?, BRANCH = ? WHERE ID = ?
                <sql:param value="${name}"/>
                <sql:param value="${branch}"/>
                <sql:param value="${id}"/>
            </sql:update>

        </c:if>

        <form action="Update.jsp" method="POST" enctype="multipart/form-data">

            <table border="0" cellspacing="4" cellpadding="4">
                <tbody>
                <thead>
                    <tr>
                        <th>Update Data Form</th>
                        <th></th>
                    </tr>
                </thead>
                <tr>
                    <td>ID:-</td>
                    <td><select name="id">
                            <sql:query var="result" dataSource="${myDatasource}">
                                SELECT ID FROM STUDENT
                            </sql:query>
                            <c:forEach var="row" items="${result.rowsByIndex}">
                                <c:forEach var="column" items="${row}">
                                    <option> <c:out value="${column}"/></option>
                                </c:forEach>
                            </c:forEach>
                        </select></td>
                </tr>
                <tr>
                    <td>Name</td>
                    <td><input type="text" name="name" /></td>
                </tr>
                <tr>
                    <td>Branch</td>
                    <td><input type="text" name="branch" /></td>
                </tr>
                <tr>
                    <td></td>
                    <td colspan="2"><input type="submit" value="Update" /></td>
                </tr>
                </tbody>
            </table>
        </form> 
                <sql:query var="result" dataSource="${myDatasource}">
                    SELECT * FROM APP.STUDENT
                </sql:query>
        
            <table border="1">
                <!-- column headers -->
                <tr>
                    <c:forEach var="columnName" items="${result.columnNames}">
                        <th><c:out value="${columnName}"/></th>
                        </c:forEach>
                </tr>
                <!-- column data -->
                <c:forEach var="row" items="${result.rowsByIndex}">
                    <tr>
                        <c:forEach var="column" items="${row}">
                        <option> <c:out value="${column}"/></option>
                    </c:forEach>
                    </tr> 
                </c:forEach>
            </table>
        </select>   


    </body>
</html>
