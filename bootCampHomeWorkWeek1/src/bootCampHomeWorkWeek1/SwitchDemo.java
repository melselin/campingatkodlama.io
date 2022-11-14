package bootCampHomeWorkWeek1;

public class SwitchDemo {
	SwitchDemo switchCase = new SwitchDemo();

	public static void notSistemi() {
		char grade = 'A';
		switch (grade) {
		case 'A':
			System.out.println("Mükemmel: Geçtiniz.");
			break;
		case 'B':
			System.out.println("Çok iyi: Geçtiniz.");
			break;
		case 'C':
			System.out.println("İyi: Geçtiniz.");
			break;
		case 'D':
			System.out.println("Fena değil: Geçtiniz.");
			break;
		case 'F':
			System.out.println("Başarısız: Kaldınız.");
			break;
		default:
			System.out.println("Geçersiz not girdiniz.");
		}
	}

}
