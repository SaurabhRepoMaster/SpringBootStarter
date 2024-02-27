package com.demo.demoProject;

import com.demo.demoProject.model.Person;
import com.demo.demoProject.repo.PersonRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;
import java.util.Optional;

@SpringBootApplication()

public class DemoProjectApplication {

	public static void main(String[] args) {
		ApplicationContext context  = SpringApplication.run(DemoProjectApplication.class, args);
		PersonRepository personRepository = context.getBean(PersonRepository.class);

		//Creating new Row
		Person p = new Person();
		p.setName("Dwivedi");
		Person p1 = new Person();
		p1.setName("Kumar");
		List<Person> lp = List.of(p,p1);
		personRepository.saveAll(lp);

		//Updating existing record:
		Optional<Person> optional = personRepository.findById(102);
		try {
			Person p2 = optional.get();
			p2.setName("Dummy1");
			personRepository.save(p2);
		}catch (Exception e)
		{

		}

		//Iterating existing record:
		Iterable<Person> itr= personRepository.findAll();
		itr.forEach(person->{System.out.println(person);});

		//Deleting all records:
			//personRepository.deleteAll();


		//custom finder method that will return values by name:
		itr= personRepository.findByName("Dwivedi");
		itr.forEach(person->{System.out.println("here  "+  person);});


		itr= personRepository.findByNameAndRollNumber("Dwivedi",602);
		itr.forEach(person->{System.out.println("here1  "+  person);});

		//Custom query implementation : JPQL
		itr= personRepository.getAllPersons();
		itr.forEach(person->{System.out.println("Custom query implementation for getAllPersons "+  person);});

		itr= personRepository.getPersonByName("Dwivedi");
		itr.forEach(person->{System.out.println("Custom query implementation for   getPersonByName  "+  person);});

		//Custom query implementation : native Query
		itr= personRepository.getPersons("Dwivedi");
		itr.forEach(person->{System.out.println("Custom query implementation for   getPersons  "+  person);});
	}

}
