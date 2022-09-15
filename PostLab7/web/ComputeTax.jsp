<%-- 
    Document   : ComputeTax
    Created on : May 25, 2022, 8:04:52 PM
    Author     : hidayah
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Compute Tax</title>
    </head>
    <body>
        <%
            double price = Double.parseDouble(request.getParameter("price"));
            double tax = Double.parseDouble(request.getParameter("tax"));
        %>

        <%!
            public double calculateTax(double tax, double price) {
                return (price * tax) + price;
            }
        %>
        <h1>Computed Tax</h1>
        Net Amount(Excluding tax):RM <%= price%><br/>
        Tax :<%= tax%><br/>
        Gross Amount(Including tax):RM <%= calculateTax(tax,price)%>

    </body>
</html>
