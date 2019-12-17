package com.capgemini.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetEmployeeServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String idVal = req.getParameter("id");

		// get the Context Param
		ServletContext context = getServletContext();
		String contextParamVal = context.getInitParameter("myContextParam");

		// get config param
		ServletConfig config = getServletConfig();
		String configParamVal = config.getInitParameter("myConfigParam");

		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("Employee Id - " + idVal);
		out.println("<br>Name = Omkar");
		out.println("<br>Salary = 80000");

		out.println("<br><br>Context Param Value = " + contextParamVal);
		out.println("<br><br>Config Param Value = " + configParamVal);

		out.println("</body>");
		out.println("</html>");

	}// end of doGet

}// end of class
