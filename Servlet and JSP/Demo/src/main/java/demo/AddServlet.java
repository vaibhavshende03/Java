package demo;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jakarta.servlet.http.Cookie;
public class AddServlet extends HttpServlet {
//	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
//	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
	/**
	 *
	 */
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {

		int i= Integer.parseInt(req.getParameter("num1"));
		int j= Integer.parseInt(req.getParameter("num2"));
		int k=i+j;
//		System.out.println("The result is :"+k);
//		res.getWriter().println("result is "+k);
//		PrintWriter out=res.getWriter();
//		
//		out.println("result is "+k);
		
//		req.setAttribute("k", k);
//
//		//rd
//		RequestDispatcher rd=req.getRequestDispatcher("/sq");
//		rd.forward(req, res);
//		 
		//SendRedirect
		
//		Session
		
//		HttpSession session=req.getSession();
//		session.setAttribute("k",k);
		
		Cookie cookie=new Cookie("k",k+" ");
		res.addCookie(cookie);
		
		res.sendRedirect("sq");
	}

}
