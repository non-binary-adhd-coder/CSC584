<%-- 
    Document   : add_dvd
    Created on : May 25, 2022, 7:52:47 PM
    Author     : hidayah
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.dvd.model.DVDItem" %>
<%@page import="java.util.*" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%
    String genre_list = "Comedy,Action,Drama";
    String[] genres = null;
    genres = genre_list.split(",");
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>DVD Library Application: Add DVD Form</title>
    </head>
    <body>
        <h1>Add DVD (JSTL)</h1>
        <c:if test="${not empty errorMsg}">
            <p>
                <font color="red">Please correct the following errors:
            <ul>
                <c:forEach var="message" items="${errorMsgs}">
                    <li>${message}</li>
                    </c:forEach>
            </ul>
        </p>
    </c:if>

    <form action="add_dvd.do" method="POST">
        Title: <input type="text" name="title" value="${param.title}"/><br/><br/>
        Year: <input type="text" name="year" value="${param.year}"/><br/><br/>              
        Genre: <select name="genre">
            <jsp:scriptlet>
                genres = new String[]{genre_list};
                pageContext.setAttribute("genres", genres);
            </jsp:scriptlet>
            <c:forEach var="genre_item" items="${pageScope.genres}"> 
                
                <option value="${genre_item}" 
                <c:if test="${genre_item eq param.genre}">selected</c:if>
                >${genre_item}</option>
                
                <option value={"comedy"}
                <c:if test="{comedy}"></c:if>>comedy</option>
                
                <option value={"action"}
                <c:if test="{action}"></c:if>>action</option>
                
                <option value={"drama"}
                <c:if test="{drama}"></c:if>>drama</option>
                
            </c:forEach>
        </select>


        or new genre: <input type='text' name='newGenre' value='${param.newGenre}'/> <br/><br/>
        <input type="Submit" value='Add DVD'/> 

    </form>  

</body>
</html>
