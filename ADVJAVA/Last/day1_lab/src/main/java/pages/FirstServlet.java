package pages;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet(value = "/test1")
public class FirstServlet extends HttpServlet 
/*
 * WC creates a map Key : /test1 Value : pages.FirstServlet
 */
{
	private static final long serialVersionUID = 1L;

	/**
	 * @see Servlet#init
	 */
	public void init(ServletConfig config) throws ServletException {
	  System.out.println("in init "+Thread.currentThread().getName());
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		  System.out.println("in destroy "+Thread.currentThread().getName());
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  System.out.println("in doget "+Thread.currentThread().getName());
		  //1.set resp content type
		  response.setContentType("text/html");
		  //2.Get PW to send buffered char resp from servlet -->clnt
		try(PrintWriter pw=response.getWriter()){
			//3. generate dyn resp
			pw.print("<h5> Welcome to Servlet "+ getClass()+":"+LocalDateTime.now()+"</h5>");
		}  
		
	}

}
