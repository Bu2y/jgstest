package Servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

@WebServlet(name = "userServlet")
public class userServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");

        PrintWriter out = response.getWriter();
        String name = request.getParameter("username");
        boolean flag = false;

        if (name.equals("admin")){
            flag=true;
        }else {
            flag=false;
        }
        out.print(flag);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");

        PrintWriter out = response.getWriter();
        String name = request.getParameter("username");
        boolean flag = false;

        if (name.equals("admin")){
            flag=true;
        }else {
            flag=false;
        }
        out.print(flag);
        out.flush();
        out.close();
    }
}
