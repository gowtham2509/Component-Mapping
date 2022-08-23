package com.comp.map.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.comp.map.entity.Person;
import com.comp.map.repository.PersonRepository;
@Service
public class PersonService {
	
	@Autowired
	private PersonRepository personRepository;

	public void createPerson(Person person) {
		personRepository.save(person);
	}

}
