
/*
** Author:Colm Carey	Date: 24/11/2015
** Purpose: 
*/



public class Employee2 {

	private double number;
	private String name;
	private String address;
	private String department;
	private double salary;
	private Cars car;//stores car object
	
	public Employee2()
	{
		
	}
	// constuctor 1
	public Employee2(double num, String nameOfEmployee, String addressOfEmployee, Cars car)
	{
		this.number = num;
		this.name = nameOfEmployee;
		this.address = addressOfEmployee;
		this.department = null;
		this.salary = 0;
		this.car = car;
	}
	//constructor 2
	public Employee2(double num, String nameOfEmployee, String addressOfEmployee, String dep, double sal, Cars car)
	{
		this.number = num;
		this.name = nameOfEmployee;
		this.address = addressOfEmployee;
		this.department = dep;
		this.salary = sal;
		this.car = car;
	}
	// set employee number
	public void setNumber(double num)
	{
		this.number = num;
	}
	// set employee name
	public void setName(String nameOfEmployee)
	{
		this.name = nameOfEmployee;
	}
	// set employee address
	public void setAddress(String addressOfEmployee)
	{
		this.address = addressOfEmployee;
	}
	// set employee department
	public void setDepartment(String dep)
	{
		this.department = dep;
	}
	// set employee salary
	public void setSalary(double sal)
	{
		this.salary = sal;
	}
	// set employee car details
	public void setCars(Cars car)
	{
		this.car = car;
	}
	// get the employee name
	public String getName()
	{
		return this.name;
	}
	// gets employee number
	public double getNumber()
	{
		return this.number;
	}
	// gets employee address
	public String getAddress()
	{
		return this.address;
	}
	// gets employee department and returns it
	public String getDepartment()
	{
		return this.department;
	}
	// gets employee salary and returns
	public double getSalary()
	{
		return this.salary;
	}
	// gets cars details and returns them
	public Cars getCars()
	{
		return this.car;
	}
	// prints to readable text
	public String toString()
	{
		return "Employee number: " + this.number + "\nEmployee name: " + this.name 
				+ "\nEmployee address: " + this.address + "\nEmployee department: " + this.department 
				+ "\nEmployee salary: " + this.salary 
				+ "\nEmployee Company Car Reg: " + this.car;
	}
	// does the calculations for the tax depending on salary.
	public double taxPayable()
	{
		double tax;
		if(this.salary <= 20000.0)
		{
			tax = this.salary * 0.2;
		}
		else
		{
			tax = this.salary * 0.4;
		}
		return tax;
	}
	
}
