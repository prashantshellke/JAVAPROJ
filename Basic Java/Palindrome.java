package chap1;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		System.out.println("Pls enter the num");
		Scanner in =new Scanner(System.in);
		int number =in.nextInt();
		//scanner.close();

        int originalNumber = number;
        int reversedNumber = 0;
        while (number != 0) {
            int remainder = number % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            number /= 10;
        }

        if (originalNumber == reversedNumber) {
            System.out.println(originalNumber + " is a palindrome.");
        } else {
            System.out.println(originalNumber + " is not a palindrome.");
        }
	}

}
