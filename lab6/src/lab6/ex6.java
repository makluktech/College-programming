package lab6;

import javax.swing.JOptionPane;

public class ex6 {
	

	public static void main(String[] args) 
	{
		String num ;
		int num1;
		int num2;
		String message ;
		
		 num=JOptionPane.showInputDialog  //show num entered
			        ("Please enter a number");
		 num1=Integer.parseInt(num);       //covert num to string
		
		 
        message=JOptionPane.showInputDialog
     	("Please enter add... for add\n or minus... for minus\n multi.. for multiply\n div.. for divide");
        num=JOptionPane.showInputDialog  //show num entered
		        ("Please enter a second number");
	 num2=Integer.parseInt(num);
	 
        if (message.equals("+")) //if the user chooses to square the num
        {
     	   num="the numbers addedb together are "+ (num1+num2); //add num1 by num2 
     	  
        }
        
        else if (message.equals("-"))
        {
      	   num="the answer to num1 minus num2 is:"+ (num1 - num2); //subtract num1 by num2 
      	  
         }
        else if (message.equals("*"))
        {
      	   num="the answer to num1 multiply by num2 is:"+ (num1 * num2); //multiply num1 by num2 
      	  
         }
        else if (message.equals("/"))
        {
      	   num="the answer to num1 divided by num2 is:"+ (num1 / num2); //divide num1 by num2 
      	  
         }
       
       
 		JOptionPane.showMessageDialog  // display result of calculation to screen
 		(null,num,"My Message Box",1);
 		System.exit(0);       
}
		
	
}
