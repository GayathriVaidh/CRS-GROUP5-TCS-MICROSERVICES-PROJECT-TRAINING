package com.tcs.dao;

import java.util.List;

import com.tcs.bean.Student;

public interface StudentDAOInterface {
	public List list();
	public Student getId(Long id);
	public void insert(Student student);
	public Student update(Long id, Student student);
	public Long delete(Long id);
	public Student create(Student student);
	
}