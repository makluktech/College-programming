/*Author: Colm Carey	Date:26/02/16
 **
 */
import java.io.*;
import javax.swing.*;

public class Radiusdriver {
	
 public static void main(String[]args)
  {
		
	 BufferedReader reads = new BufferedReader(new InputStreamReader(System.in));
	 radius colms = new radius();
	 double userInput = 0.0;
			
	System.out.print("Please enter the radius :  "); 
		try {
				String s = reads.readLine();
				userInput = Double.parseDouble(s);
				colms.area(userInput);
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Error in data type entered", "Alert", JOptionPane.ERROR_MESSAGE);
			}catch(IOException e){
				System.out.print("Error in data type entered"); // print error message to screen if chars are entered 
			}			
			
  }

}
