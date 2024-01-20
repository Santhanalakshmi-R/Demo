package com.example.Studentdemo.Service;

import java.util.List;

import com.example.Studentdemo.Entity.Student;

public interface StudentService {
public String createStudent(Student st);
public Student getStudent(String stuid);
public List<Student> getAllInfo();
public String updatStudent (Student st);
public String deleteStudent(String stuid);

}
