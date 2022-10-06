package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class JdbcProductDao implements ProductDao {
	// sadece ve sadece db erişim kodları buraya yazilir... SQL
	public void add(Product product) {
		System.out.println(product.getName() + " JDBC ile veritabanina eklendi");
	}
}
