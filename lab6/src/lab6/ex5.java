/*Author: Colm Carey	Date:06/10/15 
* Write a java program that which displays a message box asking for an integer allows the user
* to square cube or get inverse of a number
*/


package lab6;
import javax.swing.*;
public class ex5 {

	
	public static void main(String[] args) 
	{
		String num ;
		int num1;
		String message ;
		
		 num=JOptionPane.showInputDialog  //show num entered
			        ("Please enter a number");
		 num1=Integer.parseInt(num);       //covert num to string
		
        message=JOptionPane.showInputDialog
     	("Please enter sqr... for squared\n or cube... for cubed\n inverse.. for inverse");
        
        if (message.equals("sqr")) //if the user chooses to square the num
        {
     	   num="the number squared is "+num1*num1; //square the number
     	  
        }
        
        else if(message.equals("cube")) // else user chooses cube
        {
     	  num="the number cubed is "+num1*num1*num1; // cube the number
     	  
        } 
        else
        { 
        	num= "The inverse of the number is"+num1/num1;// calculate the inverse num
        }
          
 		JOptionPane.showMessageDialog  // display result of calculation to screen
 		(null,num,"My Message Box",1);
 		System.exit(0);        
	}
	
	

}
