package oop1;

public class Main {

	public static void main(String[] args) {
		Product product1 = new Product();
		product1.setName("Delongi Kahve Makinesi");
		product1.setDiscount(7);
		product1.setUnitPrice(56);
		product1.setImageUrl("image1.jpg");
		product1.setUnitsInStock(12);

		// get
		// System.out.println(product1.name);

		Product product2 = new Product();
		product2.setName("Samsung Kahve Makinesi");
		product2.setDiscount(12);
		product2.setUnitPrice(56);
		product2.setImageUrl("image1.jpg");
		product2.setUnitsInStock(12);

		Product product3 = new Product();
		product3.setName("Philips Kahve Makinesi");
		product3.setDiscount(9);
		product3.setUnitPrice(52);
		product3.setImageUrl("image3.jpg");
		product3.setUnitsInStock(12);

		Product[] products = { product1, product2, product3 };

		for (Product product : products) {
			System.out.println(product.getName() + " \n Stok:" + product.getDiscount());
		}

		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhoneNumber("024546546");
		individualCustomer.setCustomerNumber("215646");
		individualCustomer.setFirstName("Zafer");
		individualCustomer.setLastName("Avci");

		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setCompanyName("Kodlama.io");
		corporateCustomer.setPhoneNumber("05645879");
		corporateCustomer.setTaxNumber("12345678958");
		corporateCustomer.setCustomerNumber("1234");

		Customer[] customers = { individualCustomer, corporateCustomer };
		

	}

}
