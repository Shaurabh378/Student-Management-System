package com.student;

import java.util.List;

public interface StudentService 
{
	Student add(Student student);
	List<Student> view();
	Student search(int id);
	Student update(int id, Student student);
	boolean delete(int id);
}
