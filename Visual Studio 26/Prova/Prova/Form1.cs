using System;

using System.Collections.Generic;

using System.ComponentModel;

using System.Data;

using System.Drawing;

using System.Linq;

using System.Text;

using System.Threading.Tasks;

using System.Windows.Forms;
using static System.Windows.Forms.VisualStyles.VisualStyleElement;


namespace Prova

{

    public partial class Form1 : Form

    {

        public Form1()

        {

            InitializeComponent();

        }


        private void btn1_Click(object sender, EventArgs e)

        {

            try

            {

                double num1 = Convert.ToDouble(textBox1.Text);

                double num2 = Convert.ToDouble(textBox2.Text);

                double resultado = 0;


                if (rbt1.Checked)

                {

                    resultado = num1 + num2;

                }

                else if (rbt2.Checked)

                {

                    resultado = num1 - num2;

                }

                else

                {

                    MessageBox.Show("Selecione uma operação!");

                    return;

                }


                textBox3.Text = resultado.ToString();

            }

            catch

            {

                MessageBox.Show("Digite valores numéricos válidos!");

            }

        }


        private void cb1_Click(object sender, EventArgs e)

        {

            if (cb1.Checked)

            {

                textBox3.BackColor = Color.Yellow;

            }

            else

            {

                textBox3.BackColor = Color.White;

            }

        }


        private void cb2_Click(object sender, EventArgs e)

        {

            if (cb2.Checked)

            {

                textBox3.Font = new Font(textBox3.Font, FontStyle.Bold);

            }

            else

            {

                textBox3.Font = new Font(textBox3.Font, FontStyle.Regular);

            }

        }

        private void radioButton11_CheckedChanged(object sender, EventArgs e)
        {

        }

        private void checkBox10_CheckedChanged(object sender, EventArgs e)
        {

        }

        private void textBox16_TextChanged(object sender, EventArgs e)
        {

        }
    }

}