package my.example.firstweb.webexample;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "FormtagServlet", urlPatterns = "/board/formtag")
public class FormtagServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setAttribute("count", 10);
        req.setCharacterEncoding("UTF-8");
        RequestDispatcher requestDispatcher
                = req.getRequestDispatcher("/WEB-INF/views/Formtag.jsp");
        requestDispatcher.forward(req, resp);
    }
}