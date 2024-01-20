package com.example.Studentdemo.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Studentdemo.Entity.Student;
import com.example.Studentdemo.Service.StudentService;

@RestController
@RequestMapping("/Student")
public class StudentController {
StudentService ss;

public StudentController(StudentService ss) {
	super();
	this.ss = ss;
}
@PostMapping
public String createStudent(@RequestBody Student st) {
	String msg=ss.createStudent(st);
	return msg;
}
@GetMapping(value="{stuid}")
public Student getStudent(@PathVariable String stuid) { 
	Student st=ss.getStudent(stuid);
	return st;
}
@GetMapping
public List<Student> getAllInfo() {
	List<Student> stob=ss.getAllInfo();
	return stob;
}
@PutMapping
public String updatStudent(@RequestBody Student st) {
	String msg=ss.updatStudent(st);
	return msg;
}

@DeleteMapping(value="{stuid}")
public String deleteStudent(@PathVariable String stuid) {
	String msg=ss.deleteStudent(stuid);
	return msg;
}

}

