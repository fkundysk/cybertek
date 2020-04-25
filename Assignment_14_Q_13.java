package assignment_14;

import java.util.*;



public class Q_13_Color {
	
	
    private int[] rgb = new int[3];

    public final static int[] WHITE     = new int[]{255, 255, 255};
    public final static int[] LIGHT_GRAY = new int[]{192, 192, 192};
    public final static int[] GRAY      = new int[]{128, 128, 128};
    public final static int[] DARK_GRAY  = new int[]{64, 64, 64};
    public final static int[] BLACK     = new int[]{0, 0, 0};
    public final static int[] RED       = new int[]{255, 0, 0};
    public final static int[] PINK      = new int[]{255, 175, 175};
    public final static int[] ORANGE    = new int[]{255, 200, 0};
    public final static int[] YELLOW    = new int[]{255, 255, 0};
    public final static int[] GREEN     = new int[]{0, 255, 0};
    public final static int[] MAGENTA   = new int[]{255, 0, 255};
    public final static int[] CYAN      = new int[]{0, 255, 255};
    public final static int[] BLUE      = new int[]{0, 0, 255};


    public Q_13_Color(int r, int g, int b){
       this.rgb[0] = r;
       this.rgb[1] = g;
       this.rgb[2] = b;
       
    }

    public Q_13_Color() {
        this(255,255,255);
    }

  
    public String toString() {
    	
    	System.out.print("Your rgb code: [" + rgb[0] + ", " + rgb[1] + ", " + rgb[2] + "] color ---> ");
    		
    	if (Arrays.equals(rgb, WHITE)) {
    		return "white";
    	} else if(Arrays.equals(rgb, LIGHT_GRAY)) {
    		return "Light_gray";
    	} else if(Arrays.equals(rgb, GRAY)) {
    		return "gray";
    	} else if (Arrays.equals(rgb, DARK_GRAY)){
    		return "dark gray";
    	} else if(Arrays.equals(rgb, BLACK)) {
    		return "black";
    	} else if(Arrays.equals(rgb, PINK)) {
    		return "pink";
    	} else if(Arrays.equals(rgb, ORANGE)) {
    		return "orange";
    	} else if(Arrays.equals(rgb, YELLOW)) {
    		return "yellow";
    	} else if(Arrays.equals(rgb, GREEN)) {
    		return "green";
    	} else if(Arrays.equals(rgb, MAGENTA)) {
    		return "magenta";
    	} else if(Arrays.equals(rgb, CYAN)) {
    		return "cyan";
    	} else if(Arrays.equals(rgb, BLUE)) {
    		return "blue";
    	} else {
    		return "n/a";
    	}
       
    }

}



package assignment_14;

import java.util.Scanner;

public class Q_13_ColorTest {

    public static void main(String[] args) {
        
        System.out.print("Please enter the first number of rgb code : ");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        
        System.out.print("Please enter the second number of rgb code : ");
        int g = sc.nextInt();
        
        System.out.print("Please enter the second number of rgb code : ");
        int b = sc.nextInt();
        
        Q_13_Color rgbColor = new Q_13_Color(r, g, b);
        
        System.out.println(rgbColor.toString());
    
    }

    @Override
    public String toString() {
        
        return super.toString();
    }

}
