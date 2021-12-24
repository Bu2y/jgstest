//package com.test.Servlet;
//
//import com.financingproduct.entity.Financingproduct;
//import com.financingproduct.service.FinancingProductService;
//import com.financingproduct.service.impl.FinancingProductServiceImpl;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//import java.util.List;
//
//@WebServlet(name = "FinancingProductServlet")
//public class FinancingProductServlet extends HttpServlet {
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        request.setCharacterEncoding("utf-8");
//        response.setContentType("text/html;charset=utf-8");
//        String flag=request.getParameter("flag");
//        PrintWriter out=response.getWriter();
//        FinancingProductService financingProductService=new FinancingProductServiceImpl();
//        //查询所有
//        if(flag.equals("all")){
//            String id=request.getParameter("id");
//            String fengxian=request.getParameter("risk");
//            Long risk=0L;
//            if(fengxian!=null){
//                risk=Long.parseLong(fengxian);
//            }
//            List<Financingproduct> list=financingProductService.getAll(id,risk);
//            request.setAttribute("list",list);
//            request.getRequestDispatcher("index.jsp").forward(request,response);
//        }else if(flag.equals("byid")){//验证编号是否存在
//            String id=request.getParameter("id");
//            int count=financingProductService.getById(id);
//            if(count>0){
//                out.print("{\"result\":\"true\"}");
//            }else{
//                out.print("{\"result\":\"false\"}");
//            }
//        }else if(flag.equals("add")){//新增
//            String id=request.getParameter("id");
//            String risk=request.getParameter("risk");
//            String income=request.getParameter("income");
//            String salestarting=request.getParameter("salestarting");
//            String saleend=request.getParameter("saleend");
//            String end=request.getParameter("end");
//            Financingproduct financingproduct=new Financingproduct();
//            financingproduct.setId(id);
//            financingproduct.setRisk(Long.parseLong(risk));
//            financingproduct.setIncome(income);
//            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
//            Date d1=null;
//            Date d2=null;
//            Date d3=null;
//            try {
//                d1=sdf.parse(salestarting);
//                d2=sdf.parse(saleend);
//                d3=sdf.parse(end);
//            } catch (ParseException e) {
//                e.printStackTrace();
//            }
//            financingproduct.setSalestarting(d1);;
//            financingproduct.setSaleend(d2);
//            financingproduct.setEnd(d3);
//            int count=financingProductService.add(financingproduct);
//            if(count>0){
//                out.println("<script type='text/javascript'>");
//                out.println("alert(\"保存成功！\");");
//                out.println("location.href=\"/a?flag=all\";");
//                out.println("</script>");
//            }else{
//                out.println("<script type='text/javascript'>");
//                out.println("alert(\"保存失败！\");");
//                out.println("location.href=\"add.jsp\";");
//                out.println("</script>");
//            }
//        }
//    }
//
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        doPost(request,response);
//    }
//}
