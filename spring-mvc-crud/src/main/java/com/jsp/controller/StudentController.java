package com.jsp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.dto.Student;
import com.jsp.service.Student_Service;

@Controller
public class StudentController {
	@Autowired
	Student_Service student_Service;

	@RequestMapping("/loadstudent")
	public ModelAndView load() {
		ModelAndView andView = new ModelAndView("save.jsp");
		andView.addObject("sl", new Student());
		return andView;

	}

	@RequestMapping("/savestudent")
	public ModelAndView saveStudent(@ModelAttribute Student student) {
		Student student2 = student_Service.saveService(student);
		if (student2 != null) {
			ModelAndView andView = new ModelAndView("home.jsp");
			andView.addObject("msg", "data saved");
			return andView;
		} else {
			ModelAndView andView = new ModelAndView("/loadstudent");
			return andView;
		}
	}

	@RequestMapping("/displaystudent")
	public ModelAndView display() {
		List<Student> list = student_Service.getAllService();
		ModelAndView andView = new ModelAndView("displaystudent.jsp");
		andView.addObject("list", list);
		return andView;
	}

	@RequestMapping("/editstudent")
	public ModelAndView getbyid(@RequestParam int id) {
		ModelAndView andView = new ModelAndView("updatestudent.jsp");
		andView.addObject("update", student_Service.getByIdService(id));
		return andView;
	}

	@RequestMapping("/updatestudent")
	public ModelAndView update(@ModelAttribute Student student) {
		student_Service.updateService(student);
		ModelAndView andView = new ModelAndView("/displaystudent");
		return andView;

	}

	@RequestMapping("/deletestudent")
	public ModelAndView delete(@RequestParam int id) {
		student_Service.deleteService(id);
		ModelAndView andView = new ModelAndView("/displaystudent");
		return andView;
	}

}
