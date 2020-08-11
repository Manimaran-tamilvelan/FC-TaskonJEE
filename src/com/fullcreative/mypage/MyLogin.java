package com.fullcreative.mypage;

import java.io.*;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class MyLogin extends HttpServlet {

	protected void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		String uname = req.getParameter("uname");
		String pwd = req.getParameter("pwd");

		// using pw we can write the output to HttpServletResponse & send it
		PrintWriter pw = res.getWriter();
		
		if (uname.equals("admin") && pwd.equals("admin")) {

			HttpSession sess = req.getSession();
			sess.setAttribute("usr", uname);
			
			res.sendRedirect("welcome.jsp");
		} else {
			// pw.println("Invalid Access");

			res.sendRedirect("login.jsp");
		}

	}

}
