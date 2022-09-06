package com.example.servlet;

import com.example.controller.DB;
import com.example.model.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "SignUp", value = "/SignUp")
public class SignUp extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    String email= request.getParameter("email");
    String username=request.getParameter("uname");
    String password=request.getParameter("password");

    ServletContext sc=request.getServletContext();

    if(sc.getAttribute("db")!=null){

        DB db=(DB) sc.getAttribute("db");

        if(db.already(email)==false){


            User user=new User(email,username,password);
            System.out.println(db.add(user));

            response.sendRedirect("Login.jsp");

        }else{

            System.out.println("Already Registered!");
            response.sendRedirect("Login.jsp");
        }

    }



    }
}
