package bootCampHomeWorkWeek1;

public class RecapDemo1 {
	RecapDemo1 enBuyuk = new RecapDemo1();
	static int sayi1 = 26;
	static int sayi2 = 24;
	static int sayi3 = 2;

	public static void enBuyukSayiBul() {
		int enBuyuk = sayi1;
		if (sayi2 > sayi1) {
			enBuyuk = sayi2;
		}
		if (sayi3 > sayi1) {
			enBuyuk = sayi3;
		}
		System.out.println("En büyük sayı =" + enBuyuk);
	}

}
