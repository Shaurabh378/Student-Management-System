package com.student;

import java.util.List;
import java.util.Scanner;


public class mainClass 
{
	public static void main(String[] args) 
	{
		StudentServiceImpl st = new StudentServiceImpl();
		Scanner input = new Scanner(System.in);
		while (true)
		{
			System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add New Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.println(" ");
            System.out.print("Enter your choice: ");
            int choice = input.nextInt();
            System.out.println(" ");
            switch (choice) {
			case 1: 
			{
				
				System.out.print("Enter ID: ");
                int id = input.nextInt();

                input.nextLine();

                System.out.print("Enter Name: ");
                String name = input.nextLine();

                System.out.print("Enter Age: ");
                int age = input.nextInt();

                input.nextLine();

                System.out.print("Enter Course: ");
                String course = input.nextLine();

                System.out.print("Enter Email: ");
                String email = input.nextLine();
                
                
                Student student = new Student(id, name, age, course, email);
                Student savedst = st.add(student);
                System.out.println(savedst);
                
                break;
			}
			
			case 2 :
			{
				  
				List<Student> students = st.view();

                if (students.isEmpty()) {
                    System.out.println("No students found.");
                } else {

                    for (Student s : students) {
                        System.out.println(s);
                    }
                }
			}
			break;
			
			
			case 3:
			{
				System.out.println("Enter Student Id = "); 
				int id1 = input.nextInt();
				Student students = st.search(id1);

                if (students != null) {
                    System.out.println(students);
                } else 
                {
                	System.out.println("Student not found");
                }
			}
			break;
			
			
			
			case 4:
			{
				System.out.println("Enter Student Id for Update = ");
				int id2 = input.nextInt();
				
				input.nextLine();
				
				System.out.print("Enter Name: ");
                String name = input.nextLine();

                
                System.out.print("Enter Age: ");
                int age = input.nextInt();

                input.nextLine();

                System.out.print("Enter Course: ");
                String course = input.nextLine();

                System.out.print("Enter Email: ");
                String email = input.nextLine();
                
				Student student = new Student(id2, name, age, course, email);
				Student student2 = st.update(id2, student);
				System.out.println(student2);
				
			}
				
			break;
			
			
			
			case 5:
			{
			    System.out.print("Enter Student Id for Delete = ");
			    int id = input.nextInt();

			    boolean deleted = st.delete(id);

			    if (deleted) {
			        System.out.println("Student Deleted Successfully");
			    } else {
			        System.out.println("Student not found");
			    }

			    break;
			}
			
			case 6:
			{	 System.out.println("Thank you for using me");
			
			input.close();
			}
			default:
				System.out.print("Unexpected value: " + choice);
			}

		}
		
	}
}
