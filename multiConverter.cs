using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
//Colm Carey
// C00197157
// Multi converter Lab1 q 3/4 Then add a menu
namespace Lab1q3
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }
       
        private void Con_Btn_Click(object sender, EventArgs e)
        {
            if (Ent_Box1.Text != "")// if text box is not empty do following
            {
                int i = int.Parse(Ent_Box1.Text);
                // if for customer selects inches to feet
                if ((string)Inch_combo1.SelectedItem == "Inches" && (string)Feet_combo2.SelectedItem == "Feet")
                {
                    double con = i / 12.00; // does calc
                    Ans_Box1.Text = +con + " " + "Feet";  //display answer +the word  feet
                }
                // else if for customer selects feet to  inches
                else if ((string)Inch_combo1.SelectedItem == "Feet" && (string)Feet_combo2.SelectedItem == "Inches")
                {
                    double con = i * 12.00;
                    Ans_Box1.Text = +con + " " + "Inches";//display answer +  the word Inches

                }
               
            }
        }
        // CLEAR DISPLAY BTN FOR INCHES TO FEET
        private void Inch_ClrBtn_Click(object sender, EventArgs e)
        {
            Ans_Box1.Clear();// clear text box
            Ent_Box1.Clear();// clear the user entry
        }

        // POUND TO EURO CONVERSION PANEL   ////////////////
        private void Con_Btn2_Click(object sender, EventArgs e)
        {
            if (Pound_Box2.Text != "")// if text box is not empty do following
            {
                double y = Convert.ToDouble(Pound_Box2.Text);

                double change = y * 0.79; // conversion rate to calc
                Result_Box1.Text = " €" + (Convert.ToString(change)); // convert back to a string
            }
        }

        private void clear_Btn2_Click(object sender, EventArgs e)
        {// clear text from box's
            Result_Box1.Clear();
            Pound_Box2.Clear();
        }
        // PANEL  3  CONVERT CELS TO FAHRENHEIT //////////////////////////////////////

        private void Con_Btn3_Click(object sender, EventArgs e)
        {
            if (Cel_Box1.Text != "")// if text box is not empty do following
            {
                double cel = Convert.ToDouble(Cel_Box1.Text);
                Fah_Box1.Text = Convert.ToString(celToFah(cel));
            }
        }
        // method for calc
        public static double celToFah(double cel)
        {
            double ans = ((9.0 / 5.0) * cel) + 32; // does conversion
            return ans; // return the answer 
            
        }

        private void Clr_Btn3_Click(object sender, EventArgs e)
        {
            Fah_Box1.Clear();// clear text box
            Cel_Box1.Clear();// clear the user entry

        }

}
}
