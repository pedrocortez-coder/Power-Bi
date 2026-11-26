using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.Data.SqlClient; // add manualmente
namespace BancodeDados01
{
    public partial class Form1 : Form
    {
        String conexao = @"Data Source = DESKTOP-OFD3LGK\SQLEXPRESS; initial Catalog = PROJETO ; Integrated Security = true";
        public Form1()
        {
            InitializeComponent();
        }

        private void dataGridView1_CellContentClick(object sender, DataGridViewCellEventArgs e)
        {

        }

        private void btnTestar_Click(object sender, EventArgs e)
        {
            try
            {
                using (SqlConnection conn = new SqlConnection(conexao) ) 
                {
                    conn.Open();
                    MessageBox.Show("Conexão bem sucedida!");
                }
            }
            catch (SqlException ex)
            {
                MessageBox.Show("Erro ao acessar 80\n" + ex.Message);
            }
            catch(Exception ex)
            {
                MessageBox.Show("Erro genérico no APP\n" + ex.Message);
            }
        }

        private void btnCarregar_Click(object sender, EventArgs e)
        {
            try
            {
                using (SqlConnection conn = new SqlConnection(conexao))
                {
                    string sql = "SELECT IDCLIENTE, NOME, CPF FROM CLIENTES order by nome";
                        SqlDataAdapter ada = new SqlDataAdapter(sql, conn);
                    DataTable dt = new DataTable();
                    ada.Fill(dt);
                    dgvClientes.DataSource = dt;
                }
            }
            catch(Exception ex)
            {
                MessageBox.Show("Erro:\n" + ex.Message);
            }
        }
    }
}
