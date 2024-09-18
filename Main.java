import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		CaffeinatedBeverage[] inventory = new CaffeinatedBeverage[10];
		Scanner keyboard = new Scanner(System.in);
		// Prompt user with options in a loop
		int choice, ounces, brewTemp, count = 0;
		String name;
		double price;

		do {
			System.out.println("1) Enter new Tea");
			System.out.println("2) Enter new Yerba Mate");
			System.out.println("3) Exit");
			System.out.print(">>");
			choice = keyboard.nextInt();

			switch (choice) {
				case 1: // Tea
					System.out.print("Enter name      : ");
					name = keyboard.nextLine();
					name = keyboard.nextLine();
					System.out.print("Enter ounces    : ");
					ounces = keyboard.nextInt();
					System.out.print("Enter price     $ ");
					price = keyboard.nextDouble();
					System.out.print("Enter brew temperature (in Celsius): ");
					brewTemp = keyboard.nextInt();

					// Create a Tea, put into array
					inventory[count] = new Tea(name, ounces, price, brewTemp);
					count++;
					System.out.println("Your tea order has been added: " + inventory[count]);
					break;

				case 2: // Yerbe Mate
					System.out.print("Enter name      : ");
					name = keyboard.nextLine();
					name = keyboard.nextLine();
					System.out.print("Enter ounces    : ");
					ounces = keyboard.nextInt();
					System.out.print("Enter price     $ ");
					price = keyboard.nextDouble();
					System.out.print("Enter brew temperature (in Celsius): ");
					brewTemp = keyboard.nextInt();
					System.out.print("Number of passes : ");
					int numPasses = keyboard.nextInt();

					// Create a Yerbe Mate, put into array
					inventory[count] = new YerbeMate(name, ounces, price, brewTemp, numPasses);

					System.out.println("Your tea order has been added: " + inventory[count]);
					count++;
					break;

					

			}

		} while (choice != 3);
		System.out.printf("%.2f", findAveragePrice(inventory));

	}
	public static double findAveragePrice (CaffeinatedBeverage[] inventory) {
		double total = 0.0;
		int count = 0;
		for (int i = 0; i < inventory.length; i++) {
			if (inventory[i] != null) {
				count = count + 1;
			}
			else {
				break;
			}
		}
		for (int i = 0; i < count; i++) {
			total = total + inventory[i].getPrice();
		}
		total = total / count;
		return total;
	}
}