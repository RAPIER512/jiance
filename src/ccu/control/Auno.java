package ccu.control;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ccu.model.system.Role;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@Transactional
public class Auno {
	
	@RequestMapping(value="/error", method=RequestMethod.GET, produces="text/plain;charset=UTF-8") 
    public String greeting() throws JsonProcessingException {
		return "null";
    }
	
}
