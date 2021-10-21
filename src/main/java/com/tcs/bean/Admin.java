/**
 * 
 */
package com.tcs.bean;

/**
 * @author Gayathri
 *
 */
public class Admin {
	private int adminId;
	private String adminName;
	private String role;
	/**
	 * @param adminId
	 * @param adminName
	 * @param role
	 */
	public Admin(int adminId, String adminName, String role) {
		super();
		this.adminId = adminId;
		this.adminName = adminName;
		this.adminName = adminName;
	}
	/**
	 * @return the adminId
	 */
	public Admin() {
		/**
		 * @return the adminId
		 */
	}
	/**
	 * @return the adminId
	 */
	public int getAdminId() {
		return adminId;
	}
	/**
	 * @param adminId the adminId to set
	 */
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	/**
	 * @return the adminName
	 */
	public String getAdminName() {
		return adminName;
	}
	/**
	 * @param adminName the adminName to set
	 */
	public void setAdminName(String adminName) {
		this.adminName = adminName;
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
	
}