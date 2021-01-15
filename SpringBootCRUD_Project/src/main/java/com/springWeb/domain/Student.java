package com.springWeb.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.data.annotation.Id;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String studentName;
	private String course;
	private int fee;
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Student(long id, String studentName, String course, int fee) {
		super();
		this.id = id;
		this.studentName = studentName;
		this.course = course;
		this.fee = fee;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getStudentName() {
		return studentName;
	}


	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}


	public String getCourse() {
		return course;
	}


	public void setCourse(String course) {
		this.course = course;
	}


	public int getFee() {
		return fee;
	}


	public void setFee(int fee) {
		this.fee = fee;
	}
	
	
	
}
