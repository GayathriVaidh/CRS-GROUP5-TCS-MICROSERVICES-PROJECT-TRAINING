/**
 * 
 */
package com.tcs.bean;

public class Professor {
	private String ProfessorName;
	private int ProfessorId;
	private String ProfessorDept;
	private String role;
	public Professor(int int1, String string, String string2, String string3) {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the professorName
	 */
	public String getProfessorName() {
		return ProfessorName;
	}
	/**
	 * @param professorName the professorName to set
	 */
	public void setProfessorName(String professorName) {
		ProfessorName = professorName;
	}
	/**
	 * @return the professorId
	 */
	public int getProfessorId() {
		return ProfessorId;
	}
	/**
	 * @param professorId the professorId to set
	 */
	public void setProfessorId(int professorId) {
		ProfessorId = professorId;
	}
	/**
	 * @return the professorDept
	 */
	public String getProfessorDept() {
		return ProfessorDept;
	}
	/**
	 * @param professorDept the professorDept to set
	 */
	public void setProfessorDept(String professorDept) {
		ProfessorDept = professorDept;
	}
	/**
	 * @return the role
	 */
	public String getRole() {
		return role;
	}
	/**
	 * @param role the role to set
	 */
	public void setRole(String role) {
		this.role = role;
	}
	public static Professor insert(Professor professor) {
		// TODO Auto-generated method stub
		return null;
	}
	public static Professor delete(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	public Professor update(int id, Professor professors) {
		// TODO Auto-generated method stub
		return null;
	}
	
}