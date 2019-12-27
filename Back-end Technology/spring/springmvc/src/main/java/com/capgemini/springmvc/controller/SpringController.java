package com.capgemini.springmvc.controller;

import javax.servlet.ServletContext;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.capgemini.springmvc.beans.User;

@Controller
public class SpringController {
	@Autowired
	private ServletContext context;
	@RequestMapping("/hello")
	public String hello(ModelMap map) {
		map.addAttribute("msg", "Hello world.........!!!!");
		return "index";

	}
	//@RequestMapping(path ="/query", method = RequestMethod.GET)//exactly like overriding doGet() method in servlet
	@GetMapping("/query")//instead of line no. 18
	public String query(@RequestParam(name="name")String name, @RequestParam(name="age")int age, ModelMap map) {
		map.addAttribute("name", name);
		map.addAttribute("age", age);
		
		return "query";
	}
	@GetMapping("/form")
	public String form() {
		return "form";
	}
	@PostMapping("/form")
	public String form(User user, ModelMap map) {
		map.addAttribute("name", user.getName());
		map.addAttribute("email", user.getEmail());
		map.addAttribute("password", user.getPassword());
		map.addAttribute("gender", user.getGender());
		
		return "form";
		
	}
	@GetMapping("/createcookie")
	public String createCookie(HttpServletResponse response) {
		Cookie cookie=new Cookie("name", "Akshay");
		response.addCookie(cookie);
		return "createcookie";
	}
	@GetMapping("/getcookie")
	public String getCookie(@CookieValue(name="name", required=false)String name, ModelMap map) {
		if(name!=null)
			map.addAttribute("name", name);
		else
			map.addAttribute("name", "shivalakshmi");
		
		return "getcookie";
	}
	@GetMapping("/path/{movie}/{hero}")
	public String path(@PathVariable("movie")String movie,@PathVariable("hero") String hero, ModelMap map) {
		map.addAttribute("movie", movie);
		map.addAttribute("hero", hero);
		return "pathvalue";
	}
	@GetMapping("/forward")
	public String forward() {
		
		return "forward:hello";
		
	}
	@GetMapping("/redirect")
	public String redirect() {
		
		return "redirect:https://www.google.com";
	}
	@GetMapping("/home")
	public String home(@SessionAttribute(name ="user", required=false)User user) {
		if(user!=null)
			return "home";
		else
			return "login";
	}
	@PostMapping("/login")
	public String login(String username, String password, HttpServletRequest request, ModelMap map) {
		if(username.equals("user")&& password.equals("qwerty")) {
			User user=new User();
			user.setName(username);
			user.setEmail("vivek@gmail.com");
			user.setPassword(password);
			user.setGender("O");
			HttpSession session= request.getSession();
			session.setAttribute("user", user);
			map.addAttribute("msg", "user logged in");
			return "home";
		}else {
			map.addAttribute("msg", "Credential Invalid");
			return "login";
		}
		
	}
	@GetMapping("setappattribute")
	public String setAppAttribute() {
		
		context.setAttribute("msg", new Object());
		return "setcontext";	
		
	}
	@GetMapping("getappattribute")
	public String getAppAttribute() {
		System.out.println(context.getAttribute("msg"));
		return "getcontext";
	}
	
	

}
