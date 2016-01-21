package ccu.control;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ccu.model.system.Role;
import ccu.springDataDao.system.RoleRepo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@Transactional
public class CrudController {
	@Autowired
	private RoleRepo rr;	 
	@Autowired  
	private  HttpServletRequest request;  
	//
    @RequestMapping(value="/get/{id}", method=RequestMethod.GET, produces="text/plain;charset=UTF-8") 
    public String greeting(@PathVariable("id") String id) throws JsonProcessingException {
		Role r = rr.findOne(id);

	    ObjectMapper om = new ObjectMapper();
		String s = om.writeValueAsString(r);
		System.out.println(s);
		return request.getParameter("callback") + "(" + s + ")"; 
    }
}
