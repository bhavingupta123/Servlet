package com.bhavin;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet{
	
	ServletConfig conf;
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig conf) throws ServletException {
		
		this.conf = conf;
		System.out.println("creating ");
		
	}

	@Override
	public void doGet(HttpServletRequest  req, HttpServletResponse  res) throws IOException, ServletException {
		
		System.out.println("sadsadsaasasasasasasasd");
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		RequestDispatcher rDispatcher = req.getRequestDispatcher("sq");
		rDispatcher.forward(req, res);
		
		System.out.println((i+j));
		
	}
	

}
