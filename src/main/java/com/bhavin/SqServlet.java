package com.bhavin ;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SqServlet extends HttpServlet{
	
	//ServletConfig conf;
	
	/*
	@Override
	public void init(ServletConfig conf) throws ServletException {
		// TODO Auto-generated method stub
		
		//this.conf = conf;
		System.out.println("sq sq sq ");
		
	}*/
	
	@Override
	public void doGet(HttpServletRequest request , HttpServletResponse response) throws IOException {
		
		PrintWriter outPrintWriter = response.getWriter();
		
		outPrintWriter.println("mulsss");
		
	}
}