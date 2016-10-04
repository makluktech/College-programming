/*Author: Colm Carey	Date:29/09/15
 ** java application list fahrenheit values in steps of 12 and calculates 
 *equivelent in Celsius
 */
public class Ex1q5 
{
	
	public static void main(String[] args) 
	{
		int temp;
		int index=32;
	   
		
		
		System.out.println("Fahrenheit Celsius");
		
			while (index <= 212)
			{
				 temp = (int)Math.round(5.0/9.0*(index-32));
				 System.out.println(" "+ index + " " + temp );
				index+=12;
			}
	}

}
