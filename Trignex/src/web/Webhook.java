package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;


@WebServlet("/Webhook")
public class Webhook extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final Logger log = Logger.getLogger(Webhook.class);
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		log.info("Get ");
		PrintWriter out = response.getWriter();
		out.write("ok");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Enumeration<String> params = request.getParameterNames();
		
		while(params.hasMoreElements()) {
			  String headerName = (String)params.nextElement();
			  log.info("Header Name - " + headerName + ", Value - " + request.getParameter(headerName));
			}
		
		log.info("ok");
		PrintWriter out = response.getWriter();
		out.write("ok");
	}

}
