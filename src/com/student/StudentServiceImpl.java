package com.student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentServiceImpl implements StudentService
{

	
	ArrayList<Student> students = new ArrayList<>();
	
	
	@Override
	public Student add(Student student) 
	{
		students.add(student);
		return student;
	}

	@Override
	public List<Student> view() 
	{
		for (Student student : students) {

		    System.out.println(student.getId());
		    System.out.println(student.getName());
		    System.out.println(student.getAge());
		    System.out.println(student.getCourse());
		    System.out.println(student.getEmail());

		}
		return students;
	}

	@Override
	public Student search(int id) 
	{
		for (Student student : students)
		{
			if (student.getId() == id)
			{
				return student;
			}
		}
		return null;
	}

	@Override
	public Student update(int id, Student student) 
	{
		for (Student student2 : students)
		{
			if (student2.getId() == id)
			{
				student2.setName(student.getName());
				student2.setAge(student.getAge());
				student2.setCourse(student.getCourse());
				student2.setEmail(student.getEmail());
				
				return student2;

			}
		}
		return null;
	}

	@Override
	public boolean delete(int id) {

	    Iterator<Student> iterator = students.iterator();

	    while (iterator.hasNext()) {

	        Student student = iterator.next();

	        if (student.getId() == id) {
	            iterator.remove();
	            return true;
	        }
	    }

	    return false;
	}
}






























