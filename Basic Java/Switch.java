package chap1;

import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {  
		System.out.println("Pls enter the num");
		Scanner in =new Scanner(System.in);
		int number =in.nextInt();
	    switch(number){  
	    case 1: System.out.println("10");  
	    break;  
	    case 2: System.out.println("20");  
	    break;  
	    case 3: System.out.println("30");  
	    break;  
	    default:System.out.println("Not in 10, 20 or 30");  
	    }  
	}  
}
