/**
 * 
 */
package com.tcs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.tcs.bean.Professor;
import com.tcs.utils.*;
import com.tcs.constant.*;

@Repository
public class ProfessorDAOImpl implements ProfessorDAOInterface{
	Connection con = DBUtils.getConnection();
	SQLQueriesConstants sql = new SQLQueriesConstants();
	
	
	@Override
	public List list() throws SQLException {
		List<Professor> professors = new ArrayList<Professor>();
		PreparedStatement stmt = con.prepareStatement(sql.VIEW_LIST_PROFESSORS);
		System.out.println("Database Connected......");
		ResultSet rs = stmt.executeQuery();
		while(rs.next()) {
			professors.add(new Professor(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4)));
		}
		return professors;
	}

	/**
	 * @return 
	 * @return  professor
	 * @throws SQLException 
	 */
	

//	@Override
//	public Student create(Student student) {
//		student.setStudentId(101);
//		students.add(student);
//		return student;
//	}
//
	@Override
	public Professor delete(int id) throws SQLException {
		String s = sql.VIEW_SELECTED_PROFESSOR+ id;
		PreparedStatement stmt = con.prepareStatement(s);
		ResultSet rs= stmt.executeQuery();
		stmt = con.prepareStatement(sql.DELETE_SELECTED_ID_PROFESSOR_DATA);
		stmt.setInt(1, id);
		stmt.execute();
		
		if (rs.next())
			return new Professor(rs.getInt("ProfessorId"),rs.getString("ProfessorName"),rs.getString("ProfessorDept"),rs.getString("role"));
		return null;
			
	}
//
	@Override
	public Professor update(int id, Professor professor) throws SQLException {
		PreparedStatement stmt=con.prepareStatement("update professor set ProfessorId=?, ProfessorDept=? where ProfessorId=?");  
		stmt.setInt(1,professor.getProfessorId());//1 specifies the first parameter in the query i.e. name  
		stmt.setString(2,professor.getProfessorDept());
		stmt.setInt(3, id );
		int i = stmt.executeUpdate();
		
		return professor;
	}
//
	@Override
	public Professor insert(Professor professor) throws SQLException {
		PreparedStatement stmt=con.prepareStatement("insert into professor values(?,?,?)");
		stmt.setInt(1,professor.getProfessorId());
		stmt.setString(2,professor.getProfessorName());
		stmt.setString(3,professor.getProfessorDept());
		
		
		int i = stmt.executeUpdate();
		return professor;
	}
//
	@Override
	public Professor getId(int id) throws SQLException {
		String s = sql.VIEW_SELECTED_PROFESSOR+ id;
		PreparedStatement stmt = con.prepareStatement(s);
		
		System.out.println("Database Connected......");
		ResultSet rs= stmt.executeQuery();
		if (rs.next())
			return new Professor(rs.getInt("ProfessorId"),rs.getString("ProfessorName"),rs.getString("ProfessorDept"),rs.getString("role"));
		return null;
	}
	

}