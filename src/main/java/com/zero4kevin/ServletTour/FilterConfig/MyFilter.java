package com.zero4kevin.ServletTour.FilterConfig;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by xi1zhang on 2017/5/9.
 */
public class MyFilter implements Filter {
    FilterConfig config;
    public void init(FilterConfig config) throws ServletException {
        this.config=config;
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException{
        PrintWriter out=response.getWriter();
        String s=config.getInitParameter("construction");
        if("yes".equals(s)){
            out.print("This page is under construction");
        }else{
           chain.doFilter(request,response);
        }
    }

    public void destroy(){}
}
