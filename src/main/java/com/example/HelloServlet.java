package com.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/hello")

public class HelloServlet extends HttpServlet {

protected void doGet(HttpServletRequest request,
HttpServletResponse response)
throws IOException {

response.setContentType("text/html");

PrintWriter out=response.getWriter();

out.println("<h1>Hello Jenkins</h1>");

}

}
