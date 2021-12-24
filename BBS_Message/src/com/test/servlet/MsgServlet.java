package com.test.servlet;

import com.test.entity.Msg;
import com.test.service.MsgService;
import com.test.service.impl.MsgServiceImpl;
import com.test.util.PageBean;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "MsgServlet", value = "/MsgServlet")
public class MsgServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     request.setCharacterEncoding("utf-8");
     response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();//输出
        HttpSession session= request.getSession();//调用session
        MsgService msgService = new MsgServiceImpl();
        String action=request.getParameter("action");
        if (action.equals("select")){
            PageBean pageBean = new PageBean();//分页工具类
            String name=(String)session.getAttribute("list");
            //String username=name;
            pageBean.setAllRows(msgService.getCount(name/*username*/));//总条数
            String index=request.getParameter("pageIndex");
            if (index!=null){
                Integer pageIndex=Integer.parseInt(index);
                //当前码为0时,设置当前页码为1
                if (pageIndex<=0){
                    pageIndex=1;
                    //如果页码超出总页数，当前页码为总页数的值
                }else if(pageIndex>pageBean.getTotalpage()){
                    pageIndex=pageBean.getTotalpage();
                }
                //把当前页码重新赋值给pageIndex属性
                pageBean.setPageIndex(pageIndex);
            }
            pageBean.setPageList(msgService.selectAll(pageBean,name/*username*/));//数据
            session.setAttribute("page",pageBean);//当前页数
            session.setAttribute("totalpage",pageBean.getTotalpage());//页数总和
            session.setAttribute("msgList",pageBean.getPageList());//集合数据
            request.getRequestDispatcher("/main.jsp").forward(request,response);
        }else if (action.equals("read")){//根据id查看短信信息
            int msgid=Integer.parseInt(request.getParameter("msgid"));
            Msg msg=msgService.getIdName(msgid);
            session.setAttribute("msg",msg);
            request.setAttribute("msgid",msgid);
            request.getRequestDispatcher("/Msgservlet?action=update").forward(request,response);
        }else if (action.equals("del")){//根据id删除
            int msgid=Integer.parseInt(request.getParameter("msgid"));
            msgService.getdelId(msgid);
            request.getRequestDispatcher("/Msgservlet?action=select").forward(request,response);
        }else if (action.equals("update")){
          int msgid=(int)request.getAttribute("msgid");
            msgService.getUpdate(msgid);
            request.getRequestDispatcher("readMsg.jsp").forward(request,response);
        }else if (action.equals("send")){
            String name = request.getParameter("toUser");
           String title= request.getParameter("title");
           String content=request.getParameter("content");
           String  username=(String)session.getAttribute("list");
           Msg msg = new Msg(username,title,content,name);
           msgService.getInsert(msg);
           request.getRequestDispatcher("/Msgservlet?action=select").forward(request,response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      doGet(request,response);
    }
}
