package methotOverloading;

public class DortIslem {
	public int topla(int sayi1, int sayi2) {
		return sayi1 + sayi2;
	}

	public int topla(int sayi1, int sayi2, int sayi3) {
		return sayi1 + sayi2 + sayi3;
	}
}

//Methot isimleri aynı fakat paremetleri farklı olarak yazdığımız da override etmiş oluyoruz