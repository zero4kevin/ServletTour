import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by kevin on 5/7/17.
 */
public class ServletHidden2 extends HttpServlet {
    public void doPost(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws IOException{
        httpServletResponse.setContentType("text/html");
        PrintWriter out=httpServletResponse.getWriter();
        out.print("Welcome "+ httpServletRequest.getParameter("uname")+" to the second servlet" );
        out.close();
    }
}
