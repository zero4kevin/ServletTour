import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by kevin on 5/7/17.
 */
public class ProfileHttpSession extends HttpServlet{
    public void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws IOException, ServletException{
        httpServletResponse.setContentType("text/html");
        PrintWriter out=httpServletResponse.getWriter();
        httpServletRequest.getRequestDispatcher("linkHttpSession.html").include(httpServletRequest, httpServletResponse);

        HttpSession session=httpServletRequest.getSession(false);
        if(null!=session){
            out.print("Welcome "+ session.getAttribute("userName"));
        }else{
            out.print("Please log in first");
            httpServletRequest.getRequestDispatcher("loginHttpSession.html").include(httpServletRequest, httpServletResponse);
        }
        out.close();
    }
}
