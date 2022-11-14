package bootCampHomeWorkWeek1;

public class StringsDemo {

	public void chara() {
		String mesaj = "Bugün hava çok güzel.";
		System.out.println("Karakter sayısı:" + mesaj.length());
		System.out.println("5.eleman:" + mesaj.charAt(4));
		System.out.println(mesaj.concat(" Yaşasın."));
		System.out.println(mesaj.startsWith("B"));
		System.out.println(mesaj.startsWith("A"));
		System.out.println(mesaj.endsWith(".")); // Bu kullanımlarda case sensitivity'e dikkat et.

		char[] karakterler = new char[5];
		mesaj.getChars(0, 5, karakterler, 0);
		System.out.println(karakterler);
		System.out.println(mesaj.indexOf("av")); // İlk bulduğu harfi verince operasyonu bitiriyor! Ayrıca tek karakter
													// aratırken ""/'' kullanımı farketmez.
		System.out.println(mesaj.lastIndexOf('a')); // Last'da sondan başlayarak istenen karakteri arar ama sayımı
													// baştan yapar
		System.out.println(mesaj.lastIndexOf('e'));
		System.out.println("-----------------------------------------------------------------------------------");
		String yeniMesaj = mesaj.replace(' ', '-');
		System.out.println(yeniMesaj);
		System.out.println(mesaj.substring(6));   //6.karakterden itibaren son karaktere kadar kısmı alır.
		System.out.println(mesaj.substring(2,5)); //2. karakterden 5.karaktere kadar, 5. karakter dahil değil.
		
		
		for(String kelime: mesaj.split(" ")) {
			System.out.println(kelime);
		}
		
		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());
		System.out.println(mesaj.trim()); //baştaki ve sondaki boşlukları siler, kaynak uyuşmazlığının önüne geçmek için işlevse.
	}

}
