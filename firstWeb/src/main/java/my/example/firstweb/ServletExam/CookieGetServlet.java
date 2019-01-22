package my.example.firstweb.ServletExam;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CookieGetServlet", urlPatterns = "/cookieget")
public class CookieGetServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();

        Cookie[] cookies = req.getCookies();
        if(cookies != null){
            for(int i = 0; i < cookies.length; i++){
                Cookie cookie = cookies[i];
                out.println(cookie.getName() + " :" + cookie.getValue() + "<br>");
            }
        }else{
            out.println("쿠키가 없어요.");
        }
    }

    @Override
    public void destroy() {
        System.out.println("----- destroy -----");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("----- init -----");
    }
}