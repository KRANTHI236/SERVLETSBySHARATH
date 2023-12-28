package com.jsp.Demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Test1 {
	@RequestMapping("/test1")
	public ModelAndView test1() {
		ModelAndView andView = new ModelAndView("index.jsp");
		andView.addObject("msg", "Hello");
		return andView;

	}

	@RequestMapping("/test2")
	public ModelAndView test2() {
		Student student = new Student();
		student.setId(1);
		student.setName("mani");
		student.setAge(22);
		ModelAndView andView = new ModelAndView("mystudent.jsp");
		andView.addObject("stu", student);
		return andView;
	}

	@RequestMapping("/load")
	public ModelAndView load() {
		ModelAndView andView = new ModelAndView("register.jsp");
		andView.addObject("stu1", new Student());
		return andView;
	}

	@RequestMapping("/save")
	public ModelAndView save(@ModelAttribute Student student) {
		ModelAndView andView = new ModelAndView("mystudent.jsp");
		andView.addObject("stu", student);
		return andView;
	}
}
