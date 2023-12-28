package com.jsp.springbootcrud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.springbootcrud.Dto.Person;

public interface PersonRepository extends JpaRepository<Person, Integer>{

}
