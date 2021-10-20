package com.tcs.bean;

public class Student {
	private int StudentId;
	private String sDept;
	private String course;
	
	public Student(int StudentId, String sDept, String course) {
		super();
		this.StudentId = StudentId;
		this.sDept = sDept;
		this.course = course;
	}
	
	public int getStudentId() {
		return StudentId;
	}

	public void setStudentId(int StudentId) {
		this.StudentId = StudentId;
	}

	public String getsDept() {
		return sDept;
	}

	public void setsDept(String sDept) {
		this.sDept = sDept;
	}

	public String getcourse() {
		return course;
	}

	public void setcourse(String course) {
		this.course = course;
	}
}