package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.Employee;
import com.service.EmployeeService;

/**
 * Servlet implementation class EmployeeController
 */
public class EmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    EmployeeService es = new EmployeeService();
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw = response.getWriter();
		List<Employee>  listOfEmp = es.getAllEmployeeDetails();
		int a=10;
		request.setAttribute("abc", a);				// request.getAttribute("abc");
		request.setAttribute("obj", listOfEmp);	   // list of record stored in session scope. 
		RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
		rd.forward(request, response);			// only target page 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw = response.getWriter();
		int id  = Integer.parseInt(request.getParameter("id"));		// convert string to int 
		String name = request.getParameter("name");
		float salary = Float.parseFloat(request.getParameter("salary"));	// convert string to float 
		Employee emp = new Employee(id, name, salary);
		String result = es.storeEmployee(emp);
		pw.print(result);
		doGet(request, response);
		RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
		rd.include(request, response);				// source + target 
	}	

}
