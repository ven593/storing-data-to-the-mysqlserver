package com.ty.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id")); 
		String name = req.getParameter("name");
		double percentage = Double.parseDouble(req.getParameter("percentage"));
		
		PrintWriter out = resp.getWriter(); 
		if(name.equals("venkatesh") && id == 123 )
		{
		out.print("<html><head><h1>done ...!!!!!</h1></head></html>");
		}
		else
		{
			out.print("<html><head><h1>enter valid details.....</h1></head></html>");
		}
		
		
	}

}
