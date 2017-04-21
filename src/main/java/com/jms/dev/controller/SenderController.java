package com.jms.dev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jms.dev.bean.Person;
import com.jms.dev.service.SenderService;

@Controller
public class SenderController {

	@Autowired(required = true)
	private SenderService service;

	@RequestMapping(value = "/send")
	public String sendViaJMS(@ModelAttribute("person") Person person,Model model) {
		String msg = "Data Send Successfully...";
		service.send(person);
		model.addAttribute("msg", msg);
		return "home";
	}
}
