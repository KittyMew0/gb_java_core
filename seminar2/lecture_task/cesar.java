package geekbrains_course.java_core.seminar2.lecture_task;

import java.util.Scanner;

public class cesar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter a phrase in russian only and only in small or capital letters at once ");
	    String firstinput = sc.next();
	    
	    System.out.println("enter a... key or what's that ");
	    int key = sc.nextInt();

	    String secondoutput = CesarCipher(firstinput, key);
	    System.out.println(secondoutput);

	}
	
	public static String CesarCipher(String firstinput, int key) {
		String secondoutput = "";
	    int c = 0;
	    int y = 0;
	    char firstChar = firstinput.charAt(0);
	    
	    if (firstChar > 1039 && firstChar < 1073) {
	    	for (int i = 0; i < firstinput.length(); i++) {
	    		c =  (firstinput.charAt(i) + key);
	    		y = (c - 1040) % 32 + 1040; 
	    		secondoutput += (char) y; 
	    	}
	    }
	    
	    else {
	    	for (int i = 0; i < firstinput.length(); i++) {
	    		c =  (firstinput.charAt(i) + key);
	        	y = (c - 1072) % 32 + 1072; 
	        	secondoutput += (char) y; 
	    	}
	    }
		return secondoutput;

	}
}
