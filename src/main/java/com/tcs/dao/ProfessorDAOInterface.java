/**
 * 
 */
package com.tcs.dao;

import com.tcs.bean.Professor;

/**
 * @author VENKY_HARI
 *
 */
public interface ProfessorDAOInterface {
	public Professor registeredCourses();
	public Professor viewStudentInfo();
	public Professor assignGrades();
	
}