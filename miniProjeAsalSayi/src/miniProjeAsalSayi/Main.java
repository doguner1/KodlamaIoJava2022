package miniProjeAsalSayi;

public class Main {

	public static void main(String[] args) {
		int number = 1;
		String mesaj1 = "Asal asyıdır";
		String mesaj2 = "Asal sayı değildir";

		if (number < 2) {
			System.out.println("Geçersiz Sayı");
			return;
		}
		for (int i = 2; i < number; i++) {
			int test = number % i;
			if (test == 0) {
				System.out.println(mesaj2);
				return;
			} else {
				System.out.println(mesaj1);
				return;
			}

		}

		// ---------- Hocanın yaptığıı -------------
		int sayi = 25;
		int remainder = sayi % 2;
		boolean isPrime = true;

		for (int i = 2; i < number; i++) {
			if (sayi % i == 0) {
				isPrime = false;
			}
		}

		if (isPrime) {
			System.out.println("Sayı asaldır");
		} else {
			System.out.println("Sayı asal değildir");
		}

	}

}
