package com.example.Studentdemo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	
String name;
@Id
String stuid;
int marks;
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public Student(String name, String stuid, int marks) {
	super();
	this.name = name;
	this.stuid = stuid;
	this.marks = marks;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getStuid() {
	return stuid;
}
public void setStuid(String stuid) {
	this.stuid = stuid;
}
public int getMarks() {
	return marks;
}
public void setMarks(int marks) {
	this.marks = marks;
}
@Override
public String toString() {
	return "Student [name=" + name + ", stuid=" + stuid + ", marks=" + marks + "]";
}

}
