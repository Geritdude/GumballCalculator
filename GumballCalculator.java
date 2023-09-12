package gumball;

import java.util.Scanner;

public class GumballCalculator {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double gumballs;
		double kids;
		double gumballsPerKid;
		
		System.out.println("How Many Kids?");
		kids = keyboard.nextDouble();
		System.out.println("How Many Gumballs?");
		gumballs = keyboard.nextDouble();
		
		gumballsPerKid = gumballs / kids;
		
		System.out.print("Each kid gets ");
		System.out.print(gumballsPerKid);
		System.out.println(" gumballs.");

		keyboard.close();

	}
}
