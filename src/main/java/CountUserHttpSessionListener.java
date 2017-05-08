import javax.servlet.ServletContext;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Created by xi1zhang on 2017/5/8.
 */
public class CountUserHttpSessionListener implements HttpSessionListener {
    ServletContext context=null;
    static int total=0,current=0;

    public void sessionCreated(HttpSessionEvent event){
        total++;
        current++;
        context=event.getSession().getServletContext();
        context.setAttribute("totalusers", total);
        context.setAttribute("currentusers", current);
    }

    public void sessionDestroyed(HttpSessionEvent event){
        current--;
        context.setAttribute("currentusers", current);
    }
}
