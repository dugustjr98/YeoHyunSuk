package my.example.firstweb;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "StarServlet", urlPatterns = "/star")
public class StarServlet extends HttpServlet{
    public StarServlet(){
        System.out.println("StarServlet()");
    }
//star?height=5 라 한다면
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String heightStr = req.getParameter("height");
        String heightStr1 = req.getParameter("height2");
        int height =10;
        int height2=20;
        try{
            height = Integer.parseInt(heightStr);
            height2 = Integer.parseInt(heightStr1);
        }catch(Exception ignore){}
        resp.setContentType("text/html"); // 값을 받아들이는걸 먼저 해야됨
        PrintWriter out = resp.getWriter();

        height +=height2;
        for(int i=0; i<height;i++){
            for(int j=0;j<i;j++){
                out.print("*");
            }
        out.println("<br>");}
    }

    @Override
    public void destroy() {
        System.out.println("------destroy------");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("-------init--------");
    }
}
