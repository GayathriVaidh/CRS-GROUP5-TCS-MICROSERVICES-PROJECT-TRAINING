package com.tcs.restcontroller;

import java.sql.SQLException;
import java.util.List;

import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.bean.Admin;
import com.tcs.dao.AdminDAOImpl;
import com.tcs.service.AdminService;
import com.tcs.service.AdminServiceOperation;




/**
 * @author gowri
 *
 */
@RestController
@CrossOrigin
public class AdminRestController {
	@Autowired //CustomerDAO customerDAOOperation = new CustomerDAO();
	private AdminServiceOperation admin;
	
	@RequestMapping("/admin")
	public List getAdmins() throws SQLException {
		return admin.adminList();
	}
	@RequestMapping(value="/admin/{id}",method=RequestMethod.GET)
	public ResponseEntity getCustomer(@PathVariable("id") int id) throws SQLException {

		Admin adminId = admin.getId(id);
		if (adminId == null) {
			return new ResponseEntity("No admin found for ID " + id, HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity(adminId, HttpStatus.OK);
	}

	@RequestMapping("/delete/admin/{id}")
	public ResponseEntity deleteCustomer(@PathVariable int id) throws SQLException {
		Admin stud = admin.delete(id);
		if (null == stud) {
			return new ResponseEntity("No Customer found for ID " + id, HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity(id, HttpStatus.OK);

	}
	@RequestMapping(value = "/post/admin")
	public ResponseEntity createCustomer(@RequestBody Admin admins) throws SQLException {

		admin.insert(admins);

		return new ResponseEntity(admin, HttpStatus.OK);
	}
	@RequestMapping("/put/students/{id}")
	public ResponseEntity updateCustomer(@PathVariable int id, @RequestBody Admin admins) throws SQLException {

		Admin updateInfoStudent = admin.update(id, admins);

		if (null == updateInfoStudent) {
			return new ResponseEntity("No Customer found for ID " + id, HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity(admin, HttpStatus.OK);
	}


}