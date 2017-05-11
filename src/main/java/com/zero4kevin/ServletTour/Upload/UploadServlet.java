package com.zero4kevin.ServletTour.Upload;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by xi1zhang on 2017/5/11.
 */
public class UploadServlet extends HttpServlet {
    public void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws IOException {
        httpServletResponse.setContentType("text/html");
        PrintWriter out=httpServletResponse.getWriter();

//        MultipartRequest m=new MultipartRequest(httpServletRequest, "d:/");
    }
}
