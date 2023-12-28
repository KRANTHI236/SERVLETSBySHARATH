package com.jsp.springbootcrud.Dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.springbootcrud.Dto.Person;
import com.jsp.springbootcrud.repositories.PersonRepository;

@Repository
public class PersonDao {
	@Autowired
	PersonRepository personRepository;

	public Person savePerson(Person person) {
		return personRepository.save(person);
	}

	public List<Person> getAllPerson() {
		return personRepository.findAll();
	}

	public Person getByIdPerson(int id) {
		Optional<Person> optional = personRepository.findById(id);
		return optional.get();
	}

	public Person updatePerson(Person person) {
		Optional<Person> optional = personRepository.findById(person.getId());
		if (optional.get() != null) {
			return personRepository.save(person);
		} else {
			return null;
		}
	}

	public String deletePerson(int id) {
		Optional<Person> optional = personRepository.findById(id);
		if (optional.get() != null) {
			personRepository.delete(optional.get());
			return "data deleted";
		} else {
			return null;
		}
	}
}
