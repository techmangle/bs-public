package org.bs.train;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns="/mobile")
public class MobileServlet extends HttpServlet {

    private MobileStock mobileStock = null;

    public MobileServlet() {
        mobileStock = new MobileStock();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
        String modelName = req.getParameter("model");
        String mobileInfo = mobileStock.getMobileInfo(modelName);
        if(mobileInfo == null){
            mobileInfo = "Please specify model parameter..";
        }
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.print(mobileInfo.toString());
        out.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}