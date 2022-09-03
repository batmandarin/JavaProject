using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace WinFormsApp12
{
    public partial class Form1 : Form
    {
        private readonly object txtABefore;
        private readonly object txtBBefore;
        private object txtAAfter;
        private object txtBAfter;

        public Form1()
        {
            InitializeComponent();
        }

        private void btnSwap_Click(object sender, EventArgs e)
        {
            //입력값 추출
            int a = int.Parse(txtABefore.Text);
            int b = int.Parse(txtBBefore.Text);
            NewMethod(ref a, ref b);

        }

        private void NewMethod(ref int a, ref int b)
        {
            NewMethod1(ref a, ref b);
        }

        private void NewMethod1(ref int a, ref int b)
        {
            //메서드 호출 (Call By Value)
            btnSwap_Click(ref a, ref b);
            //교환 후 a와 b의 값 출력
            NewMethod2(a);
            NewMethod3(b);

            void NewMethod2(int a)
            {
                txtAAfter.Text = a.ToString();
            }

            void NewMethod3(int b)
            {
                txtBAfter.Text = b.ToString();
            }
        }
    }
}
