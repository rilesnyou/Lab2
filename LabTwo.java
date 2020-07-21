package gcdemos;

import java.util.Scanner;

public class LabTwo {
	private static Scanner inputAttempt;

	public static void main(String[] args) {

		try (Scanner scnr = new Scanner(System.in)) {
			System.out.println("Please enter the length of the room.");
			double length = scnr.nextDouble();

			System.out.println("Please enter the width of the room.");
			double width = scnr.nextDouble();
			
			System.out.println("Please enter the height of the room.");
			double height = scnr.nextDouble();


			double cubic = (length * width * height);
			System.out.println("The cubic feet of your room is " + cubic + ".");
			
			double area = (length * width);
			System.out.println("The area of your room is " + area + ".");

			double perimeter = ((length * 2) + (width * 2));
			System.out.println("The perimeter of your room is " + perimeter + ".");

			inputAttempt = new Scanner(System.in);
			System.out.println("Do you want to do another one(y/n)? ");
			boolean input = inputAttempt.next().startsWith("y");
			if (input == true) {
				input = true;
			} else {
			System.out.println("Thank you, have a good day.");
			}
		}
	}
}