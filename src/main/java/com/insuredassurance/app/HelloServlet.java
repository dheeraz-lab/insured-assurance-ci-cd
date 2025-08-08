package com.insured.app;
 import java.io.IOException;
 import javax.servlet.ServletException;
 import javax.servlet.http.HttpServlet;
 import javax.servlet.http.HttpServletRequest;
 import javax.servlet.http.HttpServletResponse;
 public class HelloServlet extends HttpServlet {
 private static final long serialVersionUID = 1L;
 @Override
 protected void doGet(HttpServletRequest req, HttpServletResponse resp)
 4
throws ServletException, IOException {
 resp.setContentType("text/html;charset=UTF-8");
 resp.getWriter().println("<html><head><title>Insured Assurance App</
 title></head><body>");
 resp.getWriter().println("<h1>Hello from Insured Assurance</h1>");
 resp.getWriter().println("<p>Deployed on Tomcat</p>");
 resp.getWriter().println("</body></html>");
 }
 }
