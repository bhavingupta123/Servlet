package com.bhavin ;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/sq") // using annotations
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
		
		/*
		
		One way to fetch data
		
		int i = Integer.parseInt(request.getParameter("num1"));
		int j = Integer.parseInt(request.getParameter("num2"));
		
		*/
		
		
		
		/* other way of getting data --> 2*/
		
		//int k = (int)request.getAttribute("k");
		
		//outPrintWriter.println(k*k);
		
		
		/*using send redirect to fetch data by using URL redirecting*/
		
		//int k = Integer.parseInt(request.getParameter("k"));
		
		
		
		
		/* fetching k value from session */
		
		//HttpSession session = request.getSession();
		
		//int k = (int)session.getAttribute("k");
		
		
		
		
		
		/* fetching data using cookies */
		
		int k = 0;
		Cookie cookie[] =  request.getCookies(); // as can have many cookies so array
		
		for(Cookie c:cookie) {
			if(c.getName().equals("k"))
				k = Integer.parseInt(c.getValue());
		}
		
		outPrintWriter.println("product:" + k*k);
		
		System.out.println("sq called:" + k*k);
	}
}