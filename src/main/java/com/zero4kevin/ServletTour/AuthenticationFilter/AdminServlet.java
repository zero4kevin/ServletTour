package com.zero4kevin.ServletTour.AuthenticationFilter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by xi1zhang on 2017/5/9.
 */
public class AdminServlet extends HttpServlet {
    public void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws IOException{
        httpServletResponse.setContentType("text/html");
        PrintWriter out=httpServletResponse.getWriter();
        out.println("Welcome admin");
        out.close();
    }
}
