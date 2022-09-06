package com.example.servlet;

import com.lavasoft.GeoIPService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "IpChecker", value = "/IpChecker")
public class IpChecker extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String ip=request.getParameter("ip");
        GeoIPService service=new GeoIPService();
        String location=service.getGeoIPServiceSoap().getIpLocation(ip);
        System.out.println("location: "+location);

        request.setAttribute("ip",location);

       request.getRequestDispatcher("home.jsp").forward(request,response);


    }
}
