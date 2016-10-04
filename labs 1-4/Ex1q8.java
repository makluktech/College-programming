
/*Author: Colm Carey	Date:06/10/15 
 * Modify ex1Q5 so it contains an extra column (cold/hot/ warm)
 *** 
*/
public class Ex1q8 
{
	
	
		public static void main(String[] args) 
		{
			int temp=0;
			int celsius=32;
		   String comment = "";
			
			
			System.out.println("Fahrenheit Celsius");
			
				while (temp <= 212)
				{
					if (temp < 20)
						{
							comment = "Cold";
						}
					else if (temp > 20 && temp <= 50)
						{
							comment = "Warm";
						}
					else 
						{
							comment = "Hot";
						}
					
					celsius = (int)Math.round(5.0/9.0*(temp-32));
					 System.out.println(" "+  temp + " " + celsius + " " + comment);
					temp +=12;
				}
		}

	}



