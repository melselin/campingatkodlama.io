package bootCampHomeWorkWeek1;

public class Conditionals {
	Conditionals şartblokları = new Conditionals();

	public static void conditional(int sayı) {
		if (sayı < 20) {
			System.out.println("Sayı 20'den küçüktür.");
		} else if (sayı > 20) {
			System.out.println("Sayı 20'den büyüktür.");
		} else if (sayı == 20) {
			System.out.println("Sayı 20'ye eşittir.");
		} else
			System.out.println("Hatalı değer girdiniz.");
	}
}
