package main.java.al.group.brightideas.controller.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import main.java.al.group.brightideas.model.Idea;
import main.java.al.group.brightideas.model.Like;
import main.java.al.group.brightideas.service.IdeaService;
import main.java.al.group.brightideas.service.LikeService;


@Controller
public class IdeaController {

	private final Logger logger = LogManager.getLogger(IdeaController.class);
	
	@Autowired
	private IdeaService ideaService;
	
	@Autowired
	private LikeService likeService;
	

	
	@GetMapping({ "/bright_ideas" })
	public String idea(Model model, HttpServletRequest request) {
		
		this.logger.debug("user name " + request.getUserPrincipal().getName());
		
		List<Idea> idea = (List<Idea>) this.ideaService.findAll();
		
		List<Map<String, Object>> ideaListMap = new ArrayList<Map<String, Object>>();

		return "welcome";

	}

	@PostMapping("/bright_ideas")
	public String createIdea(Model model, @ModelAttribute("ideaForm") Idea showForm, BindingResult bindingResult,
			HttpServletRequest request) {

		
		return "redirect:/comment";
		
	}	
	
	

	@GetMapping({ "/bright_ideas" })
	public String like(Model model, HttpServletRequest request) {
		
		this.logger.debug("user name " + request.getUserPrincipal().getName());
		
		List<Like> idea = (List<Like>) this.likeService.findAll();
		
		List<Map<String, Object>> likeListMap = new ArrayList<Map<String, Object>>();

		return "like";

	}

	@PostMapping("/bright_ideas")
	public String createLike(Model model, @ModelAttribute("likeForm") Like likeForm, BindingResult bindingResult,
			HttpServletRequest request) {

		
		return "redirect:/comment";
		
	}	
	
	
	@GetMapping({ "/bright_ideas" })
	public String Alias(Model model, HttpServletRequest request) {
		
		this.logger.debug("user name " + request.getUserPrincipal().getName());
		
		
		
		List<Map<String, Object>> aliasListMap = new ArrayList<Map<String, Object>>();

		return "welcome";

	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public Logger getLogger() {
		return logger;
	}





















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

	