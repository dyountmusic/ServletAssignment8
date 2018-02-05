<%-- 
    Document   : profile
    Created on : Feb 5, 2018, 4:37:34 PM
    Author     : danielyount
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <p>name: ${UserData.name}</p>
        <p>username: ${UserData.username}</p>
        <p>password: ${UserData.passid}</p>
        <p>address: ${UserData.address}</p>
        <p>country: ${UserData.country}</p>
        <p>zip: ${UserData.zip}</p>
        <p>email: ${UserData.email}</p>
        <p>sex: ${UserData.sex}</p>
        <p>lang: ${UserData.langs}</p>
        <p>description: ${UserData.about}</p>
    </body>
</html>
