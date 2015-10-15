package com.enlistasidekick.spring.controller;

import com.enlistasidekick.spring.beans.*;
import com.enlistasidekick.spring.beans.ChallengeRequest.Frequency;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
//@SessionAttributes
public class EnlistController {
	@ModelAttribute("frequencies")
	public Frequency[] frequencies() {
		return Frequency.values();
	}	
	
	@RequestMapping(value="form", method=RequestMethod.GET) 
	public String loadFormPage(Model m) {
		m.addAttribute("challenger", new ChallengeRequest()); 
		return "form"; 
	}
	
	@RequestMapping(value="form", method=RequestMethod.POST)
	public String submitForm(@ModelAttribute("challenger") ChallengeRequest seekingSidekick, Model m) {
		m.addAttribute("message", "Your challenge has been sent: " + seekingSidekick.toString());
		return "form";
	}
}
