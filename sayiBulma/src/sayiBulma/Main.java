package sayiBulma;

public class Main {

	public static void main(String[] args) {
		int[] sayilar = { 1, 2, 5, 7, 9, 0 };
		int aranacak1 = 1;
		boolean bulundu = true;

		for (int sayi : sayilar) {
			if (aranacak1 == sayi) {
				break;
			} else {
				bulundu = false;
			}

		}

		if (bulundu) {
			System.out.println("Sayı bulundu " + aranacak1);
		} else {
			System.out.println("Sayı bulunamadı " + aranacak1);
		}

	}

}
