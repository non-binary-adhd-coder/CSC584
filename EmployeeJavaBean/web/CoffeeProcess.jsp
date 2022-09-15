<%-- 
    Document   : CoffeeProcess
    Created on : Jun 19, 2022, 7:24:36 PM
    Author     : hidayah
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Customer Order</title>
    </head>
    <body>
        <jsp:useBean id="CoffeeBean" scope="request" class="coffee.bean.CoffeeBean">
            <jsp:setProperty name="CoffeeBean" property="typeCoffee" param="typeCoffee" />
            <jsp:setProperty name="CoffeeBean" property="numSugar" param="numSugar" />
            <jsp:setProperty name="CoffeeBean" property="price" param="price" />
        </jsp:useBean>

        <h2>Javabeans in JSP</h2>

        <h2>Customer Order</h2>
        <table>
            <tr>
                <td>Type of Coffee</td>
                <td> <jsp:getProperty name="CoffeeBean" property="typeCoffee" /></td>
            </tr>
            <tr>
                <td>Number of Sugar</td>
                <td> <jsp:getProperty name="CoffeeBean" property="numSugar" /> spoon</td>
            </tr>
            <tr>
                <td>Price</td>
                <td> RM <jsp:getProperty name="CoffeeBean" property="price"  /></td>
            </tr>
        </table>
    </body>
</html>
