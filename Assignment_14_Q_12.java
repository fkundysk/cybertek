package assignment_14;

public class Q_12_Phone {
	
	private String phoneName = "SAMSUNG";
	private String phoneModel = "S20";
	private int phoneMemory;

	@Override
	public String toString() {
		return "[ PHONE: " + phoneName + " | MODEL: " + phoneModel + " | MEMORY: " + phoneMemory + " GB ]";
	}

	public int getPhoneMemory() {
		return phoneMemory;
	}

	public void setPhoneMemory(int phoneMemory) {
		this.phoneMemory = phoneMemory;
	}
	
	

}


package assignment_14;

public class Q_12_CameraPhone extends Q_12_Phone{

	
	private int imageSize;
	private int memorySize;
	
	
	public Q_12_CameraPhone(int imageSize, int memorySize) {
		super.setPhoneMemory(memorySize);
		this.imageSize = imageSize;
		System.out.println(super.toString());
		System.out.println("Your phone can hold " + numPictures() + " pictures (each of them " + imageSize + " megapixel)");
	}
	
	public int numPictures() {
		
		int numPictures;
		
		numPictures = ((super.getPhoneMemory()*1000)/imageSize);
		
		return numPictures;
	}
	
}

package assignment_14;

import java.util.Scanner;

public class Q_12_PhoneTest {

	public static void main(String[] args) {
		
		System.out.print("Please enter your phone memory size (Gigabytes) : ");
		
		Scanner sc = new Scanner(System.in);
		
		int memorySize = sc.nextInt();
		
		System.out.print("Please enter your picture quality (Megapixel) : ");
		
		int imageSize = sc.nextInt();
		
		sc.close();
		
		System.out.println();
		
		Q_12_CameraPhone c1 = new Q_12_CameraPhone(imageSize, memorySize);
		
	
	}

}