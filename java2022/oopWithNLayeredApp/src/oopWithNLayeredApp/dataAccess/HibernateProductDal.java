package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class HibernateProductDal implements ProductDao {
	// sadece ve sadece db erişim kodları buraya yazılır... SQL
	public void add(Product product) {
		System.out.println(product.getName() + " HiberNate ile veritabanina eklendi");
	}
}
