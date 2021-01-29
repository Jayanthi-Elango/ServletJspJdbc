package com.jayanthi.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jayanthi.web.dao.employeeinfoDao;
import com.jayanthi.web.model.employeeinfo;

/**
 * Servlet implementation class GetEmployeeInfoController
 */
public class GetEmployeeInfoController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int user_id= Integer.parseInt(request.getParameter("user_id"));
		employeeinfoDao dao= new employeeinfoDao();
		employeeinfo e=dao.getemployeeinfo(user_id);
		RequestDispatcher rd= request.getRequestDispatcher("showEmployeeInfo.jsp");
		rd.forward(request, response);
		
		
		
		
	}
	}


