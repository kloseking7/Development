using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;
using DataAccess;
using MySql.Data.MySqlClient;



namespace HelloWorld
{
    public partial class HelloWorld : Form
    {
        public HelloWorld()
        {
            InitializeComponent();
        }

        private void btnRun_Click(object sender, EventArgs e)
        {
            if (txtSql.Text != "")
            {
                ExecuteSqlStatement();
            }
            else
            {
                MessageBox.Show("Please enter an sql statement to execute");
            }
        }

        private string GetConnectionString()
        {
            string ConnectionString;

            if (System.Configuration.ConfigurationManager.ConnectionStrings["sample"] != null)
            {
                ConnectionString = System.Configuration.ConfigurationManager.ConnectionStrings["sample"].ConnectionString;
            }
            else
            {
                throw new Exception("connection string not defined");
            }

            return ConnectionString;
        }

        private void ExecuteSqlStatement()
        {
            DataAccess.DataAccess DataAccess = new DataAccess.DataAccess();
            string ConnectionString = GetConnectionString();
            MySqlConnection conn = null;
            MySqlDataReader reader = null;
            List<Customer> CustomerList = new List<Customer>();
            Customer customer;


            try
            {
                conn = new MySqlConnection(ConnectionString);
                conn.Open();
                reader = DataAccess.GetReader(conn, txtSql.Text);
                while (reader.Read())
                {
                    customer = new Customer();
                    customer.CustomerID = Int32.Parse(reader.GetValue(0).ToString());
                    customer.CustomerName = reader.GetValue(1).ToString();
                    customer.BirthDate = Convert.ToDateTime(reader.GetValue(2).ToString());

                    CustomerList.Add(customer);
                }

                dgvResults.DataSource = CustomerList;
            }
            catch (Exception ex)
            {
                lblStatus.Text = ex.Message; 
            }
            finally
            {
                DataAccess.CloseConnection(conn);
            }
        }
    }
}
