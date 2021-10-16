package org.student;


import org.department.Department;

public class Student extends Department{
	public void studentName()
	{
		System.out.println("Student Name  is Sam");
	}
	public void studentDept()
	{
		System.out.println("Student Name  is CSE");
	}
	public void studentId()
	{
		System.out.println("Student id is 12233");
	}
	public static void main(String[] args) {
		Student obj=new Student();
		
		obj.studentDept();
		obj.studentId();
		obj.studentName();
		obj.deptName();
	obj.collegeCode();
	obj.collegeName();
	obj.collegeRank();
}}
