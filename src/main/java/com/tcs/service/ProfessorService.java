/**
 * 
 */
package com.tcs.service;
import java.sql.SQLException;
import java.util.List;


import com.tcs.bean.Professor;

/**
 * @author Gayathri
 *
 */
public interface ProfessorService {
	public List professorList() throws SQLException;
	public Professor getId(int id) throws SQLException;
//	public Student create(Student student);
	public Professor delete(int id) throws SQLException;
//	public Student update(Long id, Student student);

	public Professor insert(Professor professor) throws SQLException;
	public Professor update(int id, Professor professor)throws SQLException;

}
