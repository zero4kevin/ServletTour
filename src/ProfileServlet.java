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
public class ProfileServlet extends HttpServlet {
    public void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws IOException, ServletException {
        httpServletResponse.setContentType("text/html");
        PrintWriter out = httpServletResponse.getWriter();
        httpServletRequest.getRequestDispatcher("link.html").include(httpServletRequest, httpServletResponse);
        Cookie[] cookies = httpServletRequest.getCookies();
        for (int i = 0; i < cookies.length; i++) {
            if (null != cookies[i].getValue()) {
                out.println("Welcome " + cookies[i].getValue());
            } else {
                out.println("Please log in first");
                httpServletRequest.getRequestDispatcher("login.html").include(httpServletRequest, httpServletResponse);
            }
        }
    }

}
