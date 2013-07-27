using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace WebApplication1
{
    public class Custom
    {
        public List<Item> Data { get; set; }
        public int Total { get; set; }
    }


    public class Item
    {
        public int ID { get; set; }
        public string cusName { get; set; }
    }
}