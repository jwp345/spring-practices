package com.bit2020.emaillist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bit2020.emaillist.repository.EmaillistRepository;
import com.bit2020.emaillist.vo.EmaillistVo;

@Controller
public class EmaillistController {
	@Autowired
	private EmaillistRepository emaillistRepository;
	
	@RequestMapping("")
	public String index(Model model) {
		List<EmaillistVo> list = emaillistRepository.findAll();
		model.addAttribute("list", list);
		return "/WEB-INF/views/index.jsp";
	}
	
	@RequestMapping("/form")
	public String form() {
		return "/WEB-INF/views/form.jsp";
	}
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public String add(EmaillistVo vo) {
		emaillistRepository.insert(vo);
		return "redirect:/";
	}
}
