package com.capgemini.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DateServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Date date = new Date();
		
		resp.setContentType("text/html");
		resp.setHeader("refresh", "1");
		PrintWriter out=resp.getWriter();
		out.println("<html>");
		out.println("<h2>Current System date & time -<br>"+date+"</h2>");
		out.println("</html>");
	}

}
