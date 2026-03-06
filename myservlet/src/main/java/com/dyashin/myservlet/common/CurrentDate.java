package com.dyashin.myservlet.common;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class CurrentDate extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Date dateref=new Date();
		PrintWriter out=resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>Current date and time is : "+dateref+"</h1>");
		out.println("</body>");
		out.println("</html>");
		
		Cookie cookie = new Cookie("username", "1");
		cookie.setMaxAge(60*60*24);
		resp.addCookie(cookie);
		
		//code to generate dynamic response
		resp.setContentType("text/html");
		resp.setHeader("refresh", "1");
	}
}
