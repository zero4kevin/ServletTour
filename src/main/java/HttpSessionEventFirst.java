import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by xi1zhang on 2017/5/8.
 */
public class HttpSessionEventFirst extends HttpServlet {
    public void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException{
        httpServletResponse.setContentType("text/html");
        PrintWriter out=httpServletResponse.getWriter();
        String name=httpServletRequest.getParameter("userName");
        httpServletRequest.getSession(false).setAttribute("unamme",name);

        ServletContext context=getServletContext();
        out.print("<br>total users="+context.getAttribute("totalusers"));
        out.print("<br>current users="+context.getAttribute("currentusers"));
        out.print("<br><a href='logoutHttpSessionEvent'>logout</a>");
    }
}
