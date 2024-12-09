package demo;


import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class SquareServlet extends HttpServlet {

public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
	PrintWriter out=res.getWriter();
	
	
//	int k=(int)req.getAttribute("k");
 
//	HttpSession session=req.getSession();
	
//	int k=(int) session.getAttribute("k");
//	int k=Integer.parseInt(req.getParameter("k"));
	k=k*k;
	out.println("Result :"+k);
	
	int k=0;
	
	Cookie cookies[]=req.getCookies();
	for(Cookie c:cookies) {
		if(c.getName().equals("k")) {
			k=Integer.parseInt(c.getValue());		}
	}
	 
	
}
}
