package servlet;

import entity.Working;
import service.Impl.WorkingServiceImpl;
import service.WorkingService;

import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@javax.servlet.annotation.WebServlet(name = "WorkingServlet")
public class WorkingServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out=response.getWriter();
        HttpSession session = request.getSession();
        WorkingService workingService = new WorkingServiceImpl();
        String flag = request.getParameter("flag");

        if (flag.equals("getid")){
            int id = Integer.parseInt(request.getParameter("id"));
            List<Working> list = workingService.getid(id);
            session.setAttribute("work", list);
            response.sendRedirect("chakan.jsp");
        }
        if (flag.equals("all")){
            List<Working> list = workingService.getall();
            session.setAttribute("list", list);
            response.sendRedirect("index.jsp");
        }

        if (flag.equals("add")){
            String title = request.getParameter("title");
            String content = request.getParameter("content");
            int type = Integer.parseInt(request.getParameter("type"));
            Working working = new Working(title,content,type);
            int cont = workingService.add(working);

            if (cont>0){
                out.println("<script type='text/javascript'>");
                out.println("alert(\"保存成功！\");");
                out.println("location.href=\"/a?flag=all\";");
                out.println("</script>");
            }else {
                out.println("<script type='text/javascript'>");
                out.println("alert(\"保存失败！\");");
                out.println("location.href=\"tianjia.jsp\";");
                out.println("</script>");
            }
        }
        if (flag.equals("bytitle")){
            String title = request.getParameter("title");
            int count = workingService.gettitle(title);
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
