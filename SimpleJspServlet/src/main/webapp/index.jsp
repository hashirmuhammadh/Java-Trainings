<%@ page import="com.example.controller.DB" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%
  //  HttpSession session1=request.getSession(false);

    if(session.getAttribute("user")!=null){

        response.sendRedirect("home.jsp");
    }

%>


<%
    if(application.getAttribute("db")==null){
        DB db=new DB();
        application.setAttribute("db",db);
    }


%>

<!DOCTYPE html>
<html>
<head>
    <title>User Registration</title>
</head>
<body>


<form method="POST" action="SignUp">
    <span>Email</span>
    <input type="text" name="email" placeholder="Enter Email"  />
    <br/>
    <span>User Name</span>
    <input type="text" name="uname" placeholder="Enter User Name"  />
    <br/>
    <span>Password</span>
    <input type="password" name="password" placeholder="Enter Passowrd" />
    <br/>
    <input type="submit" value="Submit" />

</form>


</body>
</html>