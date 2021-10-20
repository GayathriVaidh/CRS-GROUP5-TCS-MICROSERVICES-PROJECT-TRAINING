package com.tcs.constant;

public class SQLQueriesConstants {
	
	/**
	 * General Queries
	 */
	//public static final String UPDATE_PASSWORD="update user set password=? where userId = ? ";
	
	
	/**
	 * 
	 * Queries Related to Student Operation
	 * 
	 */
	public static final String ADD_COURSE="insert into student (studentId,course) values ( ? , ? )";
	public static final String DROP_COURSE="delete from student where course = ? and studentId = ?;";
	//public static final String VIEW_GRADE =
	
	/**
	 * 
	 * Queries Related to Professor Operation
	 * 
	 * 
	 */
	/*public static final String GET_ROLE="select role from user where userId = ? ";
	public static final String GET_STUDENT_ID="select studentId from student where userId = ? ";
	public static final String ADD_GRADE="update registeredcourse set grade=? where studentId=?  and courseCode=?";
	
	/**
	 * 
	 * Queries Related to Administrator Operation
	 * 
	 */	
	/*
	public static final String IS_APPROVED = "select isapproved from student where studentid = ? ";
	public static final String VERIFY_CREDENTIALS="select password from user where userId = ?";
	public static final String ADD_USER_QUERY = "insert into User(userId, password, role) values (?, ?, ?)";
	public static final String ADD_PROFESSOR_QUERY = "insert into Professor(userId, department, designation) values (?, ?, ?)";
	public static final String ADD_STUDENT = "insert into student (name,emailid,branchname,address,isapproved,roleid) values (?,?,?,?,?,?)";

*/
}