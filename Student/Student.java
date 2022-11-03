package org.Student;

import org.Department.Department;

public class Student extends Department {
	public void studentName(String studname) {
		System.out.println("studentName"+"="+studname);
	}
	public void studentDept (String studdept) {
		System.out.println("studentDept"+"="+studdept);
	}
	
	public void studentId (String stuId) {
		System.out.println("studentId"+"="+stuId);
	}
	public static void main(String[] args) {
		Student detail = new Student ();
		detail.collegeName("CAHC");
		detail.collegeCode("606755");
		detail.collegeRank("1");
		detail.DeptName("ComputerApplication");
		detail.studentName("NadeEm");
		detail.studentId("HCU19G48");
		detail.studentDept("BCA");
	}
		

}
