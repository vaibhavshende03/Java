package com;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.lang.ProcessBuilder.Redirect;

import com.dao.LoginDao;
import com.mysql.cj.xdevapi.Session;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String uname=request.getParameter("username");
		String password=request.getParameter("password");
		
		LoginDao loginDao=new LoginDao();
		
		
		if(loginDao.check(uname, password)){
			
			HttpSession session=request.getSession();
			session.setAttribute("username", uname);
					
			response.sendRedirect("index.jsp");
		}
		
		else {
			response.sendRedirect("login.jsp");
		}
	}

}
