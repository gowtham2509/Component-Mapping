package com.comp.map.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.comp.map.entity.Person;
@Repository
public interface PersonRepository extends JpaRepository<Person, Integer>{

}
