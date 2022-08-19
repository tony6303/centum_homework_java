package com.hw1.model.vo;

public class Student extends Person{
	private int grade;
	private String major;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(String name, int age, double height, double weight, int grade, String major) {
		super(age, height, weight);
		this.grade = grade;
		this.major = major;
		// TODO Auto-generated constructor stub
	}



	public int getGrade() {
		return grade;
	}



	public void setGrade(int grade) {
		this.grade = grade;
	}



	public String getMajor() {
		return major;
	}



	public void setMajor(String major) {
		this.major = major;
	}
	
	
	public String information() {
		return "Student [name = " + super.getName() 
				+ ", age = " + super.getAge() 
				+ ", height= " + super.getHeight()
				+ ", weight= " + super.getWeight()
				+ ", grade= " + this.grade 
				+ ", major= " + this.major 
				+ "]";
	}
	
}
