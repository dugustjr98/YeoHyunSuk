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

@WebServlet(name = "ShowServlet", urlPatterns = "/board/show")
public class ShowServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       BoardList boardList = new BoardList();
        int i=0;

        i=Integer.parseInt(req.getParameter("id"))-1;
        req.setAttribute("board",boardList.getBoardList().get(i));
        RequestDispatcher requestDispatcher
                = req.getRequestDispatcher("/WEB-INF/views/show.jsp");
        requestDispatcher.forward(req, resp);
    }
}