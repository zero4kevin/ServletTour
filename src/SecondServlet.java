import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by kevin on 5/4/17.
 */
public class SecondServlet extends HttpServlet {
    public void doPost(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws IOException {
        httpServletResponse.setContentType("text/html");
        PrintWriter out=httpServletResponse.getWriter();
        Cookie[] cookies=httpServletRequest.getCookies();
        for(int i=0;i<cookies.length-1;i++){
            out.println("Hello "+ cookies[i].getValue());
        }
        out.close();
    }
}
