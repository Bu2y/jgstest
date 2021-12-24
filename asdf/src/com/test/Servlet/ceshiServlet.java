package com.test.Servlet;

import com.test.Service.ServiceImpl.ffServiceImpl;
import com.test.Service.ffService;
import com.test.entity.lei;

import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@javax.servlet.annotation.WebServlet(name = "ceshiServlet")
public class ceshiServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out=response.getWriter();
        HttpSession session = request.getSession();
        ffService ffService = new ffServiceImpl();
        String flag = request.getParameter("flag");

        if (flag.equals("getid")){
            int id = Integer.parseInt(request.getParameter("id"));
            List<lei> list = ffService.getid(id);
            session.setAttribute("work", list);
            response.sendRedirect("getid.jsp");
        }
        if (flag.equals("all")){
            List<lei> list = ffService.getall();
            session.setAttribute("list", list);
            response.sendRedirect("getall.jsp");
        }

        if (flag.equals("add")){
            String title = request.getParameter("title");
            String content = request.getParameter("content");
            int type = Integer.parseInt(request.getParameter("type"));
            lei lei= new lei(title,content,type);
            int cont = ffService.add(lei);

            if (cont>0){
                out.println("<script type='text/javascript'>");
                out.println("alert(\"保存成功！\");");
                out.println("location.href=\"/a?flag=all\";");
                out.println("</script>");
            }else {
                out.println("<script type='text/javascript'>");
                out.println("alert(\"保存失败！\");");
                out.println("location.href=\"index.jsp\";");
                out.println("</script>");
            }
        }
        if (flag.equals("bytitle")){
            String title = request.getParameter("title");
            int count = ffService.gettitle(title);
            System.out.println(count);
            if (count>0){
                out.print("true");
            }else {
                out.print("false");
            }
        }





    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        doPost(request,response);
    }
}
