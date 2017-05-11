package com.zero4kevin.ServletTour.InputAndOutputStream;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

/**
 * Created by xi1zhang on 2017/5/11.
 */
public class DisplayImage extends HttpServlet{
    public void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws IOException{
        httpServletResponse.setContentType("image/jpeg");
        ServletOutputStream out=httpServletResponse.getOutputStream();
        FileInputStream fin=new FileInputStream("Lighthouse.jpg");

        BufferedInputStream bin=new BufferedInputStream(fin);
        BufferedOutputStream bout=new BufferedOutputStream(out);
        int i=0;
        while ((i=bin.read())!=-1)
            bout.write(i);
        bin.close();
        fin.close();
        bout.close();
        out.close();
    }
}
