package com.fullcreative.mypage;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/logout")
public class MyLogout extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {

		HttpSession sess = req.getSession();
		sess.removeAttribute("usr");
		sess.invalidate();
		
		res.sendRedirect("login.jsp");
	}

}
