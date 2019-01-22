package my.example.firstweb.servlet;

import my.example.firstweb.jdbcboard.exam.dao.BoardDao;
import my.example.firstweb.jdbcboard.exam.dao.BoardDaoImp1;
import my.example.firstweb.jdbcboard.exam.dto.Board;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "BoardListServlet", urlPatterns = "/board/list")
public class BoardListServlet extends HttpServlet {
    private static final int SIZE = 5;
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String pageStr = req.getParameter("page");
        int page = 1;
        try{
            page = Integer.parseInt(pageStr);
        }catch(Exception ignore){}
        int start = page*SIZE - SIZE;
        int limit = SIZE;

        BoardDao boardDao = new BoardDaoImp1();
        List<Board> boards = boardDao.getBoards(start,limit);
        req.setAttribute("boards", boards);

        RequestDispatcher requestDispatcher
                = req.getRequestDispatcher("/WEB-INF/views/main.jsp");
        requestDispatcher.forward(req, resp);
    }
}