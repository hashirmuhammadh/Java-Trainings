<%--
  Created by IntelliJ IDEA.
  User: manee
  Date: 31/08/2022
  Time: 22:04
  To change this template use File | Settings | File Templates.
--%>



<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    if(session.getAttribute("user")!=null){

        response.sendRedirect("home.jsp");
    }

%>
<html>
<head>
    <title>SignIn</title>
</head>
<body>

<form method="POST" action="SignIn">
    <span>Email</span>
    <input type="text" name="email" placeholder="Enter Email"  />
    <br/> <br/> <br/>

    <span>Password</span>
    <input type="password" name="password" placeholder="Enter Passowrd" />
    <br/>
    <input type="submit" value="Submit" />

</form>

</body>
</html>
