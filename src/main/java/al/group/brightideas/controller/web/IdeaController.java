package main.java.al.group.brightideas.controller.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import main.java.al.group.brightideas.controller.web.IdeaController;

@Controller
public class IdeaController {

	private final Logger logger = LogManager.getLogger(IdeaController.class);
	

@WebServlet("/BrightIdeas")
public class BrightIdeas extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public BrightIdeas() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

}

	