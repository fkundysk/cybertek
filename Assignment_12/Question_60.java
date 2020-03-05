package Assignment_12;

public class Question_60 {

	public static void main(String[] args) {// TODO Auto-generated method stub

		String[][] arr = {{"f", "o", "o"}, {"b", "a", "r"}};
		
		System.out.println(combineArray(arr));
		
		
	}

	public static String combineArray(String[][] arr) {
		
		String allArray="";
		
		for (int i=0; i<arr.length; i++) {
			
			for (int j=0; j<arr[i].length; j++) {
				
				allArray = allArray + arr[i][j];
				
			} 
		}
		return allArray;
	}

}
