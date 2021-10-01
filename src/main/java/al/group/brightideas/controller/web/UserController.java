package main.java.al.group.brightideas.controller.web;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import main.java.al.group.brightideas.model.User;
import main.java.al.group.brightideas.service.RoleService;
import main.java.al.group.brightideas.service.SecurityService;
import main.java.al.group.brightideas.service.UserService;
import main.java.al.group.brightideas.validator.UserValidator;



@Controller
public class UserController {

	private final Logger logger = LogManager.getLogger(UserController.class);
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private RoleService roleService;

	@Autowired
	private SecurityService securityService;

	@Autowired
	private UserValidator userValidator;

	@PostMapping("/register")
	public String registration(@ModelAttribute("registerForm") User registerForm, BindingResult bindingResult) {
		userValidator.validate(registerForm, bindingResult);

		if (bindingResult.hasErrors()) {
			return "login";
		}

		registerForm.setRoles(this.roleService.findAll());
        userService.save(registerForm);

		securityService.autoLogin(registerForm.getUsername(), registerForm.getPasswordConfirm());

		this.logger.info("user registerd successfully.");
		
		return "redirect:/bright_ideas";
	}

	@GetMapping("/main")
	public String login(Model model, String error, String logout) {
		if (error != null)
			model.addAttribute("error", "Your email, username and password is invalid.");

		if (logout != null)
			model.addAttribute("message", "You have been logged out successfully.");

		model.addAttribute("registerForm", new User());
		
		return "login";
	}

}
