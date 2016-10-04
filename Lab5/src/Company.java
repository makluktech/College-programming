

/*
** Author:Colm Carey	Date: 24/11/2015
** Purpose: Create a car class and modify the Employee class created in  lab 
*   51 removing the car reg number 
*   property and replacing it with a company car property
*/


public class Company 
{
	private Employee2[] company = new Employee2[10];  // set an array of 10
	private  int index = 0; // set the index to zero
	
	public Company()
	{
		
	}
	
	
	public void addEmployee(Employee2 employee)
	{
		this.company[index] = employee;  // add the employee at index position
		index++; //increment by 1 each time
	}
	public void getAllEmployee()
	{
		int index;
		for(index = 0; index <= company.length-1; index++) //loop for to get employees
		{
			if(company[index] == null)  // if equal to zero break out
			{
				break;  
			}
			System.out.println(company[index].toString()); // convert to readable text
			System.out.println();
		}
	}
}
