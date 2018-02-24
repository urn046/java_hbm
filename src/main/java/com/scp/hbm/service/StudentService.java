package com.scp.hbm.service;

import java.util.Scanner;

import com.scp.hbm.pojo.Student;

public class StudentService {
	
	static int rollno;
	static String name;
	static String city;
	
	static Scanner sc =new Scanner(System.in);
	static Student stud1=null;
	
	public static Student getStudent(){
		System.out.println("Enter roll no");
		rollno=sc.nextInt();
		System.out.println("Enter name");
		name=sc.next();
		System.out.println("Enter city");
		city=sc.next();
		stud1=new Student(rollno, name, city);
		return stud1;
	}
	
	
	

}
