package bootCampHomeWorkWeek1;

public class Main {

	public static void main(String[] args) {
		System.out.println("Kodlama.io Bootcamp'in ilk haftası için hazırladığım ödev dizinine hoş geldiniz");
		System.out.println(
				"Her ders başına yeni proje açmaktan ziyade her ders için bir class objesi hazırlayıp onları methodlarla çağırmayı tercih ettim ki ödevim daha derli toplu olsun.");
		System.out.println("Aşağıda derste yapılan uygulamaların çıktıları dizilecektir:");
		System.out.println("*****************Hello_World********************************************");
		HelloWorldPrinter.helloWorldYazdır();
		System.out.println("*****************Data_Tipleri*******************************************");
		DataTypes.dataTipleriniYazdir();
		System.out.println("*****************Öğrenci_Sayısı_Bulma***********************************");
		Variables.ogrenciSayisiBul();
		System.out.println("*****************Şart_Blokları******************************************");
		Conditionals.conditional(20);
		System.out.println("*****************En_Büyük_Sayı_Bul**************************************");
		RecapDemo1.enBuyukSayiBul();
		System.out.println("*****************Not_Sistemi********************************************");
		SwitchDemo.notSistemi();
		System.out.println("*****************Döngüler_For_Loop**************************************");
		Loop.forLoop(2);
		System.out.println("****************Döngüler_While_Loop*************************************");
		Loop.whileLoop(1);
		System.out.println("****************Döngüler_Do_While_Loop**********************************");
		Loop.doWhileLoop(100);
		System.out.println("****************Array_Demo**********************************************");
		Arrays.arrayDemos();
		System.out.println("****************Multi_Dimensional_Array_Demo****************************");
		MultiDimentionalArrays.multiDimentionYazdir();
		System.out.println("****************Strings_Demo********************************************");
		StringsDemo.chara();
		System.out.println("****************Asal_Sayı_Hesaplama*************************************");
		SmallProjectPrimalNumber.isPrimeNumber(61);
		System.out.println("****************Sesli_Harf_Bulma****************************************");
		SmallProject2findvowels.isVowel('A');
		System.out.println("****************Mükemmel_Sayı_Hesaplama*********************************");
		SmallProjectPerfectNumbers.isPerfectNum(28);
		System.out.println("****************Arkadaş_Sayıları_Bulma**********************************");
		SmallProjectAmicableNumbers.areAmicableNumbers(220,284);
		System.out.println("****************Sayı_Bulma**********************************************");
		SmallProjectFindNumber.findNum(13);
		System.out.println("Detaylı inceleme için ilgili class dosyalarına bakabilirsiniz.");
	}

}
