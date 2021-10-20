/**
 * 
 */
package com.tcs.exception;

/**
 * @author Gayathri
 *
 */

	public class StudentNotRegisteredException extends Exception {
		private int studentRegNo;
		 
		 public StudentNotRegisteredException(int studentRegNo)
		 {
			 this.studentRegNo=studentRegNo;
		 }
		 
		 /**
		  * getter function for studentRegNo
		  * @return
		  */
		 public int getStudentRegNo()
		 {
			 return studentRegNo;
		 }
	}



