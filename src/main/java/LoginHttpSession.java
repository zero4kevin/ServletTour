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
public class LoginHttpSession extends HttpServlet {
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        resp.setContentType("text/html");
        PrintWriter out=resp.getWriter();
        req.getRequestDispatcher("linkHttpSession.html").include(req,resp);
        String name=req.getParameter("userName");
        String password=req.getParameter("password");
        if (password.equals("admin123")){
            out.print("Welcome, "+name);
            HttpSession session=req.getSession();
            session.setAttribute("userName", name);

        }else{
            out.println("Wrong password!");
            req.getRequestDispatcher("loginHttpSession.html").include(req, resp);
        }
        out.close();
    }
}
