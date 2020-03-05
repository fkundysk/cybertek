package Assignmet_13;

public class Question_79 {

	public static void main(String[] args) {
		
		short [] scores = {51, 85, 32, 0, 98, 157, 82, 101, 64, 249};
		
		int halfCent = 0;
		int cent = 0;
		int doubleCent = 0;

		for (short arr : scores) {
			
			if (arr>=50 && arr<100) {
				halfCent++;
				
			} else if (arr>=100 && arr<200) {
				cent++;
				
			} else if (arr>=200) {
				doubleCent++;
				
			}	

		} System.out.println("Half-Century : " + halfCent);
		System.out.println("Century : " + cent);
		System.out.println("Double-Century : " + doubleCent);

	}

}
