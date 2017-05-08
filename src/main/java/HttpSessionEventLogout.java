import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by xi1zhang on 2017/5/8.
 */
public class HttpSessionEventLogout extends HttpServlet{
    public void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws IOException {
        httpServletResponse.setContentType("text/html");
        PrintWriter out=httpServletResponse.getWriter();
        HttpSession session=httpServletRequest.getSession(false);
        if(null!=session){
            out.print(session.getAttribute("uname")+" logged out successfully");
            session.invalidate();
        }else{
            out.print("Logged out successfully");
        }
        out.close();
    }
}
