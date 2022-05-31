using DataAccess.Abstract;
using Entities.Concrete;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Linq.Expressions;
using System.Text;
using System.Threading.Tasks;

namespace DataAccess.Concrete.InMemory
{
    public class InMemoryCarDal : ICarDal
    {
        List<Car> _cars;

        public InMemoryCarDal()
        {
            _cars = new List<Car>
            {
                new Car
                {
                    Id=1,BrandId=1,ColorId=1,DailyPrice=120000,ModelYear="2002",Description="Sıfır Gibidir "
                },
                 new Car
                {
                    Id=2,BrandId=1,ColorId=3,DailyPrice=20300,ModelYear="2005",Description="Aslı Gibidir "
                },
                  new Car
                {
                    Id=3,BrandId=1,ColorId=5,DailyPrice=50600,ModelYear="2002",Description="Sıfırıdır "
                },
                   new Car
                {
                    Id=4,BrandId=1,ColorId=8,DailyPrice=580600,ModelYear="2003",Description="3 Parça Değişeni Vardir "
                },
                    new Car
                {
                    Id=5,BrandId=1,ColorId=3,DailyPrice=569863,ModelYear="2002",Description="Komple Boyalıdır "
                }
            };
        }
        public void Add(Car car)
        {
            _cars.Add(car);    
        }

        public void Delete(Car car)
        {
            Car carTodelete = _cars.SingleOrDefault(c => c.Id == car.Id);
            _cars.Remove(carTodelete);
        }

        public Car Get(Expression<Func<Car, bool>> filter = null)
        {
            throw new NotImplementedException();
        }

        public List<Car> GetAll()
        {
            return _cars;
        }

        public Car GetCarsByBrandId(Expression<Func<Car, bool>> filter = null)
        {
            throw new NotImplementedException();
        }

        public Car GetCarsByColorId(Expression<Func<Car, bool>> filter = null)
        {
            throw new NotImplementedException();
        }

        public void Update(Car car)
        {
            Car carToUpdate = _cars.SingleOrDefault(c => c.Id == car.Id);
            carToUpdate.Id = car.Id;
            carToUpdate.ModelYear = car.ModelYear;
            carToUpdate.Description = car.Description;
            carToUpdate.DailyPrice = car.DailyPrice;
            carToUpdate.ColorId = car.ColorId;
            carToUpdate.BrandId = car.BrandId;

        }
    }
}
