/**
 * 
 */
package com.tcs.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;


import com.tcs.bean.Admin;
import com.tcs.utils.*;
import com.tcs.constant.*;

/**
 * @author Gayathri
 *
 */
	@Repository
	public class AdminDAOImpl implements AdminDAOInterface {
		Connection con = DBUtils.getConnection();
		SQLQueriesConstants sql = new SQLQueriesConstants();
		
		@Override
		public List list() throws SQLException {
			List<Admin> admin = new ArrayList<Admin>();
			PreparedStatement stmt = con.prepareStatement(sql.VIEW_ADMIN);
			System.out.println("Database Connected......");
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				admin.add(new Admin(rs.getInt(1),rs.getString(2),rs.getString(3)));
			}
			return admin;
		}
		
		@Override
		public Admin delete(int id) throws SQLException {
			String s = sql.VIEW_SELECTED_ID_ADMIN+ id;
			PreparedStatement stmt = con.prepareStatement(s);
			ResultSet rs= stmt.executeQuery();
			stmt = con.prepareStatement(sql.DELETE_SELECTED_ID_ADMIN);
			stmt.setInt(1, id);
			stmt.execute();
			
			if (rs.next())
				return new Admin(rs.getInt("adminId"),rs.getString("adminName"),rs.getString("role"));
			return null;
		}
		
		@Override
		public Admin update(int id, Admin admin) throws SQLException {
			PreparedStatement stmt=con.prepareStatement("update admins set adminName=?, role=? where adminId=?");  
			stmt.setString(1,admin.getAdminName());//1 specifies the first parameter in the query i.e. name  
			stmt.setString(2,admin.getRole());
			stmt.setInt(3, id );
			int i = stmt.executeUpdate();
			
			return admin;
		}

		@Override
		public Admin insert(Admin admin) throws SQLException {
			PreparedStatement stmt=con.prepareStatement("insert into admins values(?,?,?)");
			stmt.setInt(1,admin.getAdminId());
			stmt.setString(2,admin.getAdminName());
			stmt.setString(3,admin.getRole());
			
			int i = stmt.executeUpdate();
			return admin;
		}
		
		@Override
		public Admin getId(int id) throws SQLException {
			String s = sql.VIEW_SELECTED_ID_ADMIN+ id;
			PreparedStatement stmt = con.prepareStatement(s);
			
			System.out.println("Database Connected......");
			ResultSet rs= stmt.executeQuery();
			if (rs.next())
				return new Admin(rs.getInt("adminId"),rs.getString("adminName"),rs.getString("role"));
			return null;
		}
		@Override
		public Admin approveStudReg() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Admin addNewProf() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Admin removeProf() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Admin generateGradeCard() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Admin addCourses() {
			// TODO Auto-generated method stub
			return null;
		}



	}


