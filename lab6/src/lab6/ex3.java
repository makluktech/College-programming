/*Author: Colm Carey	Date:012/01/16 
 * Write a javaprogram that which displays a message box showing the following table num /squared/cubed
 **/ 

package lab6;
import javax.swing.JOptionPane;

public class ex3 {
public static void main(String[]args){
	
	
	String name ;
	String name2;
	String greeting ;
	
	
	
	
	name = JOptionPane.showInputDialog("Enter your first name");//prompt user to enter first name
	
	name2 = JOptionPane.showInputDialog("Enter your  Surname");//prompt user to enter surname
	greeting ="hello" +" " + name +" "+ name2;  // Concatenates users name and greeting
	
	
	 JOptionPane.showMessageDialog(null,greeting,"My Message Box",1); //displays the greeting plus the users name
	 System.exit(0);
	}

}
