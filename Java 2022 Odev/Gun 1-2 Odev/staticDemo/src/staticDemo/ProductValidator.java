package staticDemo;

public class ProductValidator {
	public static boolean isValid(Product product) {
		if (product.price > 0 && product.name != null) {
			return true;
		}else {
			return false;
		}
	}
}
