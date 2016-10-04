/*Author: Colm Carey	Date:06/10/15 
 *Write a javaprogram that which displays a message box asking for an integer and returns if its even or odd
 *** 
*/



package lab6;

import javax.swing.JOptionPane;

public class ex4 {
	public static void main(String[]args){
	String num = "";
    int number1;
    
    num = JOptionPane.showInputDialog("Please enter a number");//prompt user to enter a number
    number1 = Integer.parseInt(num);
    
    if(number1 %2 ==0)// if the number is divisable by 2 do this
    {
    	num="The number"+" "+num +" "+ "is even";
    }
    
    else                  // else for  if number is odd
    {
    	num="The number"+" "+num +" "+ "is odd";
    }
    
    JOptionPane.showMessageDialog(null,num,"My Message Box",1); //display the result to the screen
	 System.exit(0);
}
}