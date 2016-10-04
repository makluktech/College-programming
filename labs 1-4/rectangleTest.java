/*
** Author: Colm Carey	Date:03/11/2015                                                                             /10/2015
** Purpose: calculate the perimeter of triangle
*
*/


public class rectangleTest {
	
public static void main(String args[])
{
	float lengthA;
	float widthA;
	
	
	System.out.println("Please enter length of Rectangle : ");  
  	lengthA = Keyboard.readInt();
	System.out.println("Please enter width of Rectangle : "); 
  	widthA = Keyboard.readInt();
  	
  	Rectangle rectA = new Rectangle(lengthA, widthA);  // create new instance of triangle 
  	
  	System.out.println("The Perimeter of the Rectangle is: " + rectA.getPerimeter());//print calculated perimeter
  		
	System.out.println("The Area of the Rectangle is: " + rectA.getArea());// print Area
  		
}


}
