package com.test.servlet;

import com.news.dao.BaseDao;
import com.news.dao.impl.resous;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

@WebServlet(name = "dengluServlet")
public class dengluServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        String name = request.getParameter("username");
        String pwd = request.getParameter("pwd");
        resous r = new resous();
        r.dl(name,pwd);
        if (name.equals("admin")){
            out.print("<script type='text/javascript'charaset=utf-8>");
            out.print("alert(登录成功);");

            out.print("</script>");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }


}
