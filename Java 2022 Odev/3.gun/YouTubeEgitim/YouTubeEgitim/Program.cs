using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace YouTubeEgitim
{
    internal class Program
    {
        static void Main(string[] args)
        {
            //    CreditManager creditManager = new CreditManager();//Instance creation
            //    creditManager.Calculate();
            //    creditManager.Calculate();
            //    creditManager.Save();

            //    Customer customer = new Customer();
            //    customer.City = "Hatay";

            //    Person person = new Person();
            //    person.NationalIdentity = "15468";

            //    CustomerManager customerManager = new CustomerManager(person);
            //    customerManager.Save();
            //    customerManager.Delete();

            //    Company company = new Company();
            //    company.TaxNumber = "13216548978/7";
            //    company.CompanyName = "Arcelik";
            //    company.ID = 100;

            //    CustomerManager customerManager2 = new CustomerManager(new Person());

            CustomerManager customerManager = new CustomerManager(new Customer(), new TeacherCreditManager());
            customerManager.GiveCredit();

            


            Console.ReadLine();
        }
    }

    class CreditManager
    {
        public void Calculate()
        {
            Console.WriteLine("Hesaplandi");
        }

        public void Save()
        {
            Console.WriteLine("Kredi verildi");
        }
    }

    interface ICreditManager
    {
        void Calculate();
        void Save();
    }

    abstract class BaseCreditManager : ICreditManager
    {
        public abstract void Calculate();

        public void Save()
        {
            Console.WriteLine("Kaydedildi");
        }
    }


    class TeacherCreditManager : BaseCreditManager, ICreditManager
    {
        public override void Calculate()
        {
            Console.WriteLine("Ogretmen kredisi Hesaplandi");
        }
    }

    class MilitaryCreditManager : BaseCreditManager, ICreditManager
    {  
        public override void Calculate()
        {
            Console.WriteLine("Asker kredisi Hesaplandi");
        }
    }

    //SOLID

    class Customer
    {
        public Customer()
        {
            Console.WriteLine("Musteri nesnesi baslatildi");
        }
        public int ID { get; set; }
        public string City{ get; set; }
    }

    class Person : Customer
    {
        public string FirstNAme { get; set; }
        public string LastName { get; set; }
        public string NationalIdentity { get; set; }
    }

    class Company : Customer
    {
        public string CompanyName { get; set; }
        public string TaxNumber { get; set; }
    }

    //KatmanlıMimari

    class CustomerManager
    {
        private Customer _customer;
        private ICreditManager _creditManager;
        public CustomerManager(Customer customer, ICreditManager creditManager)
        {
            _customer = customer;
            _creditManager = creditManager;
        }
        public void Save()
        {
            Console.WriteLine("Müşteri Kaydedildi:");
        }

        public void Delete()
        {
            Console.WriteLine("Müşteri Silindi: ");
        }

        public void GiveCredit() 
        {
            _creditManager.Calculate();
            Console.WriteLine("Kredi verildi");
        }
    }
}
