
/*Author: Colm Carey	Date:06/12/15 
 * Write a javaprogram that which displays a message box showing the following table num /squared/cubed
 *** 
*/package lab6;

import javax.swing.JOptionPane;

public class ex2 {
	public static void main(String[]args){
		
		String message = "Num square cube\n"; // loop is 1 and num is less than 10
		for(int num = 1; num <=10;num++){
			message = message +num + "       " +num*num +"       " + num*num*num +"\n";
		}
		 JOptionPane.showMessageDialog(null,message,"My Message Box",1); // display message box
		 System.exit(0);
		
	}

}
