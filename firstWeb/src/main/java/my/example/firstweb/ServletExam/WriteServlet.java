package my.example.firstweb.ServletExam;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "WriteServlet", urlPatterns = "/write")
public class WriteServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setAttribute("count", 100); // setAttribute(String, Object)
        req.setAttribute("str", "stras");

        RequestDispatcher requestDispatcher =
                req.getRequestDispatcher("/WEB-INF/views/Formtag.jsp");//  반드시 / 로 시작한다.
        requestDispatcher.forward(req, resp);
    }
}
