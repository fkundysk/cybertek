package Assignmet_13;

public class Question_73 {

	public static void main(String[] args) {
		
		
		String [][] money = {{"drachma" , "11.0"}, {"sek", "5.0"}};
		String [][] convertionRate = {{"drachma", "0.6"}, {"sek", "100"}};
		
		String [][] money1 = {{"yen" , "5.0"}, {"frank", "5.0"}};
		String [][] convertionRate1 = {{"yen", "1"}, {"frank", "1"}};
		
		System.out.println("result : " + convertC(money, convertionRate));
		System.out.println("result : " + convertC(money1, convertionRate1));

	}

	public static double convertC(String[][] money, String[][] convertionRate) {
		
		double result =0;
		
		for (int i=0; i<money.length; i++) {
			for (int j=0; j<convertionRate.length; j++) {
				
				if (money[i][0].contentEquals(convertionRate[j][0]) ) {
					
					result = result + ((Double.parseDouble(money[i][1])) * (Double.parseDouble(convertionRate[i][1])));
					
				}
				
				
			}
			
			
		}
	
		return result;
	}

}
