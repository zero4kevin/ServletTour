import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by xi1zhang on 2017/5/3.
 */
public class Login extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();

        String userPass=request.getParameter("userPass");

        if(userPass.equals("servlet")){
            RequestDispatcher requestDispatcher=request.getRequestDispatcher("servlet2");
            requestDispatcher.forward(request,response);
        }else{
            out.print("Wrong password");
            RequestDispatcher requestDispatcher=request.getRequestDispatcher("index.html");
            requestDispatcher.include(request,response);
            out.close();
        }
    }
}
