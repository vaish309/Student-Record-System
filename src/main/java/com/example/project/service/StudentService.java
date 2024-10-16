package com.example.project.service;
import java.util.*;

import com.example.project.entity.Student;
public interface StudentService {
	 List<Student> getAllStudents();
	 Student saveStudent(Student student);
	 Student getStudentById(Long id);
	 Student updateStudent(Student student);
	 void deleteStudentById(Long id);
}
