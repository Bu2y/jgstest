package com.test.servlet;

import com.test.entity.Flower;
import com.test.service.FlowerService;
import com.test.service.impl.FlowerServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet(name = "FlowerServlet")
public class FlowerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out=response.getWriter();
        FlowerService flowerService = new FlowerServiceImpl();
        String flag = request.getParameter("flag");

        if (flag.equals("add")){
            String name = request.getParameter("name");
            String othername = request.getParameter("othername");
            String property = request.getParameter("property");
            Double pirice = Double.parseDouble(request.getParameter("pirice"));
            String production = request.getParameter("production");
            Flower flower = new Flower(name,othername,property,pirice,production);
            int count = flowerService.add(flower);
            if (count>0){
                out.print("true");
            }else {
                out.print("false");
            }
        }

        String a = "2010-09-11";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            //将字符串转换为date类型
            Date date = sdf.parse(a);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Date date2 = new Date();
        String riqi = sdf.format(date2);//日期转换为字符串


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
