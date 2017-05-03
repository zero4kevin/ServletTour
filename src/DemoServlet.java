import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

/**
 * Created by xi1zhang on 2017/5/3.
 */
public class DemoServlet extends HttpServlet {
    public void doGet(HttpServletRequest httpRequest, HttpServletResponse httpResponse) throws ServletException, IOException {
        httpResponse.setContentType("text/html");
        PrintWriter out=httpResponse.getWriter();
        ServletConfig servletConfig=getServletConfig();
        Enumeration<String> parameters=servletConfig.getInitParameterNames();
        while(parameters.hasMoreElements()){
            String element=parameters.nextElement();
            out.print("<br> Name is "+ element);
            out.print(" value is " +servletConfig.getInitParameter(element));
        }

        ServletContext application=getServletContext();
        parameters=application.getInitParameterNames();
        while(parameters.hasMoreElements()){
            String element=parameters.nextElement();
            out.print("<br> Name is "+ element);
            out.print(" value is " +application.getInitParameter(element));
        }

        out.close();
    }
}

