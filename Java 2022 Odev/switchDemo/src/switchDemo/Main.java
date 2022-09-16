package switchDemo;

public class Main {

	public static void main(String[] args) {
		char karakter = 'B';
		
			switch(karakter) {
				case 'A':
					System.out.println("Mükemmel : Gectiniz");
					break;
				case 'B':
					System.out.println("Cok iyi : Gectiniz");
					break;
				case 'C':
					System.out.println("İyi : Gectiniz");
					break;
				case 'D':
					System.out.println("Fena değil : Gectiniz");
					break;
				case 'F':
					System.out.println("Maalesef : Kaldınız");
					break;
				default:
					System.out.println("Geçersiz!");
			}
	}

}
