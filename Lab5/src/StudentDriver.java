/*
** Author:Colm Carey	Date: 24/11/2015
** Purpose: lab 5.3 
*/
public class StudentDriver {
	public static void main(String[] args) 
	{
		
		// new Student object object for Micahel
		Student Michael = new Student("Michael", " 334 New Road ",1254, "Computing",86655555,2);
		
		System.out.println(Michael.toString());//print student michael to readable text
		System.out.println("Registration fees due to date: " + Michael.RegFee(Michael.getyear()));//print student michael to registration fees
	}


}
