package com.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/sis")
public class SisController {
	@ResponseBody
	@RequestMapping("/kit")
	public String giveMakeupKit() {
		return "here is your makeupkit";
	}

	@ResponseBody
	@RequestMapping("/book")
	public String giveBook() {
		return "here is your book";
	}
}
