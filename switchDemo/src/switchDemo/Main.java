package switchDemo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char note = 'A';

		switch (note) {
		case 'A':
			System.out.println("Geçitn, Mükemmel");
			break;
		case 'B':
		case 'C':
			System.out.println("Geçtin , iyi");
			break;
		default:
			System.out.println("Kaldın");

		}
	}

}
