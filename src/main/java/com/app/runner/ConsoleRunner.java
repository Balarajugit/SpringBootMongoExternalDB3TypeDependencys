package com.app.runner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.document.Adress;
import com.app.document.Student;
import com.app.repo.StudentRepository;
@Component
public class ConsoleRunner implements CommandLineRunner {
	@Autowired
	private StudentRepository repo;

	@Override
	public void run(String... args) throws Exception {
		/*repo.deleteAll();
		List<String> l=new ArrayList<>();
		l.add("Core Java");
		l.add("Advanced Java");
		l.add("Spring");
		l.add("Hibernate");
		l.add("Spring Boot");
		l.add("WebServices");
		l.add("MYSQL");
		l.add("Oracle");
		l.add("MongoBD");
		
		Map<String,Integer> m=new HashMap<>();
		m.put("Core Java", 98);
		m.put("Advanced Java", 87);
		m.put("Spring", 78);
		m.put("Hibernate", 67);
		m.put("Spring Boot", 70);
		m.put("WebServices", 86);
		m.put("MYSQL", 75);
		m.put("Oracle", 76);
		m.put("MongoDB", 99);
		
		
		Adress a=new Adress("Gollapalem", "Machilipatnam", "krishna District", "Andhra Pradesh", 521001);
		
		repo.save(new Student(434, "Balaraju", l, m, a));
		System.out.println("one record inserted successfully");*/
		repo.findAll().forEach(System.out::println);
		
	}

}
