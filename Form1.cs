using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
// Colm Carey
// C00197157 
// Windows calculator

namespace Lab1q1
{
    public partial class calculator : Form
    {// DECLARE VARIABLES
        double storeNum1 = 0.0;
        double storeNum2 = 0.0;
        double ans       = 0.0;
        string calcFunction = "";

        public calculator()
        {
            InitializeComponent();
        }
        // Display num 1 to screen
        private void button1_Click(object sender, EventArgs e)
        {
            textBox1.Text = textBox1.Text + "1";

        }
        // Display num 2 to screen
        private void button2_Click(object sender, EventArgs e)
        {
            textBox1.Text = textBox1.Text + "2";
        }
        // Display num 3 to screen
        private void button3_Click(object sender, EventArgs e)
        {
            textBox1.Text = textBox1.Text + "3";
        }
        // Display num 4 to screen
        private void button4_Click(object sender, EventArgs e)
        {
            textBox1.Text = textBox1.Text + "4";
        }
        // Display num 5 to screen
        private void button5_Click(object sender, EventArgs e)
        {
            textBox1.Text = textBox1.Text + "5";
        }
        // Display num 6 to screen
        private void button6_Click(object sender, EventArgs e)
        {
            textBox1.Text = textBox1.Text + "6";
        }
        // Display num 7 to screen
        private void button7_Click(object sender, EventArgs e)
        {
            textBox1.Text = textBox1.Text + "7";
        }
        // Display num 8 to screen
        private void button8_Click(object sender, EventArgs e)
        {
            textBox1.Text = textBox1.Text + "8";
        }
        // Display num 9 to screen
        private void button9_Click(object sender, EventArgs e)
        {
            textBox1.Text = textBox1.Text + "9";
        }
        // Display  0 to screen
        private void button10_Click(object sender, EventArgs e)
        {
            textBox1.Text = textBox1.Text + "0";  //display 0 in textbox 
        }
        // clear the text box
        private void clear_button_Click(object sender, EventArgs e)
        {
            textBox1.Clear();// clears text from text box
            Decimal.Enabled = true;//Enable decimal button

        }//ADD BTN
        private void Add_button_Click(object sender, EventArgs e)
        {
            storeNum1 = (Double)Convert.ToDouble(textBox1.Text);
            calcFunction = "ADD";
            Decimal.Enabled = true;
            textBox1.Clear(); //clear the text box
        }//SUBTRACT BTN
        private void Subtract_Click(object sender, EventArgs e)
        {
            storeNum1 = (Double)Convert.ToDouble(textBox1.Text);
            calcFunction = "Subtract";
            Decimal.Enabled = true;
            textBox1.Clear(); //clear the text box

        }
        //MULTIPLY BTN
        private void Multiply_Click(object sender, EventArgs e)
        {
            storeNum1 = (Double)Convert.ToDouble(textBox1.Text);
            calcFunction = "Multiply";
            Decimal.Enabled = true;
            textBox1.Clear(); //clear the text box

        }
        //DIVIDE BTN
        private void Divide_Click(object sender, EventArgs e)
        {
            storeNum1 = (Double)Convert.ToDouble(textBox1.Text);
            calcFunction = "Divide"; // set the calcFunction  = divide 
            textBox1.Clear(); //clear the text box
        }
        // Display decimal point
        private void Decimal_Click(object sender, EventArgs e)
        {
            textBox1.Text+="."; // decimal point
            Decimal.Enabled = false;

        }
        //EQUALS BTN
        private void Equals_button_Click(object sender, EventArgs e)
        {
            storeNum2 = (double)Convert.ToDouble(textBox1.Text);
            textBox1.Clear();

            if (calcFunction == "Subtract")  // do subtraction calculation
                {
                    ans = storeNum1 - storeNum2; // sets ans = storeNum1 minus storeNum2
                    textBox1.Text = ans.ToString();
                

              }
            if (calcFunction == "ADD")  //  ADD calculation
                {
                    ans = storeNum1 + storeNum2;  // sets ans = storeNum1 + storeNum2 added together
                    textBox1.Text = ans.ToString();

                }
            if (calcFunction == "Multiply")  // do multiply calculation
                {
                    ans = storeNum1 * storeNum2; // sets ans storeNum1 multi by storeNum2
                    textBox1.Text = ans.ToString();

                }
            if (calcFunction == "Divide")  // do devision calculation
                {
                    ans = storeNum1 / storeNum2; //sets ans = storeNum1 divided by storeNum2
                    textBox1.Text = ans.ToString();// converts ans to readable text

                }

        }
      
    }
}
