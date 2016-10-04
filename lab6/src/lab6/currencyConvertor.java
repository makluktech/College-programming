package lab6;
import java.awt.*;
import java.awt.event.*;

public class currencyConvertor extends Frame implements ItemListener,ActionListener {
	
	private static final long serialVersionUID = 1L;
	
	private Label myLabel;	

	private Label Amount;
	private Label Result;
	private Choice from;
	private Choice to;
	private Panel panel1;
	private Panel panel2;
	private Panel panel3;
	private Panel panel4;
	private Button submit;
	private Button clear;
    private TextField AmountConvert;
    private TextField Answer; 
  
    
	public static void main(String[]args)
	{
		
		currencyConvertor mycon = new currencyConvertor();
		mycon.setVisible(true);
		
		
	}
	
	public  currencyConvertor(){
	
	
	setSize(380,180);
	setLayout(new FlowLayout());	
    setTitle("Currency Convertor");  //title name
    setBackground(Color.LIGHT_GRAY);   // set background colour
    panel1 = new Panel();
    panel2 = new Panel();
    panel3 = new Panel();
    panel4 = new Panel();
    // label for euro entry
    myLabel=new Label("Enter Currency:");
    Result = new  Label("Total");
    from=new Choice();
    submit = new Button("submit");
    clear = new Button("Clear");
    Amount = new Label("Amount");
    // label for sterling entery
   
    to = new Choice();  
    AmountConvert = new TextField(10);
    Answer =new TextField(10);
    // add the currency types to Choice box
    to.add("Euro");
    to.add("Sterling");
    to.add("Us Dollar");
    to.add("Canadian dollar");
    from.add("Euro");
    from.add("Sterling");
    from.add("Us Dollar");
    from.add("Canadian dollar");
    // add label and TextField to panel 1
    panel1.add(myLabel);
    panel1.add(from);
    panel1.add(to);
  
    // add label and TextField to panel 2
    panel2.add(Amount);
    panel2.add(AmountConvert);
    
    // add label and TextField to panel 3
    panel3.add(submit);
    panel3.add(Result);
    panel3.add(Answer);
 // add clear button to panel 4
    panel4.add(clear);
    // add the panels
    add(panel1);
    add(panel2);
    add(panel3);
    add(panel4);
    from.addItemListener(this);
    to.addItemListener(this);
    submit.addActionListener(this);
    //add listner for clear button
    clear.addActionListener(this);
    
    
    // add listener to close window
    addWindowListener(new WindowAdapter(){ 
    	
    public void windowClosing(WindowEvent e)
	     {
		           System.exit(0);}});  // exit frame
         }	
	  
	        
	
	@Override //convert button
	 public void actionPerformed(ActionEvent e) {
	//  Auto-generated method stub
	 String selectFrom = from.getItem(from.getSelectedIndex());
	 String selectTo = to.getItem(to.getSelectedIndex());
	
//	 	for to pass value to correct methods and output conversion in textbox for EURO
	 if(selectFrom =="Euro" && selectTo== "Euro" )
	  {
		// to get text and convert to double passing to method then change back to string store in variable result
		String result=  Double.toString(euroToEuro(Double.parseDouble(AmountConvert.getText())));
		// set output textbox to result
		Answer.setText(result);
	 }
	 if(selectFrom =="Euro" && selectTo== "Us Dollar" )
	  {
		// to get text and convert to double passing to method then change back to string store in variable result
		String result=  Double.toString(euroToDollar(Double.parseDouble(AmountConvert.getText())));
		// set output textbox to result
		Answer.setText(result);
	 }
	 
	 if(selectFrom =="Euro" && selectTo== "Sterling" )
	  {
		// to get text and convert to double passing to method then change back to string store in variable result
		String result=  Double.toString(euroToSterling(Double.parseDouble(AmountConvert.getText())));
		// set output textbox to result
		Answer.setText(result);
	 }
	 if(selectFrom =="Euro" && selectTo== "Canadian dollar" )
	  {
		// to get text and convert to double passing to method then change back to string store in variable result
		String result=  Double.toString(euroToCanadianDollar(Double.parseDouble(AmountConvert.getText())));
		// set output textbox to result
		Answer.setText(result);
	 }
	 // for to pass value to correct methods and output conversion in textbox for sterling 
	 if(selectFrom =="Sterling" && selectTo== "Euro" )
	  {
		// to get text and convert to double passing to method then change back to string store in variable result
		String result=  Double.toString(sterlingToEuro(Double.parseDouble(AmountConvert.getText())));
		// set output textbox to result
		Answer.setText(result);
	 }
	 if(selectFrom =="Sterling" && selectTo== "Sterling" )
	  {
		// to get text and convert to double passing to method then change back to string store in variable result
		String result=  Double.toString(sterlingToSterling(Double.parseDouble(AmountConvert.getText())));
		// set output textbox to result
		Answer.setText(result);
	 }
	 if(selectFrom =="Sterling" && selectTo== "Us Dollar" )
	  {
		// to get text and convert to double passing to method then change back to string store in variable result
		String result=  Double.toString(sterlingToUsDollar(Double.parseDouble(AmountConvert.getText())));
		// set output textbox to result
		Answer.setText(result);
	 }
	 if(selectFrom =="Sterling" && selectTo== "Canadian dollar" )
	  {
		// to get text and convert to double passing to method then change back to string store in variable result
		String result=  Double.toString(sterlingToCanadianDollar(Double.parseDouble(AmountConvert.getText())));
		// set output textbox to result
		Answer.setText(result);
	 }
	    // 	for to pass value to correct methods and output conversion in textbox for us dollars	
	 if(selectFrom =="Us Dollar" && selectTo== "Euro" )
	  {
		// to get text and convert to double passing to method then change back to string store in variable result
		String result=  Double.toString(usDollarToEuro(Double.parseDouble(AmountConvert.getText())));
		// set output textbox to result
		Answer.setText(result);
	 }
	 if(selectFrom =="Us Dollar" && selectTo== "Sterling" )
	  {
		// to get text and convert to double passing to method then change back to string store in variable result
		String result=  Double.toString(usDollarToSterling(Double.parseDouble(AmountConvert.getText())));
		// set output textbox to result
		Answer.setText(result);
	 }
	 if(selectFrom =="Us Dollar" && selectTo== "Us Dollar" )
	  {
		// to get text and convert to double passing to method then change back to string store in variable result
		String result=  Double.toString(usDollarToUsDollar(Double.parseDouble(AmountConvert.getText())));
		// set output textbox to result
		Answer.setText(result);
	 }
	 if(selectFrom =="Us Dollar" && selectTo== "Canadian dollar" )
	  {
		// to get text and convert to double passing to method then change back to string store in variable result
		String result=  Double.toString(usDollarToCanadianDollar(Double.parseDouble(AmountConvert.getText())));
		// set output textbox to result
		Answer.setText(result);
	 }
		// 	for to pass value to correct methods and output conversion in textbox for canadian dollars	
	 if(selectFrom =="Canadian dollar" && selectTo== "Euro" )
	  {
		// to get text and convert to double passing to method then change back to string store in variable result
		String result=  Double.toString(canadianDollarToEuro(Double.parseDouble(AmountConvert.getText())));
		// set output textbox to result
		Answer.setText(result);
	 }
	 if(selectFrom =="Canadian dollar" && selectTo== "Sterling" )
	  {
		// to get text and convert to double passing to method then change back to string store in variable result
		String result=  Double.toString(canadianDollarToSterling(Double.parseDouble(AmountConvert.getText())));
		// set output textbox to result
		Answer.setText(result);
	 }
	 if(selectFrom =="Canadian dollar" && selectTo== "Us Dollar" )
	  {
		// to get text and convert to double passing to method then change back to string store in variable result
		String result=  Double.toString(canadianDollarToUsDollar(Double.parseDouble(AmountConvert.getText())));
		// set output textbox to result
		Answer.setText(result);
	 }
	 if(selectFrom =="Canadian dollar" && selectTo== "Canadian dollar" )
	  {
		// to get text and convert to double passing to method then change back to string store in variable result
		String result=  Double.toString(canadianDollarToEuroCanadianDollar(Double.parseDouble(AmountConvert.getText())));
		// set output textbox to result
		Answer.setText(result);
	 }
	  if (e.getSource() ==clear)
	    {
           //result = 0.0;
           Answer.setText("");
           AmountConvert.setText("");
	   }    
	 
				
	 }
			// method to calculate euro to euro
		public static double euroToEuro(double input)
		{
			Double Euro = 1.0;
			input =Euro * input;
			return input;
					
		}
		// method to calculate euro to us dollar
		public static double euroToDollar(double input)
		{
		
			Double usDollar = 1.088;
			input =usDollar * input;
			return input;
					
		}
		// method to calculate euro to sterling
		public static double euroToSterling(double input)
		{
		
			Double sterling = .7589;
			input =sterling * input;
			return input;
					
		}
		// method to calculate euro to canadian dollar
		public static double euroToCanadianDollar(double input)
		{
				
			Double canadianDollar = 1.54;
			input =canadianDollar * input;
			return input;
							
		}
		// method to calculate sterling to euro
		public static double sterlingToEuro(double input)
		{
						
			Double sterling = 1.29;
			input =sterling * input;
			return input;
									
		}
		// method to calculate sterling to sterling
		public static double sterlingToSterling(double input)
		{
								
			Double sterling = 1.0;
			input =sterling * input;
			return input;
											
		}
		// method to calculate sterling to us dollars
		public static double sterlingToUsDollar(double input)
		{
										
			Double usDollar = 1.44;
			input =usDollar * input;
			return input;
													
		}
		// method to calculate sterling to canadian dollars
		public static double sterlingToCanadianDollar(double input)
		{
										
			Double canadianDollar = 2.00;
			input =canadianDollar * input;
			return input;
													
		}
		// method to calculate us dollar to Euro
		public static double usDollarToEuro(double input)
		{
		
			Double Euro = .89;
			input =Euro * input;
			return input;
					
		}
		// method to calculate us dollar to sterling
		public static double usDollarToSterling(double input)
		{
		
			Double sterling = .69;
			input =sterling * input;
			return input;
					
		}
		// method to calculate us dollar to us dollar
		public static double usDollarToUsDollar(double input)
		{
		
			Double usDollar = 1.0;
			input =usDollar * input;
			return input;
					
		}
		// method to calculate us dollar to canadian dollar
		public static double usDollarToCanadianDollar(double input)
		{
		
			Double canadianDollar = 1.39;
			input =canadianDollar * input;
			return input;
					
		}
		// method to calculate Canadian dollar to Euro
		public static double canadianDollarToEuro(double input)
		{
		
			Double Euro = .64;
			input =Euro * input;
			return input;
					
		}
		// method to calculate Canadian dollar to Sterling
		public static double canadianDollarToSterling(double input)
		{
		
			Double Sterling = .50;
			input =Sterling * input;
			return input;
					
		}
		// method to calculate Canadian dollar to Us Dollar
		public static double canadianDollarToUsDollar(double input)
		{
		
			Double usDollar = .72;
			input =usDollar * input;
			return input;
					
		}
		// method to calculate Canadian dollar to Canadian dollar 
		public static double canadianDollarToEuroCanadianDollar(double input)
		{
		
			Double canDollar = 1.0;
			input =canDollar * input;
			return input;
					
		}
	   
		
		@Override
		public void itemStateChanged(ItemEvent arg0) {
					// TODO Auto-generated method stub
					
		}
}
