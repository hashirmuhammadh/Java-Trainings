<%@ page import="com.example.model.User" %><%--
  Created by IntelliJ IDEA.
  User: manee
  Date: 31/08/2022
  Time: 22:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    String name=null;
    String ip=null;

if(session.getAttribute("user")==null){

    response.sendRedirect("Login.jsp");
}else{
    User user=(User) session.getAttribute("user");
    name=user.getUsername();

    if(request.getAttribute("ip")!=null){

       ip= request.getAttribute("ip").toString();

    }

}

if(request.getAttribute("un")!=null){


name=request.getAttribute("un").toString();
}
%>

<html>
<head>
    <title>Home</title>
</head>
<body>


<h1> Hello! Welcome <%= name %>> </h1>

<form action="SignOut" method="get" >

    <input type="submit" value="SignOut">
    <br/><br/><br/><br/><br/><br/><br/><br/>
</form>

<form  action="IpChecker" method="post" >

    <input type="text" placeholder="Enter Ip" name="ip" />
    <br/><br/><br/><br/><br/><br/><br/><br/>

    <input type="submit" value="CheckIp">
</form>

<h1>IP Adress Is:<%= ip %></h1>


</body>
</html>
