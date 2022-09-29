package stringsDemo;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Bugün Hava Çok Güzel";
		System.out.println(mesaj);

		System.out.println(mesaj.length()); // Bu kod bize eleman sayısını verecektir.
		System.out.println(mesaj.charAt(4)); // 5. elemanı çağırtmak demektir.
		System.out.println(mesaj.concat(" Yaşasın!")); // Mesajı değiştirmeden metin ekleme işlemidir.
		System.out.println(mesaj.startsWith("B")); // B ile başlıyor mu dedik. Doğru ise true çıkar.
		System.out.println(mesaj.endsWith(".")); // Sonu . ile bitiyorsa true yoksa false çıkarır.
		System.out.println(mesaj.indexOf('a')); // a kaçıncı indexde olduğunu gösterir.
		System.out.println(mesaj.lastIndexOf('a')); // Aramaya en sağdakine göre soldan başlayarak saymaya başlar.

		String yenimesaj = mesaj.replace('a', 'b');
		System.out.println(mesaj.replace(' ', '-')); // Boşuklara - yazdırdık.
		System.out.println(mesaj.substring(2)); // 2. indexten sonrasını yazdı
		System.out.println(mesaj.substring(2, 4)); // 2 ile 4. değerler arasını yazdı

		for (String kelime : mesaj.split(" ")) { // Mesajın cümlelerini dizi gibi gördük her boşluk karekterinden sonra
													// aşağı in komutu verdik,for ile.
			System.out.println(kelime);
		}
		System.out.println(mesaj.toLowerCase()); // Tüm kelimeleri küçük olarak çıktı verdi
		System.out.println(mesaj.toUpperCase()); // Tüm kelimeleri Büyük harf şeklinde çıktı verdi
		System.out.println(mesaj.trim()); // Başında sonunda boşluklar olabilir. Bu fonksiyon ile o boşluklardan
											// kurtuluyorsun.

	}

}
