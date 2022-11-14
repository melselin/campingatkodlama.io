package bootCampHomeWorkWeek1;

public class SmallProjectPerfectNumbers {
	SmallProjectPerfectNumbers numbers = new SmallProjectPerfectNumbers();

	public static void isPerfectNum(int n) {
		int nTotal=0;
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				nTotal=i+nTotal;
				
			}
		}
		
		if(n == nTotal)
		{			System.out.println(n+" is a perfect number!");}
		else
			System.out.println(n+" is not a perfect number.");
	}
	

	}
