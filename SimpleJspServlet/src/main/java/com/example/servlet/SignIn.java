package com.example.servlet;

import com.example.controller.DB;
import com.example.model.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "SignIn", value = "/SignIn")
public class SignIn extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String email=request.getParameter("email");
        String password=request.getParameter("password");

        ServletContext sc=request.getServletContext();

        if (sc.getAttribute("db")!=null){
            DB db=(DB) sc.getAttribute("db");

            boolean already=db.already(email);

            if(already==true){

                User user=db.getUser(email);

                if(email.equalsIgnoreCase(user.getEmail()) && password.equals(user.getPassword())){

                    HttpSession session=request.getSession();


                    request.setAttribute("un",user.getUsername());

                    session.setAttribute("user",user);

                    request.getRequestDispatcher("home.jsp").forward(request,response);



                }

            }else{

                response.sendRedirect("index.jsp");
            }

        }

    }
}
