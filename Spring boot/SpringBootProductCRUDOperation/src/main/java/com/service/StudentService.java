package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Student;
import com.dao.StudentDao;

@Service
public class StudentService {

	@Autowired
	StudentDao studentDao;
	public String storeStudentRecords(Student student) {
		if(studentDao.storeStudentRecord(student)) {
			return "Student Record stored successfully";
		}else {
			return "Student record didn't store";
		}
	}
}
