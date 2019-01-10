package my.example.firstweb;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ForwardServlet", urlPatterns = "/forward")
public class ForwardServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List list = new ArrayList();
        list.add(100);
        list.add(200);
        list.add(300);
        req.setAttribute("count", 100); // setAttribute(String, Object)
        req.setAttribute("str", "stras");
        req.setAttribute("list", list);

        RequestDispatcher requestDispatcher =
                req.getRequestDispatcher("/WEB-INF/views/main.jsp");//  반드시 / 로 시작한다.
        requestDispatcher.forward(req, resp);
    }
}
