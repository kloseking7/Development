using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace HelloWorld
{
    class Customer
    {
        private Int32 _CustomerID;
        private string _CustomerName;
        private DateTime _BirthDate;

        public Int32 CustomerID
        {
            get { return _CustomerID; }
            set { _CustomerID = value; }
        }

        public string CustomerName
        {
            get { return _CustomerName;}
            set { _CustomerName = value;}
        }

        public DateTime BirthDate
        {
            get { return _BirthDate; }
            set { _BirthDate = value; }
        }
    }
}
