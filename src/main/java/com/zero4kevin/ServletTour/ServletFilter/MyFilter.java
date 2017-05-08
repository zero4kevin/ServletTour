package com.zero4kevin.ServletTour.ServletFilter;
import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by kevin on 5/8/17.
 */
public class MyFilter implements Filter {
    public void init(FilterConfig arg0) throws ServletException{}

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException{
        PrintWriter out=response.getWriter();
        out.print("filter is invoked before");
        chain.doFilter(request,response);//sends request to next resource
        out.print("filter is invoked after");
    }

    public void destroy(){}
}
