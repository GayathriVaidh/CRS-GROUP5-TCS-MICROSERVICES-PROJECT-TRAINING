/**
 * 
 */
package com.tcs.dao;
import java.util.List;

import java.sql.SQLException;
import com.tcs.bean.Professor;

/**
 * @author Gayathri
 *
 */
public interface ProfessorDAOInterface {
	public List list() throws SQLException;
	public Professor getId(int id) throws SQLException; 
//	public Student create(Student student);
	public Professor delete(int id) throws SQLException;
//	public Student update(int id, Student student);
	public Professor insert(Professor professor) throws SQLException;
	/**
	 * @return the students
	 * @throws SQLException 
	 */
	public Professor update(int id, Professor professor) throws SQLException;
}


