/*Author: Colm Carey	Date:26/02/16
 **
 */
import javax.swing.JOptionPane;

public class radius {
	
public Double area;
public double pi =3.14159;// set pi 

public radius(){
	
}
	
	
public void area (double r)
{
	
	area = pi*r*r; // calculate area 
	JOptionPane.showMessageDialog(null, "The area is :" + area );
	
}
	
	
	

}
