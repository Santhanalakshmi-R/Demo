package com.example.Studentdemo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Studentdemo.Entity.Student;

public interface StudentRepository extends JpaRepository<Student,String> {

}
