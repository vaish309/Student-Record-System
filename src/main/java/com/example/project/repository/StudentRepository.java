package com.example.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.project.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
