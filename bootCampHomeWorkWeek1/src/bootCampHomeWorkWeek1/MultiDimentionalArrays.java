package bootCampHomeWorkWeek1;

public class MultiDimentionalArrays {

	public void multiDimentionYazdir() {
		String[][] cities = new String[3][3];
		
		cities[0][0]= "İstanbul";
		cities[0][1]= "Bursa";
		cities[0][2]= "Bilecik";
		cities[1][0]= "Ankara";
		cities[1][1]= "Konya";
		cities[1][2]= "Kayseri";
		cities[2][0]= "Diyarbakır";
		cities[2][1]= "Şanlı Urfa";
		cities[2][2]= "Gazianntep";
		
		
		
		for(int i = 0; i<=2;i++) {
			System.out.println("----------------");
			for(int j=0; j<=2;j++) {
				System.out.println(cities[i][j]);
			}
		}
		
		
		
		
		
		
	}

	
	
	
}
