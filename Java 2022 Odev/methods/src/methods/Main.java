package methods;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sayiBulmaca();
	}
	
	public static void sayiBulmaca() {
		int[] sayilar=new int[] {1,2,3,4,5,8};
		int aranacak=5;
		boolean varMi=false;
		
		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				varMi = true;
				break;
			}
		}
		
		if (varMi) {
			mesajVer("sayi mevcuttur");
		} else {
			System.out.println("sayi mevcut değildir.");
		}
	}
	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}

}
