/**
 * 
 */
package com.tcs.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tcs.bean.Professor;
import com.tcs.dao.ProfessorDAOInterface;


@Component
public class ProfessorServiceOperation implements ProfessorService {
	@Autowired 
	private ProfessorDAOInterface professors;

	@Override
	public List professorList() throws SQLException {
		// TODO Auto-generated method stub
		return professors.list();
	}

//	@Override
//	public List studentList() {
//		// TODO Auto-generated method stub
//		return students.list();
//	}
	@Override
	public Professor getId(int id) throws SQLException {
		
		return professors.getId(id);
	}
//
//	@Override
//	public Student create(Student student) {
//		// TODO Auto-generated method stub
//		return students.create(student);
//	}
//
	@Override
	public Professor delete(int id) throws SQLException {
		// TODO Auto-generated method stub
		return professors.delete(id);
	}
//
	@Override
	public Professor update(int id, Professor professors)throws SQLException {
		// TODO Auto-generated method stub
		return professors.update(id, professors);
	}
//
	@Override
	public Professor insert(Professor professor) throws SQLException {
		return professor.insert(professor);
	}

//@Override
//public Student delete(int id) throws SQLException {
//	// TODO Auto-generated method stub
//	return null;
//}
	
	
}