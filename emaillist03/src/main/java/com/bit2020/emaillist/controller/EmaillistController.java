package com.bit2020.emaillist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EmaillistController {

	@ResponseBody
	@RequestMapping("")
	public String index() {
		return "/WEB-INF/views/index.jsp";
	}
}
