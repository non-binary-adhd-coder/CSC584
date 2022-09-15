<%-- 
    Document   : error
    Created on : Jun 30, 2022, 5:02:28 PM
    Author     : hidayah
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Error Page</title>
    </head>
    <body>
       
        <%-- Report any errors (if any) --%>
        <c:if test="${not empty errorMsgs}">
            <p>
                <font color="red">Please correct the following errors:
                    <ul>
                        <c:forEach var="message" items="${errorMsgs}">
                            <li>${message}</li>
                        </c:forEach>
                    </ul>
                </font>
            </p>
        </c:if>
        <a href="index.html">Home</a>
    </body>
</html>

