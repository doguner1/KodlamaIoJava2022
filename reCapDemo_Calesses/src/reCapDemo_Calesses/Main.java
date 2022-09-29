package reCapDemo_Calesses;

public class Main {

	public static void main(String[] args) {

		DortIslem dortIslem = new DortIslem();
		int Tsonuc = dortIslem.Topla(3, 5);
		int Csonuc = dortIslem.Cıkart(5, 6);

		dortIslem.yazdır(Tsonuc);

	}

}
