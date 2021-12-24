package com.test.servlet;

import com.test.entity.Userinfo;
import com.test.service.userinfoservice;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "userinfoServlet")
public class userinfoServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String flag = request.getParameter("flag");
        userinfoservice userinfoservice = new userinfoservice();
        String a = request.getParameter("username");
        String b = request.getParameter("password");
        String c = request.getParameter("email");

        if (flag.equals("add")){
            Userinfo userinfo = new Userinfo(a,b,c);
            int count = userinfoservice.add(userinfo);
            if (count >0){
                request.setAttribute("error","注册成功");
                request.getRequestDispatcher("../index.jsp").forward(request,response);
            }else {
                request.setAttribute("error","注册失败");
                request.getRequestDispatcher("../register.jsp").forward(request,response);
            }
        }else if (flag.equals("getbyname")){

            int count = userinfoservice.getbyname(a);
            if (count == 0){
                request.getRequestDispatcher("../register.jsp?flag=add").forward(request,response);
            }else{
                request.setAttribute("error","已经存在该用户");
                request.getRequestDispatcher("../register.jsp").forward(request,response);
            }
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
