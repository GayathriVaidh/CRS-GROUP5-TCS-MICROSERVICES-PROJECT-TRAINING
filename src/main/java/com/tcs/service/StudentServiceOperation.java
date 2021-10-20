package com.tcs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.tcs.bean.Student;
import com.tcs.dao.StudentDAOInterface;

public class StudentServiceOperation implements StudentService{
	@Autowired
	private StudentDAOInterface students;

	@Override
	public List list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student getId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(Student student) {
		// TODO Auto-generated method stub
	
		
	}

	@Override
	public Student update(Long id, Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long delete(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student create(Student student) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}