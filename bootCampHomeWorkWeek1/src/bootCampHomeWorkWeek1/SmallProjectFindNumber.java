package bootCampHomeWorkWeek1;

public class SmallProjectFindNumber {
	SmallProjectFindNumber num = new SmallProjectFindNumber();

	public static void findNum(int a) {
		int[]numbers = {1,2,5,7,9,0};
		boolean isThere= false;
		for(int searched:numbers) {
			if (a == searched) {
				isThere=true;
				System.out.println("The number "+a+" has been found in the array list.");
				break;
			}else
				isThere=false;
		}
		if(isThere==false) {
				System.out.println("The number "+a+" has NOT been found in the array list.");
		}
	}

}
