/**
 * 
 */
package com.tcs.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Service;

import com.tcs.bean.Admin;


/**
 * @author gowri
 *
 */
@Service
public interface AdminService {
	public List adminList() throws SQLException;
	public Admin getId(int id) throws SQLException;
	public Admin delete(int id) throws SQLException;
	public Admin insert(Admin admin) throws SQLException;
	public Admin update(int id, Admin admin)throws SQLException;

	public Admin approveStudReg();
	public Admin addNewProf();
	public Admin removeProf();
	public Admin generateGradeCard();
	public Admin addCourses();

}