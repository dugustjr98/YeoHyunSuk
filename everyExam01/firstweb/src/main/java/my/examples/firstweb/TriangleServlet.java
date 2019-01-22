package my.examples.firstweb;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

// http://localhost:8080/triangle
// http://localhost:8080/triangle?height=5
@WebServlet(name = "TriangleServlet", urlPatterns = "/triangle")
public class TriangleServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String heightStr = req.getParameter("height");
        int height = 10;
        try{
            height = Integer.parseInt(heightStr);
        }catch(Exception ignore){}

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        for(int i = 0; i < height; i++){
            for(int k = 0; k <= i; k++){
                out.print("*");
            }
            out.println("<br>");
        }
    }
}
