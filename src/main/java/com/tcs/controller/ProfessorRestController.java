/**
 * 
 */
package com.tcs.controller;

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

import com.tcs.bean.Professor;

import com.tcs.dao.ProfessorDAOImpl;
import com.tcs.service.ProfessorServiceOperation;
import com.tcs.service.ProfessorService;

/**
 * @author Gayathri
 *
 */
public class ProfessorRestController {
	@Autowired //CustomerDAO customerDAOOperation = new CustomerDAO();
	private ProfessorService professors;
	
	@RequestMapping("/professors")
	public List getprofessors() throws SQLException {
		return professors.professorList();
	}
	@RequestMapping(value="/professors/{id}",method=RequestMethod.GET)
	public ResponseEntity getprofessors(@PathVariable("id") int id) throws SQLException {

		Professor ProfessorId = professors.getId(id);
		if (ProfessorId == null) {
			return new ResponseEntity("No Professor found for ID " + id, HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity(ProfessorId, HttpStatus.OK);
	}

	@DeleteMapping("/delete/professors/{id}")
	public ResponseEntity deleteProfessor(@PathVariable int id) throws SQLException {
		Professor prof = Professor.delete(id);
		if (null == prof) {
			return new ResponseEntity("No Professor found for ID " + id, HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity(id, HttpStatus.OK);

	}
	@RequestMapping(value = "/post/professors")
	public ResponseEntity createProfessor(@RequestBody Professor professor) throws SQLException {

		Professor.insert(professor);

		return new ResponseEntity(professor, HttpStatus.OK);
	}
	@RequestMapping("/put/professors/{id}")
	public ResponseEntity updateCustomer(@PathVariable int id, @RequestBody Professor professor) throws SQLException {

		Professor updateInfoProfessor = professors.update(id, professor);

		if (null == updateInfoProfessor) {
			return new ResponseEntity("No Professor found for ID " + id, HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity(professors, HttpStatus.OK);
	}

}
