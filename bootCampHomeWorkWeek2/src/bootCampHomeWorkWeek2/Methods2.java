package bootCampHomeWorkWeek2;

public class Methods2 {

	int num = add(2, 3);
	int number = addMultiple(2, 3, 4, 5, 6, 7, 8, 4, 3);
	String city = pullCity();

	public int add(int i, int j) {
		return i + j;

	}

	public int add(int i, int j, int h) { // overloading: the signature parameters are different with the previous one
											// even tho reference name is same, so it works.
		return i + j;

	}

	public int addMultiple(int... numbers) {
		int sum = 0;
		for (int number : numbers) {
			sum += number;
		}
		return sum;

	}

	public void update() {
		System.out.println("Güncellendi.");
	}

	public String pullCity() {
		return "Ankara";
	}
}
