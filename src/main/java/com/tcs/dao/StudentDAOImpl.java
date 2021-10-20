package com.tcs.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.tcs.bean.Student;

@Repository
public class StudentDAOImpl implements StudentDAOInterface{
	private static List<Student> students;
	{
		students = new ArrayList<Student>();
		students.add(new Student(101, "13000217103","Information Technology"));
		students.add(new Student(102, "13000217121","Computer Science"));
		students.add(new Student(103, "13000217003","Mechanical"));
	}
	@Override
	public List list() {
		// TODO Auto-generated method stub
		return students;
	}	

	@Override
	public Student create(Student student) {
		student.setStudentId(123);
		students.add(student);
		return student;
	}

	@Override
	public Long delete(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student update(Long id, Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(Student student) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Student getId(Long id) {
		for (Student c : students) {
			if (c.getStudentId() == id) {
				return c;
			}
		}
		return null;
	}

}