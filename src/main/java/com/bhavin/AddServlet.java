package com.bhavin;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/add") // using annotations
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
		
		//RequestDispatcher rDispatcher = req.getRequestDispatcher("sq");
		
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int k = i +j;
		
		/*ways to send data to another servlet OR use getParameter in other servlet*/
		
		//req.setAttribute("k",k); // --> 2
		
		//rDispatcher.forward(req, res);
		
		
		
		/*using send redirect and sending data using URL redirect*/
		
		//res.sendRedirect("sq?k=" + k);
		
		
		
		
		/* using session to send data */
		
		//HttpSession session = req.getSession();
		//session.setAttribute("k",k);
		
		//res.sendRedirect("sq");
		
		
		
		/*using cookies to send data*/
		
		Cookie cookie = new Cookie("k" , k + ""); //cookie needs to be string
		res.addCookie(cookie);
		
		res.sendRedirect("sq");
		
	}
	

}
