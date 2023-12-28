package com.jsp.springbootcrud.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.springbootcrud.Dao.PersonDao;
import com.jsp.springbootcrud.Dto.Person;

@Service
public class PersonService {
	@Autowired
	PersonDao personDao;

	public Person savePerson(Person person) {
		return personDao.savePerson(person);
	}

	public List<Person> getAllPerson() {
		return personDao.getAllPerson();
	}

	public Person getByIdPerson(int id) {
		return personDao.getByIdPerson(id);
	}

	public Person updatePerson(Person person) {
		return personDao.updatePerson(person);
	}

	public String deletePerson(int id) {
		return personDao.deletePerson(id);
	}
}
