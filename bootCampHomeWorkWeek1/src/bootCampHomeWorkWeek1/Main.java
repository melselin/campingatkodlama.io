package bootCampHomeWorkWeek1;

public class Main {

	public static void main(String[] args) {
		System.out.println("Kodlama.io Bootcamp'in ilk haftası için hazırladığım ödev dizinine hoş geldiniz");
		System.out.println(
				"Her ders başına yeni proje açmaktan ziyade her ders için bir class objesi hazırlayıp onları methodlarla çağırmayı tercih ettim ki ödevim daha derli toplu olsun.");
		System.out.println("Aşağıda derste yapılan uygulamaların çıktıları dizilecektir:");
		System.out.println("*****************Hello_World********************************************");
		HelloWorldPrinter printer = new HelloWorldPrinter();
		printer.print();
		System.out.println("*****************Data_Tipleri*******************************************");
		DataTypes datacesitleri = new DataTypes();
		datacesitleri.dataTipleriniYazdir();
		System.out.println("*****************Öğrenci_Sayısı_Bulma***********************************");
		Variables degiskenler = new Variables();
		degiskenler.ogrenciSayisiBul();
		System.out.println("*****************Şart_Blokları******************************************");
		Conditionals şartblokları = new Conditionals();
		şartblokları.conditional(20);
		System.out.println("*****************En_Büyük_Sayı_Bul**************************************");
		RecapDemo1 enBuyuk = new RecapDemo1();
		enBuyuk.enBuyukSayiBul();
		System.out.println("*****************Not_Sistemi********************************************");
		SwitchDemo switchCase = new SwitchDemo();
		switchCase.notSistemi();
		System.out.println("*****************Döngüler_For_Loop**************************************");
		Loop döngü = new Loop();
		döngü.forLoop(2);
		System.out.println("****************Döngüler_While_Loop*************************************");
		döngü.whileLoop(3);
		System.out.println("****************Döngüler_Do_While_Loop**********************************");
		döngü.doWhileLoop(100);
		System.out.println("****************Array_Demo**********************************************");
		Arrays diziler = new Arrays();
		diziler.arrayDemos();
		System.out.println("****************Multi_Dimensional_Array_Demo****************************");
		MultiDimentionalArrays çokBoyutluDiziler = new MultiDimentionalArrays();
		çokBoyutluDiziler.multiDimentionYazdir();
		System.out.println("****************Strings_Demo********************************************");
		StringsDemo string = new StringsDemo();
		string.chara();
		System.out.println("****************Asal_Sayı_Hesaplama*************************************");
		SmallProjectPrimalNumber asalSayi = new SmallProjectPrimalNumber();
		asalSayi.isPrimeNumber(61);
		System.out.println("****************Sesli_Harf_Bulma****************************************");
		SmallProject2findvowels vowels= new SmallProject2findvowels();
		vowels.isVowel('A');
		System.out.println("****************Mükemmel_Sayı_Hesaplama*********************************");
		SmallProjectPerfectNumbers numbers = new SmallProjectPerfectNumbers();
		numbers.isPerfectNum(28);
		System.out.println("****************Arkadaş_Sayıları_Bulma**********************************");
		SmallProjectAmicableNumbers num = new SmallProjectAmicableNumbers();
		num.areAmicableNumbers(220,284);
		System.out.println("****************Sayı_Bulma**********************************************");
		SmallProjectFindNumber number = new SmallProjectFindNumber();
		number.findNum(13);
		System.out.println("Detaylı inceleme için ilgili class dosyalarına bakabilirsiniz.");
	}

}
