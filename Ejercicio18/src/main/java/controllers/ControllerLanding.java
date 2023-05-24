package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hola")
public class ControllerLanding {
	
	@GetMapping
	public String saludar()
	{
		return "index";
	}
}
