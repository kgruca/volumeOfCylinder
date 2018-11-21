import java.util.Scanner;

public class Arithmetic {
	public static void main(String[] args) {
		
		String answer;
		double volume, height, radius;
		final double PI = 3.14;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please provide the height of the cylinder: ");
		answer = input.nextLine();
		height = Double.parseDouble(answer);
		
		System.out.print("Please provide the radius of the cylinder: ");
		answer = input.nextLine();
		radius = Double.parseDouble(answer);
		
		volume = PI*radius*radius*height;

		System.out.println("\nThe volume of the cylinder is " + volume + " units cubed!");
		input.close();
	}

}
