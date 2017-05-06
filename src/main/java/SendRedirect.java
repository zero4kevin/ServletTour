import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by xi1zhang on 2017/5/3.
 */
public class SendRedirect extends HttpServlet {
    public void doGet(HttpServletRequest servletRequest, HttpServletResponse servletResponse) throws ServletException, IOException{
        servletResponse.sendRedirect("http://www.bing.com/search?q="+servletRequest.getParameter("content"));
    }
}
