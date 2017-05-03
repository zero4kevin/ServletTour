import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by xi1zhang on 2017/5/2.
 */
public class ServletDemo extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");//setting the content type
        PrintWriter pw = res.getWriter();//get the stream to write the data
        String name = req.getParameter("name");

        pw.println("<html><body>");
        if (null !=name){
            pw.println("Welcome " + name + " to servlet");
        }else{
            pw.println("Welcome to servlet");
        }
        pw.println("</body></html>");

        pw.close();//closing the stream
    }
}
