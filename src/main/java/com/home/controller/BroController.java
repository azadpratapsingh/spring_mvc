package com.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BroController {
	// @ResponseBody
	@RequestMapping("/bat")
	public String giveBat() {
		return "MRFCricketBat";
	}
}
