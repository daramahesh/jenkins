package com.controller;

import java.io.IOException; 
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entity.Employee;
import com.service.EmployeeServiceClass;

 
public class EmpController extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
	
	@Override
	protected  void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException, IOException{
		  String pathInfo = request.getPathInfo();
		  switch (pathInfo) {
          case "/list":
				list(request, response);
              break;
          case "/getById":
				getById(request, response);
            break;
		  }	 
	}
	
	private void getById(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException {
		String id=request.getParameter("id");
		Employee e= new EmployeeServiceClass().getById(id);
		request.setAttribute("employee",e);
		RequestDispatcher dispatcher=request.getRequestDispatcher("/WEB-INF/views/getById.jsp");
		dispatcher.forward(request, response);
	}

	private void list(HttpServletRequest servletRequest, HttpServletResponse servletResponse) throws ServletException,IOException{
		List<Employee>list=new EmployeeServiceClass().getAllRecords();
		servletRequest.setAttribute("lists",list);
		RequestDispatcher dispatcher=servletRequest.getRequestDispatcher("/WEB-INF/views/employeeList.jsp");
		dispatcher.forward(servletRequest, servletResponse);
	}
	

}
