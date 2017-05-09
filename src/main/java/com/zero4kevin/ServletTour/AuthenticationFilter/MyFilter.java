package com.zero4kevin.ServletTour.AuthenticationFilter;

import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by xi1zhang on 2017/5/9.
 */
public class MyFilter implements Filter {
    public void init(FilterConfig arg0) throws ServletException {
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        PrintWriter out = response.getWriter();
        String password = request.getParameter("password");
        if (password.equals("admin")) {
            chain.doFilter(request, response);
        } else {
            out.println("Admin login failed");
            RequestDispatcher rd = request.getRequestDispatcher("index.html");
            rd.include(request, response);
        }

    }

    public void destroy() {
    }
}
