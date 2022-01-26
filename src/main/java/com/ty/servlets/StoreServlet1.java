package com.ty.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ty.dao.StudentDao;
import com.ty.dto.Student;

public class StoreServlet1 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("Id"));
		String name = req.getParameter("name");
		double percentage = Double.parseDouble(req.getParameter("percentage"));

		Student student = new Student();
		student.setId(id);
		student.setName(name);
		student.setPercentage(percentage);

		StudentDao dao = new StudentDao();
		dao.saveObject(student);

		PrintWriter pw = resp.getWriter();
		pw.print("<html><head><h1>success</h1></head></html>");
	}

//	@Override
//	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		doGet(req, resp);
//	}
}
