/*
** Author: Colm Carey	Date:03/11/2015                                                                             /10/2015
** Purpose:methods to calculate the perimeter and area of a rectangle
*
*/


public class Rectangle {
	private float length;
	private float width;
	
	
	public Rectangle()		// constructor method #1
	{
		length = 1;
		
		width = 1;	
	}
		
	public Rectangle(float len, float wid )	// constructor method #2
	{
		setLength(len);
		setWidth(wid);
	}
	public void setLength(float len)
	{
		if((len > 0.0) && (len<20.0))//if length is greater then 0.0 or less than 2.0
			length = len;
		else
			length = 1;  // else default to 1
	}
	public void setWidth(float wid)
	{
		if(wid >0.0 && wid<20)  
			width = wid;		//set width if width is greater then 0.0 or less than 2.0
		else
			width = 1;  // else default to 1
	}
	public float getPerimeter()  // calculate perimeter
	{
		return (2*length) + (2*width);
	}
	public float getArea()   // calculate area
	{
		return length*width;
	}
	
	

	

}
