package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		
		Product product = new Product();
		product.setName("leptop");
		product.setId(0);
		product.setDescription("ana leptop");
		
		ProductManager productManager= new ProductManager();
		productManager.Add(product);
		
	}

}
