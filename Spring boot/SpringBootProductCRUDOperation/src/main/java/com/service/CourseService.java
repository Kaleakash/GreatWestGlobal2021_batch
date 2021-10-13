package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Course;
import com.dao.CourseDao;

@Service
public class CourseService {

	@Autowired
	CourseDao courseDao;
	
	public String storeCourse(Course course) {
		if(courseDao.storeCourseInfo(course)) {
			return "Stored successfully";
		}else {
			return "Didn't store";
		}
	}
}
