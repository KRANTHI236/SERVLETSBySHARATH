package com.jsp.springbootfirst;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Demo {
	@GetMapping("/test1")
	public String test() {
		return "hello";
	}

	@GetMapping("/test2")
	public Student test2() {
		Student student = new Student();
		student.setId(1);
		student.setName("mani");
		student.setAge(21);
		return student;
	}

	@PostMapping("/test3")
	public List<Student> test3() {
		return new ArrayList<Student>();

	}

	@PostMapping("/test4")
	public String test4(@RequestBody Student student) {
		System.out.println(student.getId() + " " + student.getName() + " " + student.getAge() + " ");
		return "data";
	}

	@PostMapping("/test5")
	public List<String> test5(@RequestBody Student student) {
		return student.getList();
	}
}
