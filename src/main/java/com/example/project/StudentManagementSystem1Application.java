package com.example.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.project.entity.Student;
import com.example.project.repository.StudentRepository;
@EnableAutoConfiguration
@SpringBootApplication
public class StudentManagementSystem1Application implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystem1Application.class, args);
		
	}
	
	@Autowired
	private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {
		
	}

}
