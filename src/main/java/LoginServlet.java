import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by xi1zhang on 2017/5/5.
 */
public class LoginServlet extends HttpServlet {
    public void doPost(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws IOException, ServletException {
        httpServletResponse.setContentType("text/html");
        PrintWriter out = httpServletResponse.getWriter();
        String name = httpServletRequest.getParameter("name");
        String password = httpServletRequest.getParameter("password");
        httpServletRequest.getRequestDispatcher("link.html").include(httpServletRequest, httpServletResponse);
        if(password.equals("admin123")){
            out.println("Welcome "+ name);
            out.println("You successfully logged in.");
        }else{
            out.println("Sorry logging in failed");
            httpServletRequest.getRequestDispatcher("login.html").include(httpServletRequest,httpServletResponse);
        }
        out.close();
    }
}
