package recapDemo2;

public class Main {

	public static void main(String[] args) {
		double[] myDouble = { 3.4, 5.3, 3.2, 3.3, 5.5, 6.6 };

		double total = 0;
		double max = myDouble[0];

		for (Double sayilar : myDouble) {
			System.out.println(sayilar);
			total += sayilar;

			if (max < sayilar) {
				max = sayilar;
			}
		}

		System.out.println("Total:" + total);
		System.out.println("max: " + max);

	}

}
