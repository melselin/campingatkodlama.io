package bootCampHomeWorkWeek1;

public class SmallProjectAmicableNumbers {
	public void areAmicableNumbers(int a, int b) {

		int aSum=0;
		int bSum=0;
		for (int i=1;i<a;i++) {
			if(a%i==0) {
				aSum= i+ aSum;
			}
		}
		for (int i=1;i<b;i++) {
			if(b%i==0) {
				bSum= i+ bSum;
			}
		}
		if(a == bSum && b==aSum) {
			System.out.println(a+" and "+b+" are amicable numbers.");
		}else
				System.out.println(a+" and "+b+" are not amicable numbers.");

	}

}
