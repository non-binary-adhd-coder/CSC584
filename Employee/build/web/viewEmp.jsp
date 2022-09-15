<%-- 
    Document   : viewEmp
    Created on : Jun 30, 2022, 5:26:03 PM
    Author     : hidayah
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%> 
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<sql:setDataSource var="myDatasource"  driver="org.apache.derby.jdbc.ClientDriver" url="jdbc:derby://localhost:1527/emp" user="app" password="app"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View staff Lists</title>
    </head>
    <body>
        <h1>View Employee List</h1>
       
        
        <sql:query var="result" dataSource="${myDatasource}">
            SELECT * FROM STAFF
        </sql:query>
    
        <table border="0" cellpadding="10" cellspacing="2">
            <!-- column headers -->
            <tr>
                <c:forEach var="columnName" items="${result.columnNames}">
                    <c:if test="${!columnName.equals('ID')}">
                        <th><c:out value="${columnName}"/></th>
                    </c:if>
                </c:forEach>
            </tr>     
            <!-- column data -->
                <c:forEach var="row" items="${result.rowsByIndex}">
                <tr>
                    <c:forEach var="column" items="${row}">
                        <c:if test="${column!= row[0]}">
                             <td><c:out value="${column}"/></td>   
                        </c:if>
                    </c:forEach>
                    <td>
                        <form action="editForm.jsp" method="POST">
                            <input type="hidden" name="id" value="${row[0]}" />
                            <input type="Submit" value="EDIT"/>
                            <input type="Submit" value="DELETE"/>
                        </form> 
                    </td>       
                </tr> 
                </c:forEach>  
        </table>  
    </body>
</html>

