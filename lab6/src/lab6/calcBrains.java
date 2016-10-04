
/*
** Author:Colm Carey	Date: 14/01/2016
** Purpose: to create a fully functional calculator 
*/

  package lab6;
 
  import java.awt.Frame;

 public class calcBrains{
	 
	 
	 static double total=0;

		//Method to get the running total
		public static double getTotal(){	
			return total;
		}
		
		//Method to set the running total
		public static void setTotal(double total){	
			calcBrains.total = total;
		}
		
		//Method for when the add button is clicked
		public static void addClick(){	
			double valueInTextbox = Double.parseDouble(calcFrame.textbox.getText());//store value In Textbox
			total = total + valueInTextbox; //add it to the total
			calcFrame.textbox.setText(""+ total +""); //displays the total
		}
		//Method for when the multiply button is clicked
		public static void MultiClick(){	
			calcFrame.textbox.setText(""); //Empty the text box to allow user input
		}
		
		//Method for when the multiply button is clicked
		public static void MultiCalculate(){	
			double valueInTextbox = Double.parseDouble(calcFrame.textbox.getText());//store current valueInTextbox
			total = total * valueInTextbox; //add it to the total
			calcFrame.textbox.setText(""+ total +""); //displays the total
			
		}

		//Method for when the minus button is clicked to clear screen
		public static void subtractClick(){	
			calcFrame.textbox.setText(""); //Empty textbox to allow user input
		}
		
		
		//Method for when the minus button is clicked to get total
		public static void subtractCalculate(){	
			double valueInTextbox = Double.parseDouble(calcFrame.textbox.getText());//store current valueInTextbox
			total = total - valueInTextbox; //subtract it from total
			calcFrame.textbox.setText(""+ total +""); //display the total
		}
		
		public static void divideClick(){	
			calcFrame.textbox.setText(""); //Empty the text box to allow user input
		}
		
		// method for when  divide button is clicked
		public static void divideCalculate(){	
			double valueInTextbox = Double.parseDouble(calcFrame.textbox.getText());//store current valueInTextbox
			total = total / valueInTextbox; //divide total 
			System.out.print(total);
			calcFrame.textbox.setText(""+ total +""); //display the total
		
			
		}
		//Method for when the clear button is clicked
		public static void clearClick(){	
			calcFrame.textbox.setText("");
		}
		


	
	//Method for when the equals button is clicked
		public static void proccessOperand(){
			if(calcFrame.lastOperator=="plus")
			{
				addClick();	//display totals
			}
			else if(calcFrame.lastOperator=="subtract"){
				subtractCalculate();	
			}
			else if(calcFrame.lastOperator=="multi"){
				MultiCalculate();	//display totals
			}
			else if(calcFrame.lastOperator=="divide"){
				divideCalculate();	//display totals
			}
			else{
				calcFrame.textbox.setText(calcFrame.lastOperator);
			}
		}
		
		 public static void main(String[]args){
			    
			 Frame Calc = new calcFrame(); // create a new frame(called Calc)
			 Calc.setVisible(true);   // set it to visible
			 
				
				}
		
	}
	

	 

 
 
 
 
 