package Assignment_11;

public class Question_44 {

	public static void main(String[] args) {
		
		double [] temps = {80, 88, 88, 84, 82, 78, 60, 68};
		
		averageTemp(temps);
	}

	public static void averageTemp(double[] temps) {
		
		double sum=0;
		
		for (double listTemp : temps) {
			
			sum = sum+listTemp;
			
		}
		System.out.println("Average of temps: " + sum/temps.length);
	}

}
