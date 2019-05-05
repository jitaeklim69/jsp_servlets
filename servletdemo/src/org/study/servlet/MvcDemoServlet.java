package org.study.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.study.dao.StudentDataUtil;
import org.study.model.Student;

@WebServlet("/MvcDemoServlet2")
public class MvcDemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public MvcDemoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// step 1: get the student data from helper class (model)
		List<Student> students = StudentDataUtil.getStudents();
		
		// step 2: add students to request object
		request.setAttribute("student_list", students);
		
		// step 3: get request dispatcher
		RequestDispatcher dispatcher = 
				request.getRequestDispatcher("view_students_mvc.jsp");		
		
		// step 4: now forward to JSP
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
