package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Course;
import com.service.CourseService;

@RestController
public class CourseController {

	@Autowired
	CourseService courseService;
	@RequestMapping(value = "storeCourseInfo",
			consumes = MediaType.APPLICATION_JSON_VALUE,
			method = RequestMethod.POST)
	public String storeCourseInfo(@RequestBody Course course) {
		return courseService.storeCourse(course);
	}
}
