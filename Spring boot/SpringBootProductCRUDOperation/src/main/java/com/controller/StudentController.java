package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Student;
import com.service.StudentService;
import com.service.TrainerService;

@RestController
public class StudentController {

	
	@Autowired
	StudentService studentService;
	
	@RequestMapping(value = "storeStudentRecord",
			consumes = MediaType.APPLICATION_JSON_VALUE,
			method = RequestMethod.POST)
	public String storeStudentRecord(@RequestBody Student student) {
		return studentService.storeStudentRecords(student);
	}
	
}
