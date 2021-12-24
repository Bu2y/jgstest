package com.test.servlet;

import com.test.entity.Userinfo;
import com.test.service.UserinfoService;
import com.test.service.impl.UserinfoServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "UserinfoServlet", value = "/UserinfoServlet")
public class UserinfoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();//输出语句
        HttpSession session = request.getSession();
        UserinfoService userinfoService = new UserinfoServiceImpl();

        String action = request.getParameter("action");
        if (action.equals("add")){
            String username=request.getParameter("username");
            String password=request.getParameter("password");
            String email=request.getParameter("email");
            Userinfo userinfo = new Userinfo(username,password,email);
            int count= userinfoService.addUser(userinfo);
            if (count>0){
                request.setAttribute("error","注册成功");
                request.getRequestDispatcher("index.jsp").forward(request,response);
            }else {
                request.setAttribute("error","注册失败");
                request.getRequestDispatcher("register.jsp").forward(request,response);
            }

        }else if (action.equals("denlu")){
            String username=request.getParameter("username");
            String password=request.getParameter("password");
            List<Userinfo> list = userinfoService.denlu(username,password);
            if (list.size()>0){
                session.setAttribute("list",list.get(0).getUsername());
                response.sendRedirect("/Msgservlet?action=select");
            }else {
                request.getRequestDispatcher("index.jsp").forward(request,response);

            }
        }else if (action.equals("byname")){
            String username=request.getParameter("username");
            int count=userinfoService.getByname(username);
            if (count>0){
                request.setAttribute("error","用户已存在！");
                request.getRequestDispatcher("register.jsp").forward(request,response);
            }else {
                request.getRequestDispatcher("/Userinfoservlet?action=add").forward(request,response);
            }
        }else if (action.equals("logout")){
            session.removeAttribute("list");
            request.getRequestDispatcher("index.jsp").forward(request,response);
        }else if (action.equals("findUsers")){
            List<Userinfo> list = userinfoService.userAll();
            session.setAttribute("usernamelist",list);
            String name=request.getParameter("sendto");
            session.setAttribute("username",name);
            response.sendRedirect("newMsg.jsp");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     doGet(request,response);
    }
}
