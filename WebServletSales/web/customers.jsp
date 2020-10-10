<%-- 
    Document   : customers
    Created on : Oct 9, 2020, 3:53:57 PM
    Author     : Tsosman
--%>

<%@page import="tsosman.services.CustomerService"%>
<%@page import="tsosman.dao.CustomerDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="tsosman.entities.Customers"%>
<%@page import="java.util.List"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Customers</title>
    </head>
    <body>
        <div align="center">
            <h2>List of Customers</h2>
            
            <br/>
            <table border="1px solid">
                <c:forEach items="${customers}" var="c">
                    <tr>
                        <td>${c.ccode}</td>
                        <td>${c.cname}</td>
                        <td>
                            <a href="#">Edit</a>
                        </td>
                        <td>
                            <a href="#">Delete</a>
                        </td>
                    </tr>
                </c:forEach>
            </table>
        </div>
    </body>
</html>
