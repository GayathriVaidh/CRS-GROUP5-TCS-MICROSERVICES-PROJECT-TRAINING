/**
 * 
 */
package com.tcs.service;

import com.tcs.bean.Admin;

/**
 * @author VENKY_HARI
 *
 */
public interface AdminService {
	public Admin approveStudReg();
	public Admin addNewProf();
	public Admin removeProf();
	public Admin generateGradeCard();
	public Admin addCourses();
}