
class	Jlab64

// Student Name 	: 	Colm Carey
// Student Id Number : 	CO0197157
// Date :				21/01/2015
// Purpose : 			Method to take in int and return string



{
	public static String myaward( int marks)
	{
			
    	
       	String result;
    
    	
    
    	
		
    
       result = "";
    	
    
    	
    		if(marks >=70)		// if statement to calculate if the grade is equal to or greater than 70
    			{
    			
    				result = "Distinction";
    			}
    			
    		else if(marks >= 63 &&marks <=69)//calculatethe grade is >= 63 && <70
    			{
    				result = "Merit1";
    				
    			}
    			
    		else if(marks>= 55 && marks < 63)//if statement calculates if the grade is >=55 && < 63
    			{
    				result ="Merit2";
    				
    			}
    			
    			
    		 else if(marks >=40 && marks <55) //if statement calculates if the grade is >=40 && grade <55
    			{
    			
    				result = "pass";
    			}
    			
    			
    		else if(marks < 40)				//if statement calculates if the grade is less than 40
    			{
    				result = "Fail";
    				
    			}
    			
    			return result;
		
	}
	
    public static void main(String[] args)
    {
    	 
    	int marks;
    	
    	
    	System.out.print("Enter your marks to get grade:");
		marks=EasyIn.getInt();
		System.out.println("the number is: "+myaward( marks));
    }
}

