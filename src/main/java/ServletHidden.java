import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by kevin on 5/6/17.
 */
public class ServletHidden extends HttpServlet {
    public void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws IOException {
        httpServletResponse.setContentType("text/html");
        PrintWriter out=httpServletResponse.getWriter();

        String name=httpServletRequest.getParameter("userName");
        out.println("Welcome "+ name);
        out.print("<form action='servletHidden2'");
        out.print("<input type='hidden' name='uname' value='"+name+"'");
        out.print("<input type='submit' value='go to another servlet'");
        out.print("</form>");
        out.close();
    }
}
