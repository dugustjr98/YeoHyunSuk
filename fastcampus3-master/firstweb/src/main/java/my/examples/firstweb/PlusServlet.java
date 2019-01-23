package my.examples.firstweb;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

// http://localhost:8080/plus?value1=50&value2=10
@WebServlet(name = "PlusServlet", urlPatterns = "/plus")
public class PlusServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();

        String value1Str = req.getParameter("value1");
        String value2Str = req.getParameter("value2");
        int value1 = 0;
        int value2 = 0;
        try{
            value1 = Integer.parseInt(value1Str);
            value2 = Integer.parseInt(value2Str);
        }catch(Exception ex){
            out.println("<h1>정수만 사용할 수 있어요.</h1>");
            return;
        }


        out.println(value1 + " + " + value2 + " = " + (value1 + value2));
    }
}
