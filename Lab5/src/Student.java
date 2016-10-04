/*
** Author:Colm Carey	Date: 24/11/2015
** Purpose: lab 5.3 
*/


public class Student {
	
	private String name;
	private String Address;
	private double StudentId;
	private String Course;
	private double TelephoneNum;
	private int year;
	private double RegFee = 500.00;
	public Student(String name, String address, double studentId,String course, double telephoneNum, int year) {
		super();
		this.name = name;
		Address = address;
		StudentId = studentId;
		Course = course;
		TelephoneNum = telephoneNum;
		this.year = year;
	
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public double getStudentId() {
		return StudentId;
	}
	public void setStudentId(double studentId) {
		StudentId = studentId;
	}
	public String getCourse() {
		return Course;
	}
	public void setCourse(String course) {
		Course = course;
	}
	public double getTelephoneNum() {
		return TelephoneNum;
	}
	public void setTelephoneNum(double telephoneNum) {
		TelephoneNum = telephoneNum;
	}
	public double getRegFee() {
		return RegFee;
	}
	public int getyear() {
		return year;
	}
	public void setyear(int year) {
		this.year = year;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", Address=" + Address
				+ ", StudentId=" + StudentId + ", Course=" + Course
				+ ", TelephoneNum=" + TelephoneNum + ", RegFee=" + RegFee + "]";
	}
	
	public double RegFee(int year)
	{
		double Reg = 0.0;
		int year1 = 1;
		int year2 = 2;
		int year3 = 3;
		
		if(this.year == year1)
		{
			Reg = this.RegFee;
		}
		else if (this.year == year2)
		{
			Reg = RegFee+ 100.00;
		}
		else if (this.year == year3)
		{
			Reg = this.RegFee+ 100.00;
		}
		
		return Reg;
	}
	

}
