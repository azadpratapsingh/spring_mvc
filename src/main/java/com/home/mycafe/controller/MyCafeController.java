package com.home.mycafe.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyCafeController {
	/*
	 * @RequestMapping("/cafe") public String showWelcomePage() { return
	 * "welcome_page"; }
	 */

	@RequestMapping("/cafe")
	public String showWelcomePage(Model model) {

		return "welcome_page";
	}

	@RequestMapping("/processOrder")
	public String processOrder(HttpServletRequest request, Model model) {
		String userEnteredValue = request.getParameter("foodType");
		// String userEnteredValue = request.getParameter("foodType");
		// model.addAttribute("useInput", userEnteredValue);
		model.addAttribute("userInput", userEnteredValue);
		return "processOrder";
	}
}
