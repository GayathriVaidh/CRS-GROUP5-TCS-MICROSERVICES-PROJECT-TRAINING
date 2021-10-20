/**
 * 
 */
package com.tcs.dao;

import com.tcs.bean.Admin;

/**
 * @author VENKY_HARI
 *
 */
public interface AdminDAOInterface {
	public Admin approveStudReg();
	public Admin addNewProf();
	public Admin removeProf();
	public Admin generateGradeCard();
	public Admin addCourses();
}