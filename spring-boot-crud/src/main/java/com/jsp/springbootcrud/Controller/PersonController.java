package com.jsp.springbootcrud.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.springbootcrud.Dto.Person;
import com.jsp.springbootcrud.Service.PersonService;

@RestController
public class PersonController {
	@Autowired
	PersonService personService;

	@PostMapping("/person")
	public Person savePerson(@RequestBody Person person) {
		return personService.savePerson(person);
	}

	@GetMapping("/person")
	public List<Person> getAllPerson() {
		return personService.getAllPerson();
	}

	@GetMapping("/person/{id}")
	public Person getByIdPerson(@PathVariable int id) {
		return personService.getByIdPerson(id);
	}

	@PutMapping("/person")
	public Person updatePerson(@RequestBody Person person) {
		return personService.updatePerson(person);
	}

	@DeleteMapping("/person")
	public String deletePerson(@RequestParam int id) {
		return personService.deletePerson(id);

	}
}
