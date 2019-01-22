package my.example.firstweb.ServletExam;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

@WebServlet("/FormExample")
public class FormExample extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=UTF-8");
        PrintWriter out = resp.getWriter();

        try{
            req.setCharacterEncoding("UTF-8");
        }catch (UnsupportedEncodingException e){
            e.printStackTrace();
        }

        out.println("<HTML><HEAD><TITLE>여러가지 form들</TITLE></HEAD><BODY>");
        out.println("<H1>받은 Data 목록</H1><BR>");
        out.println("이름:"+req.getParameter("name"));
        out.println("<BR><BR>");
        out.println("나이:"+req.getParameter("age"));
        out.println("<BR><BR>");
        out.println("언어:"+req.getParameter("language"));
        out.println("<BR><BR>");
        out.println("지역:"+req.getParameter("local"));
        out.println("<BR><BR>");


    }

}
