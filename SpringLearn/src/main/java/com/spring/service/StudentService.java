package com.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.StudentDAO;
import com.spring.domain.Student;

@Service
public class StudentService {

	@Autowired
	private StudentDAO studentDAO;
	
	public boolean saveStudentService(Student s){
		if(studentDAO.saveStudent(s)){
			return true;
		}
		return false;
	}
}
