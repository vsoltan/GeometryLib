package dim2d.tools;
import java.util.Scanner;

import dim2d.shapes.Circle;

public class CircleCalc {
	public static void main(String[] args) {
		System.out.println("Welcome to Valeriy's Circle and Sector Calculator!" + System.lineSeparator()
				+ "Do you have a sector or a circle?");
		Scanner input = new Scanner(System.in);
		double radius;
		String choice = input.nextLine();
		input.close();
		if (choice == "circle") {
			System.out.print("Insert the radius of your circle:  ");
			radius = input.nextDouble();
			Circle circle = new Circle(radius);
			System.out.println(circle.debugString());

		} else{
			System.out.println("sorry");
		}
	}
}
