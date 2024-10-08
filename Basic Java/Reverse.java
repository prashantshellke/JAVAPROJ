package chap1;
import java.util.Scanner;

public class Reverse {
	public static void main(String[]args) {
		System.out.println("Pls enter the num for reverce");
		Scanner in =new Scanner(System.in);
		int num =in.nextInt();
		int reverse=0;
		for( ;num != 0; num=num/10)   
		{  
		int remainder = num% 10;  
		reverse = reverse * 10 + remainder;  
		}  
		System.out.println("The reverse of the given number is: " + reverse);  
	}

}
