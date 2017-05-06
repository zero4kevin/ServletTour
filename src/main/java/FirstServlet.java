import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by kevin on 5/4/17.
 */
public class FirstServlet extends HttpServlet {
    public void doPost(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws IOException{
        httpServletResponse.setContentType("text/html");
        PrintWriter out=httpServletResponse.getWriter();

        String name=httpServletRequest.getParameter("userName");
        Cookie cookie=new Cookie("uname", name);
        httpServletResponse.addCookie(cookie);
        out.println("Welcome " + name);
        out.println("<form action=\"cookie2\">");
        out.println("<input type=\"submit\" value=\"go\"");
        out.println("</form>");
        out.close();
    }
}
