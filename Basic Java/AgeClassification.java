

package chap1;

import java.util.Scanner;

public class AgeClassification {

	public static void main(String[] args) {
		System.out.println("Please enter your age:");

		Scanner in = new Scanner(System.in);
		int age = in.nextInt();

		if (age <= 0) {
			System.out.println("Invalid input");

		} else if (age >= 1 && age <= 9) {
			System.out.println("Child");

		} else if (age >= 10 && age <= 18) {
			System.out.println("Adult");

		} 
		else if (age >= 19 && age <= 35) {
			System.out.println("young");
		}
		else {
			System.out.println("senior");

		}

	}

}
