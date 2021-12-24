package com.test.servlet;

import com.test.entity.Userinfo;
import com.test.service.userinfoservice;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "userloginServlet")
public class userloginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        userinfoservice userinfoservice = new userinfoservice();
        String a = request.getParameter("username");
        String b = request.getParameter("password");
        Userinfo userinfo=null;
        if (action.equals("login")){
            userinfo=userinfoservice.findUser(a,b);
            if (userinfo.getUsername()!=null){
                request.getSession().setAttribute("loginuser",a);
                request.getRequestDispatcher("../main.jsp").forward(request,response);

            }

        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
