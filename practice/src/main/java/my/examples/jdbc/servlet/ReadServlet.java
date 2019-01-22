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
@WebServlet(name = "ReadServlet", urlPatterns = "/read")
public class ReadServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String idStr = req.getParameter("id");
        Long id = 0L;
        try{
            id = Long.parseLong(idStr);
        }catch(Exception ex){
            // 오류 화면으로 redirect
            return;
        }
        BoardService boardDao = new BoardServiceImpl();
        //boardDao.updateReadCount(id);
        Board board = boardDao.getBoard(id);

        if(board == null){
            // 오류 화면으로 redirect
            return;
        }

        req.setAttribute("board", board);

        RequestDispatcher requestDispatcher =
                req.getRequestDispatcher("/WEB-INF/views/view.jsp");
        requestDispatcher.forward(req, resp);
    }
}