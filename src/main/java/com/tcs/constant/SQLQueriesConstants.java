/**
 * 
 */
package com.tcs.constant;


public class SQLQueriesConstants {
	public static final String VIEW_LIST_PROFESSORS = "select * from professors";
	public static final String VIEW_SELECTED_PROFESSOR = "select * from professors where ProfessorId= ";
	public static final String DELETE_SELECTED_ID_PROFESSOR_DATA = "delete from professors where ProfessorId= ?";
}