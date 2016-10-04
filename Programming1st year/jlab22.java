
class jlab22

// Student Name : 		Colm Carey
// Student Id Number : 	C00197157
// Date :				29/09/2014
// Purpose : 			Average exam mark


// Error : "Invalid path, \bin\javac.exe -classpath"
// 	Solution
// 		Configure -> Options -> JDK Profiles -> New -> browse to C:\Program Files\Java\JDK1.7.03_03
//		Them click "OK" In the options dialogue box (if there is a blank line over "JDK ver . . delete it) Then click OK

{
    public static void main(String[] args)
    {
    	int Programming;	//Declares variables used in program
    	int Maths;
    	int Hardware;
    	double AverageMark ;
    	double Grade;
    	
    
    	System.out.print("Enter the Programming grade -> ");   	// take in programming grade
		Programming = EasyIn.getInt() ;
		
    	System.out.print("Enter the Maths grade -> ") ;			// take in maths grade
    	Maths = EasyIn.getInt();
    	
    	System.out.print("Enter the Hardware grade -> ");  		// take in Hardware grade 
		Hardware = EasyIn.getInt() ;
		
    	
    	AverageMark = (double)(Programming + Maths + Hardware) /3;// calculates the sum for programming +maths +hardware /3 gives average
    	System.out.println("the average of your grades is "+ AverageMark );	// display the average mark
    	
    	Grade = AverageMark; //sets the grade equal to average mark
    	
    	
    		if(Grade >= 70 )		// if statement to calculate if the grade is equal to or greater than 70
    			{
    				System.out.println("Your average mark is a Distincton -> "  + Grade);
    				
    			}
    			
    		else if(Grade >= 63 && Grade  < 70)	//if statement calculates if the grade is >= 63 && <70
    			{
    				System.out.println("Your average mark is a Merit1 -> "  + Grade);
    				
    			}
    			
    		else if(Grade >= 55 && Grade < 63)	//if statement calculates if the grade is >=55 && < 63
    			{
    				System.out.println("Your average mark is a Merit2 -> "  + Grade);
    				
    			}
    			
    			
    		 else if(Grade >= 40 && Grade < 55)	//if statement calculates if the grade is >=40 && < 55
    			{
    				System.out.println("Your average mark is a Pass -> "  + Grade);
    				
    			}
    			
    			
    		else if(Grade < 40)					//if statement calculates if the grade is less than 40
    			{
    				System.out.println("Your average mark is a Fail -> "  + Grade);
    				
    			}
    			
    			
    			
    }
}

