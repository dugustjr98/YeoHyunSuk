package my.example.firstweb.webexample;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "BoardListServlet", urlPatterns = "/board/list")
public class BoardListServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setAttribute("count", 100);
        BoardList boardList = new BoardList();
        req.setAttribute("list", boardList.getBoardList());

        RequestDispatcher requestDispatcher
                = req.getRequestDispatcher("/WEB-INF/views/hello.jsp");
        requestDispatcher.forward(req, resp);
    }
}