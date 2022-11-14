package bootCampHomeWorkWeek1;

public class SmallProjectPrimalNumber {

	public void isPrimeNumber(int number) {
		if(number>1) {
			if (number==2|number==3|number==5|number==7|number==11) {
				System.out.println(number + " is a prime number.");
			}else if(number % 1 == 0 & number % number == 0) {
		
			if(number%2==0 | number%3==0 | number%5==0 |number%7==0 | number%11==0) {
				System.out.println(number + " is not a prime number.");
			} else
				System.out.println(number + " is a prime number.");

		}else
		System.out.println(number+ " is not a prime number.");

	}
	}
}
