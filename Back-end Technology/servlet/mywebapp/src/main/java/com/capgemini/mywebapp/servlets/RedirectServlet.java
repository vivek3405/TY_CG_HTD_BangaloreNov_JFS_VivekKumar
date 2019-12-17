package com.capgemini.mywebapp.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/redirect")
public class RedirectServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String url = "http://www.youtube.com"; //http is required since if we will not give then it will act as internal resource
		
		//String url = "http://localhost:8080/mywebapp/currentDate";  //Internal resource
		//String url = "./currentDate";  //External Resource
		
		resp.sendRedirect(url);

	}//end of doGAet()

}//end of class
