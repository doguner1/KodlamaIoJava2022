package arraysDemo;

public class Main {

	public static void main(String[] args) {
		String[] ogrenciler = new String[2];
		ogrenciler[0] = "Salih";
		ogrenciler[1] = "Ahmet";

		for (String ogrenci : ogrenciler) {
			System.out.println(ogrenci);
		}

		String name1 = "Ayşe";
		String name2 = "Fatma";

		String[] isimler = { name1, name2 };

		for (String name : isimler) {
			System.out.println(name);
		}
	}

}
