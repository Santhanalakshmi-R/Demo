package com.example.Studentdemo.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Studentdemo.Entity.Student;
import com.example.Studentdemo.Repositories.StudentRepository;
@Service
public class StudentServiceImp implements StudentService{
StudentRepository sr;

	public StudentServiceImp(StudentRepository sr) {
	super();
	this.sr = sr;
}

	@Override
	public String createStudent(Student st) {
		sr.save(st);
		return "Student object is created";
	}

	@Override
	public Student getStudent(String stuid) {
		Student st=sr.findById(stuid).get();
	return st;
	}

	@Override
	public List<Student> getAllInfo() {
		List<Student> stdlist=sr.findAll();
		return stdlist;
	}

	@Override
	public String updatStudent(Student st) {
		sr.save(st);
		return "Student object is updated";
	}

	@Override
	public String deleteStudent(String stuid) {
		sr.deleteById(stuid);
		return "obj deleted";
	}

}
