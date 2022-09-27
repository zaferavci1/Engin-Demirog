package methods2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mesaj = "Bugun hava cok guzel";
		int sayi=topla(8, 5);
		System.out.println(sayi);
		//veriable
		int toplam=topla2(2,3,4,5,6,7,8,9);
		System.out.println(toplam);
	}

	public static void ekle() {

	}

	public static void sil() {

	}

	public static void guncelle() {

	}

	public static int topla(int sayi1,int sayi2) {
		return sayi1+sayi2;
	}
	
	public static int topla2(int... sayilar) {
		//veriable
		int toplam=0;
		for(int sayi:sayilar) {
			toplam+=sayi;
		}
		return toplam;
	}
	
	public static String sehirVer() { 
		return "Hatay";
	}
	
	
	
	
	
	
	
	
}
