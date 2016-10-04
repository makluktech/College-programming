
/*
** Author:Colm Carey	Date: 14/01/2016
** Purpose: to create a fully functional calculator 
*/

package lab6;
import java.awt.*;
import java.awt.event.*;

public class calcFrame extends Frame implements ActionListener{
	private static final long serialVersionUID = 1L;
	
	Label myLabel;
	Label totalLabel;
	static TextField textbox;
	Button b1;
	Button b2;
	Button b3;
	Button b4;
	Button b5;
	Button b6;
	Button b7;
	Button b8;
	Button b9;
	Button b0;
	Button equals;
	Button divide;
	Button multi;
	Button subtract;
	Button Plus;
	Button clear;
	static String lastOperator;
	static String lastOperatorMem;
	

	 // returns the lastOperator
	 
	public static String getLastOperator() {
		return lastOperator;
	}


	// lastOperator the lastOperator to set
	
	public static void setLastOperator(String lastOperator) {
		calcFrame.lastOperator = lastOperator;
	}
	
	
	
	//constructor to run the frame 
    public  calcFrame(){
		
    	//setLayout(new BorderLayout(2,1));	//set border layout 2 rows 1 column	
    	setSize(300,350);
        setTitle("Colm's First Calculator");  //title name
        setBackground(Color.lightGray);   // set background colour
       
       
       Panel  north =new Panel();
       myLabel=new Label();
       myLabel.setText("Enter Number");
       totalLabel = new Label("Here:");
       textbox=new TextField(30);
   
       north.add(textbox);
       north.add(totalLabel);
       add(north,"North");
       add(myLabel); 
       
    
      	//panel 2 south
        Panel myPanel = new Panel();
        myPanel.setLayout(new GridLayout(5,5,5,5));
     // create buttons
        b1 = new Button("1");
        b1.addActionListener(this);	
        b2=new Button("2");
        b2.addActionListener(this);	
  		b3=new Button("3");
  		b3.addActionListener(this);	
  	    b4=new Button("4");
  		b4.addActionListener(this);	
  		b5=new Button("5");
  		b5.addActionListener(this);	
  		b6=new Button("6");
  		b6.addActionListener(this);	
  		b7=new Button("7");
  		b7.addActionListener(this);	
  		b8=new Button("8");
  		b8.addActionListener(this);	
  		b9=new Button("9");
  		b9.addActionListener(this);	
  		b0=new Button("0");
  		b0.addActionListener(this);	
  		Plus = new Button("+");
  		Plus.addActionListener(this);	
  		subtract = new Button("-");
  		subtract.addActionListener(this);	
  		divide = new Button("/");
  		divide.addActionListener(this);	
  		multi = new Button("*");
  		multi.addActionListener(this);	
  		equals = new Button("=");
  		equals.addActionListener(this);	
  		clear = new Button("Clear");
  		clear.addActionListener(this);	
  	//add the buttons
  		myPanel.add(b1); 
  		myPanel.add(b2);
  		myPanel.add(b3);
  		myPanel.add(b4);
  		myPanel.add(b5);
  		myPanel.add(b6);
  		myPanel.add(b7);
  		myPanel.add(b8);
  		myPanel.add(b9);
  		myPanel.add(b0);
  		myPanel.add(Plus);
  		myPanel.add(subtract);
  		myPanel.add(divide);
  		myPanel.add(multi);
  		myPanel.add(equals);
  		myPanel.add(clear);
  		
  		add(myPanel,"South");
  		
  		pack();
  	   
      		 // add the window listener
	         addWindowListener(new WindowAdapter(){ 
	 		    public void windowClosing(WindowEvent e)
	 		     {
	 		           System.exit(0);}});  // exit frame
     }
	         
	
	         public void actionPerformed(ActionEvent e) {
	        		
	     		//If the event in param e is from button1 
	     		if(e.getSource()==b1){ 
	     			if(lastOperator=="")
	     				textbox.setText(textbox.getText() + "1");//Add 
	     			else
	     				textbox.setText("1");
	     			lastOperator="";
	     		}
	     		//If the event in param e is from button2 
	     		if(e.getSource()==b2){ 
	     			if(lastOperator=="")
	     				textbox.setText(textbox.getText() + "2");
	     			else
	     				textbox.setText("2");
	     			lastOperator="";
	     		}
	     		//If the event in param e is from button3
	     		if(e.getSource()==b3){ 
	     			if(lastOperator=="")
	     				textbox.setText(textbox.getText() + "3");
	     			else
	     				textbox.setText("3");
	     			lastOperator="";
	     		}
	     		//If the event in param e is from button4
	     		if(e.getSource()==b4){ 
	     			if(lastOperator=="")
	     				textbox.setText(textbox.getText() + "4");
	     			else
	     				textbox.setText("4");
	     			lastOperator="";
	     		}
	     		//If the event in param e is from button5
	     		if(e.getSource()==b5){ 
	     			if(lastOperator=="")
	     				textbox.setText(textbox.getText() + "5");
	     			else
	     				textbox.setText("5");
	     			lastOperator="";
	     		}
	     		//If the event in param e is from button6
	     		if(e.getSource()==b6){ 
	     			if(lastOperator=="")
	     				textbox.setText(textbox.getText() + "6");
	     			else
	     				textbox.setText("6");
	     			lastOperator="";
	     		}
	     		//If the event in param e is from button7
	     		if(e.getSource()==b7){ 
	     			if(lastOperator=="")
	     				textbox.setText(textbox.getText() + "7");
	     			else
	     				textbox.setText("7");	
	     		}
	     		//If the event in param e is from button8
	     		if(e.getSource()==b8){ 
	     			if(lastOperator=="")
	     				textbox.setText(textbox.getText() + "8");
	     			else
	     				textbox.setText("8");	
	     			lastOperator="";
	     		}
	     		//If the event in param e is from button9
	     		if(e.getSource()==b9){ 
	     			if(lastOperator=="")
	     				textbox.setText(textbox.getText() + "9");
	     			else
	     				textbox.setText("9");
	     			lastOperator="";
	     		}
	     		//If the event in param e is from button0
	     		if(e.getSource()==b0){ 
	     			if(lastOperator=="")
	     				textbox.setText(textbox.getText() + "0");
	     			else
	     				textbox.setText("0");
	     			lastOperator="";
	     		}
	     		//If the event in param e is from equals btn
	     		if(e.getSource()==equals){ 
	     			calcFrame.setLastOperator(calcFrame.lastOperatorMem);//Set last operator to the one last used that we stored as entering new input reset it
	     			calcBrains.proccessOperand();
	     			totalLabel.setText(String.valueOf(calcBrains.getTotal()));//Set the running total (label) to the total 
	     			
	     		}
	     		//If the event in param e is from divide button
	     		if(e.getSource()==divide){ 	
	     			//textbox.setText("2");
	     			lastOperator="divide";
	     			lastOperatorMem="divide";
	     			calcBrains.setTotal(Double.parseDouble(textbox.getText()));// Setting the total to the value in the text box
	     			calcBrains.divideClick();		
	     			totalLabel.setText(String.valueOf(calcBrains.getTotal()));//Set the running total (label) to the total 
	     		}
	     		//If the event in param e is from multi button
	     		if(e.getSource()==multi){ 
	     			lastOperator="multi";
	     			lastOperatorMem="multi";
	     			calcBrains.setTotal(Double.parseDouble(textbox.getText()));// Setting the total to the value in the text box
	     			calcBrains.MultiClick();	
	     			totalLabel.setText(String.valueOf(calcBrains.getTotal()));//Set the running total (label) to the total 
	     			
	     		}
	     		//If the event in param e is from subtract button
	     		if(e.getSource()==subtract){ 
	     			lastOperator="subtract";
	     			lastOperatorMem="subtract";
	     			calcBrains.setTotal(Double.parseDouble(textbox.getText()));// Setting the total to the value in the text box
	     			calcBrains.subtractClick();	
	     			totalLabel.setText(String.valueOf(calcBrains.getTotal()));//Set the running total (label) to the total 
	     		}
	     		
	     		     		
	     		//If the event in param e is from pluc button
	     		if(e.getSource()==Plus){ 
	     			if(lastOperator!="plus")
	     			{
	     			lastOperator="plus";
	     			lastOperatorMem="plus";
	     			calcBrains.addClick();
	     			totalLabel.setText(String.valueOf(calcBrains.getTotal()));//Set the running total (label) to the total 
	     			
	     			}
	     		}
	     		
	     		//If the event in param e is from clear button
	     		if(e.getSource()==clear){ 
	    			lastOperator="";
	    			lastOperatorMem="";
	    			calcBrains.clearClick();
	    			totalLabel.setText(String.valueOf(calcBrains.getTotal()));//Set the running total (label) to the total 
	    			totalLabel.setText("");  // clears the running total from textbox
	    			calcBrains.setTotal(0.0);//set the running totalLabel to 0.0
	    		}
     
	 
    }
    
   
}