import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by kevin on 5/7/17.
 */
public class SecondHttpSession extends HttpServlet{
    public void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws IOException {
        httpServletResponse.setContentType("text/html");
        PrintWriter out=httpServletResponse.getWriter();
        HttpSession session=httpServletRequest.getSession(false);
        out.println("get the name "+ session.getAttribute("uname"));
        out.close();
    }
}
