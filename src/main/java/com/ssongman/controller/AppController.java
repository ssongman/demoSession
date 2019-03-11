package com.ssongman.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ssongman.model.Contact;
import com.ssongman.model.ContactBusiness;

@Controller
public class AppController {

//	@ResponseBody
	@RequestMapping("test")
	public String test() {
		System.out.println("AppController --> test()");
		return "test.jsp";
	}
	
	@RequestMapping("/")
	public String Welcom() {
		
		System.out.println("AppController --> welcome()");
		
		return "index";
	}
	
	@RequestMapping("/list_contact")
	public String listContact(Model model) {
		System.out.println("AppController --> list_contact()");
		
		ContactBusiness business = new ContactBusiness();
		List<Contact> contactList = business.getContactList();
		
		model.addAttribute("contacts", contactList);
		
		return "contact.html";
	}
}
