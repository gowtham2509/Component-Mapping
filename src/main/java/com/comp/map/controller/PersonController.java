package com.comp.map.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.comp.map.entity.Person;
import com.comp.map.service.PersonService;

@RestController
public class PersonController {
	
	@Autowired
	private PersonService personService;
	
	@PostMapping("/person")
	public ResponseEntity<Person> createPerson(@RequestBody Person person){
		personService.createPerson(person);
		return new ResponseEntity("Person Details Created", HttpStatus.CREATED);
	}

}
