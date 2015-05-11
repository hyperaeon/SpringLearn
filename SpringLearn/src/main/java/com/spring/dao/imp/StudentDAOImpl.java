package com.spring.dao.imp;

import com.spring.dao.StudentDAO;
import com.spring.domain.Student;

public class StudentDAOImpl implements StudentDAO {

	public boolean saveStudent(Student s){
		if(null != s){
			System.out.println("Ñ§ºÅ£º" + s.getsId());
			return true;
		}
		return false;
	}

}
