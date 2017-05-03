import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by xi1zhang on 2017/5/3.
 */
public class DemoServlet1 extends HttpServlet {
    public void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws IOException {
        PrintWriter out = httpServletResponse.getWriter();
        try {
            httpServletResponse.setContentType("text/html");

            ServletContext context = getServletContext();
            context.setAttribute("company", "zero4kevin");

            out.println("Welcome to first servlet");
            out.println("<a href='s2'>click </a>");
            out.close();
        } catch (Exception e) {
            out.println(e);
        }
    }
}
