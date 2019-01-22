package my.examples.jdbc.servlet;

import my.examples.jdbc.dao.BoardDao;
import my.examples.jdbc.dao.BoardDaoImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "DeleteServlet", urlPatterns = "/delete")
public class DeleteServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Long id =0L;
        try{
            String idstr = req.getParameter("id");
            id = Long.parseLong(idstr);
        }catch(Exception e){}
        BoardDao boardDao = new BoardDaoImpl();
        boardDao.deleteBoard(id);

        resp.sendRedirect("/list");
    }
}
