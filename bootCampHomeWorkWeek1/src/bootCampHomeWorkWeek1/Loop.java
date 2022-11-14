package bootCampHomeWorkWeek1;

public class Loop {
	Loop döngü = new Loop();
	int i;

	public static void forLoop(int i) {
		for (i = 2; i < 10; i += 2) {
			System.out.println(i);
		}
		System.out.println("For döngüsü bitti.");

	}

	public static void whileLoop(int i) {
		while (i < 10) {
			System.out.println(i);
			i++;
		}
		System.out.println("While döngüsü bitti.");

	}

	public static void doWhileLoop(int i) {
		do {
			System.out.println("Loglandı.");
			System.out.println(i);
			i += 2;
		} while (i < 10);
		System.out.println("Do while döngüsü bitti.");
// Do While'ın While döngüsünden tek farkı while şart uygun değilken asla döngüye girmez iken Do while'ın bir seferliğine döngüye girip durmaktadır.
//Günlük hayatta loglamayı göstermek gerektiğinde kullanabiliriz.
	}
}
