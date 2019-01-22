package my.examples.jdbc.servlet;

import my.examples.jdbc.dao.BoardDao;
import my.examples.jdbc.dao.BoardDaoImpl;
import my.examples.jdbc.dto.Board;
import my.examples.jdbc.service.BoardService;
import my.examples.jdbc.service.BoardServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

// read?id=5
@WebServlet(name = "WriteServlet", urlPatterns = "/write")
public class WriteServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/WEB-INF/views/writeForm.jsp");
        requestDispatcher.forward(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        String title = req.getParameter("title");
        String contents =  req.getParameter("contents");

        BoardService boardService = new BoardServiceImpl();
        Board board = new Board(title,contents,id);
        boardService.addBoard(board);
        resp.sendRedirect("/list");


    }
}