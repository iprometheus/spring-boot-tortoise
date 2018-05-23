package com.fangxing.samples.infrastructure.sevlet;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class JobScheduleSevlet extends HttpServlet  implements Servlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("application/json; charset=utf-8");

        PrintWriter out = null;
        out = resp.getWriter();
        out.append("{\"name\":\"suxiaolong\"}");
        out.close();
        System.out.printf("hello");
    }
}
