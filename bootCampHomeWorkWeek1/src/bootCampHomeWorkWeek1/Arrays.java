package bootCampHomeWorkWeek1;

public class Arrays {
	Arrays diziler = new Arrays();
	public static void arrayDemos() {


		String[] students = new String[4];
		students[0] = "Melisa";
		students[1] = "Ece";
		students[2] = "Kübra";
		students[3] = "Özlem";

		for (int index = 0; index < students.length; index++) {
			System.out.println(students[index]);
		}
		System.out.println("*******************************************************for each:");

		
		for (String student : students) {
			System.out.println(student);
		}

		System.out.println("*******************************************************double:");
		double[] myList = { 1, 2.3, 4, 5.3 };
		double total = 0;
		double max = myList[0];
		for (double number : myList) {
			if (max < number) {
				max = number;
			}
			total = total + number;
			System.out.println(number);
		}
		System.out.println("Toplam:" + total);
		System.out.println("En büyük:" + max);
	}

}
