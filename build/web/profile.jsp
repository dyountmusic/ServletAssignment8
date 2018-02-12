<%-- 
    Document   : profile
    Created on : Feb 5, 2018, 4:37:34 PM
    Author     : danielyount
--%>

<%@page import="edu.uncc.nbad.UserInfo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%    
            // read UserInfo java bean from httpSession object
            UserInfo userInfo = (UserInfo) session.getAttribute("userInfo");
        %>
        <p>name: ${userInfo.getName()}</p>
        <p>username: ${userInfo.getUsername()}</p>
        <p>password: ${userInfo.getPassid()}</p>
        <p>address: ${userInfo.getAddress()}</p>
        <p>country: ${userInfo.getCountry()}</p>
        <p>zip: ${userInfo.getZip()}</p>
        <p>email: ${userInfo.getEmail()}</p>
        <p>sex: ${userInfo.getSex()}</p>
        <p>lang: ${userInfo.getLangs()}</p>
        <p>description: ${userInfo.getAbout()}</p>
    </body>
</html>
