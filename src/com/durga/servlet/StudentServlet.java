package com.durga.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.durga.beans.Student;
import com.durga.dao.StudentDao;

/**
 * Servlet implementation class StudentServlet
 */
@WebServlet("/addstudent")
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public StudentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String address=request.getParameter("address");
		//////////////////////////
		Student s1=new Student();
		s1.setName(name);
		s1.setEmail(email);
		s1.setAddress(address);
		try {
			int status=StudentDao.addStudent(s1);
			if(status>0)
			{
				PrintWriter out=response.getWriter();
				out.print("data inserted");
			}
			else
			{
				PrintWriter out=response.getWriter();
				out.print("data not inserted");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
