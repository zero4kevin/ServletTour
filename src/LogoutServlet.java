import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by xi1zhang on 2017/5/5.
 */
public class LogoutServlet extends HttpServlet{
    public void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws IOException,ServletException{
        httpServletResponse.setContentType("text/html");
        PrintWriter out=httpServletResponse.getWriter();
        httpServletRequest.getRequestDispatcher("link.html").include(httpServletRequest,httpServletResponse);
//        Cookie[] cookies=httpServletRequest.getCookies();
//        for(int i=0;i<cookies.length;i++){
//            cookies[i].setMaxAge(0);
//        }
        Cookie cookie=new Cookie("name","");
        cookie.setMaxAge(0);
        httpServletResponse.addCookie(cookie);

        out.println("You successfully logged out!");

    }
}
