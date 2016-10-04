using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
// C00197157
// Colm Carey
// Lab1q2 build currency converter
namespace Lab1q2
{
    public partial class Form1 : Form
    { 

        public Form1()
        {
            InitializeComponent();
        }
        // ACTION FOR CONVERT BTN
        private void Convert_btn_Click(object sender, EventArgs e)
        {
            int i = int.Parse(Amount_textBox1.Text);
            // IF'S TO DO EURO CONVERSIONS
             if ((string)From_comboBox1.SelectedItem == "Euro" && (string)To_comboBox2.SelectedItem == "Sterling")
                {
                    double conver = i * 0.86; // set the conversion rate
                    Con_textBox1.Text = "Total Conversion" +" "+ " £" + conver ;

                 }
            if ((string)From_comboBox1.SelectedItem == "Euro" && (string)To_comboBox2.SelectedItem == "US Dollar")
                 {
                    double conver = i * 1.12;// set the conversion rate
                    Con_textBox1.Text = "Total Conversion" + " " + "$" + conver ;
                }
            if ((string)From_comboBox1.SelectedItem == "Euro" && (string)To_comboBox2.SelectedItem == "Canadian Dollar")
                 {
                    double conver = i * 1.48;// set the conversion rate
                    Con_textBox1.Text = "Total Conversion" + " " + "$" + conver;
                 }
            if ((string)From_comboBox1.SelectedItem == "Euro" && (string)To_comboBox2.SelectedItem == "Euro")
                {
                    double conver = i * 1.00;// set the conversion rate
                    Con_textBox1.Text = "Total Conversion" + " " + "€" + conver;
                 }
            // IF'S TO DO STERLING CONVERSIONS ////////////////////////////////////////////
            if ((string)From_comboBox1.SelectedItem == "Sterling" && (string)To_comboBox2.SelectedItem == "Euro")
                {
                    double conver = i * 1.17; // set the conversion rate
                    Con_textBox1.Text = "Total Conversion" + " €" + "euro " + conver;

                 }
            if ((string)From_comboBox1.SelectedItem == "Sterling" && (string)To_comboBox2.SelectedItem == "US Dollar")
                {
                    double conver = i * 1.30;// set the conversion rate
                    Con_textBox1.Text = "Total Conversion" + " " + "$" + conver;
                }
            if ((string)From_comboBox1.SelectedItem == "Sterling" && (string)To_comboBox2.SelectedItem == "Canadian Dollar")
                {
                    double conver = i * 1.72;// set the conversion rate
                    Con_textBox1.Text = "Total Conversion" + " " + "$" + conver;
                }
            if ((string)From_comboBox1.SelectedItem == "Sterling" && (string)To_comboBox2.SelectedItem == "Sterling")
               {
                    double conver = i * 1.00;// set the conversion rate
                    Con_textBox1.Text = "Total Conversion" + " " + "£" + conver;
               }
            // IF'S TO DO US Dollar CONVERSIONS ////////////////////////////////////////////
            if ((string)From_comboBox1.SelectedItem == "US Dollar" && (string)To_comboBox2.SelectedItem == "Euro")
            {
                double conver = i * .90; // set the conversion rate
                Con_textBox1.Text = "Total Conversion" + " €" + "euro " + conver;

            }
            if ((string)From_comboBox1.SelectedItem == "US Dollar" && (string)To_comboBox2.SelectedItem == "Sterling")
            {
                double conver = i * .77;// set the conversion rate
                Con_textBox1.Text = "Total Conversion" + " " + "£" + conver;
            }
            if ((string)From_comboBox1.SelectedItem == "US Dollar" && (string)To_comboBox2.SelectedItem == "US Dollar")
            {
                double conver = i * 1.00;// set the conversion rate
                Con_textBox1.Text = "Total Conversion" + " " + "$" + conver;
            }
            if ((string)From_comboBox1.SelectedItem == "US Dollar" && (string)To_comboBox2.SelectedItem == "Canadian Dollar")
            {
                double conver = i * 1.32;// set the conversion rate
                Con_textBox1.Text = "Total Conversion" + " " + "$" + conver;
            }
            // IF'S TO DO canadian Dollar CONVERSIONS ////////////////////////////////////////////
            if ((string)From_comboBox1.SelectedItem == "Canadian Dolla" && (string)To_comboBox2.SelectedItem == "Euro")
            {
                double conver = i * .68; // set the conversion rate
                Con_textBox1.Text = "Total Conversion" + " €" + "euro " + conver;

            }
            if ((string)From_comboBox1.SelectedItem == "Canadian Dollar" && (string)To_comboBox2.SelectedItem == "Sterling")
            {
                double conver = i * .58;// set the conversion rate
                Con_textBox1.Text = "Total Conversion" + " " + "£" + conver;
            }
            if ((string)From_comboBox1.SelectedItem == "Canadian Dollar" && (string)To_comboBox2.SelectedItem == "US Dollar")
            {
                double conver = i * .76;// set the conversion rate
                Con_textBox1.Text = "Total Conversion" + " " + "$" + conver;
            }
            if ((string)From_comboBox1.SelectedItem == "Canadian Dolla" && (string)To_comboBox2.SelectedItem == "Canadian Dollar")
            {
                double conver = i * 1.00;// set the conversion rate
                Con_textBox1.Text = "Total Conversion" + " " + "$" + conver;
            }
        }
                // ACTIONS FOR CLEAR BTN
       private void clear_Btn_Click(object sender, EventArgs e)
          {
                    Con_textBox1.Clear(); // clear the conversion total from the con_textbox
                    Amount_textBox1.Clear();// clear the amount entered for conversion from Amount_text box
          }
    }
}
