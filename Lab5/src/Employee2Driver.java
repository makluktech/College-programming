
/*
** Author:Colm Carey	Date: 24/11/2015
** Purpose: 
*/

public class Employee2Driver 
{

	public static void main(String[] args) 
	{
		Cars newcar = new Cars ("Ford","Escort",2.0,"D","12 KE 2052");// new car object for michael
		Cars colmscar = new Cars ("Fiat","Panda",1.2,"D","80 D 112");// new car object for colm
		// new Employee object object for Micahel
		Employee2 Michael = new Employee2(2.0,"Michael"," 24 Park Ave", "Computing", 345434,newcar);
		// new Employee object object for colm
		Employee2 Colm = new Employee2();
		Colm.setName("Colm");
		Colm.setAddress("2 The Oaks");
		Colm.setNumber(89129);
		Colm.setDepartment("software Development");
		Colm.setSalary(50000);
		Colm.setCars(colmscar);// set the details for colm
		System.out.println(Colm.toString());// print colm details
		System.out.println("Tax Payable to date: " + Colm.taxPayable());// prints colms taxpayable
		System.out.println();
		System.out.println(Michael.toString());// print Michael details
		System.out.println("Tax Payable to date: " + Michael.taxPayable());// prints michaels taxpayable
		System.out.println();
		
		
		Company myCo = new Company();
		myCo.addEmployee(Colm);//send object colm and cars details to company
		myCo.addEmployee(Michael);//send object Michael and cars details to company
		//myCo.getAllEmployee();
	}

}
