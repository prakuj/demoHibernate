package com.learn.hibernate.dao;

import com.learn.hibernate.model.Student;

public interface IStudentCrud {
	public int insertStudent(Student student);
	public void deleteStudent();
}
