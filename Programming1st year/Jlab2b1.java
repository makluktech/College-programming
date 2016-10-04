
class Jlab2b1

// Student Name 	: 	Colm Carey
// Student Id Number : 	CO0197157
// Date :				10/10/2014
// Purpose : 			Insurance calculation



{
    public static void main(String[] args)
    {
    			// variables been used
    double insurancePremium;
    double lastPremium;
    int claimsMade;
    double noClaims;
    double claimAssessment;
    
    
    
    System.out.print("Please enter your last premium :"); // take in last premium
    lastPremium = EasyIn.getInt();
    
    System.out.print("Please enter the amount of claims made :");
    claimsMade = EasyIn.getInt();
   
    insurancePremium = (double)(lastPremium * .05) + lastPremium; // calculate new premium
    System.out.println("Your new premium is :" + insurancePremium);
  
    noClaims = insurancePremium * .40;	// calculates policy discount
    claimAssessment = (insurancePremium * .20) * claimsMade;
    
    	if(claimsMade == 0)	// to calculate discount to policy
    	
    		{
    		
    			System.out.println("you have received a discount of :" + noClaims);
    		}
    		
    	else  //  else to calculate extra charge for claims
    		{
    			
    			System.out.println("you have an extra claims charge of :" + claimAssessment);
    			
    		}
    		
    
    
    
    }
}

