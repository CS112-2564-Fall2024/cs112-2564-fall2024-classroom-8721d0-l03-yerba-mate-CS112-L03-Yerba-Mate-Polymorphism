import java.util.Scanner;
//ChatGPT helped with highestPriced method in main
public class Main
{
	public static void main(String[] args)
	{
		CaffeinatedBeverage[] inventory = new CaffeinatedBeverage[10];
		Scanner keyboard = new Scanner(System.in);
		// Prompt user with options in a loop
		int choice, ounces, brewTemp, numPasses, count = 0;
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

					System.out.println("Your tea order has been added: " + inventory[count]);
					count++;
					break;
				case 2: // Yerba Mate
					System.out.print("Enter name      : ");
					name = keyboard.nextLine();
					name = keyboard.nextLine();
					System.out.print("Enter ounces    : ");
					ounces = keyboard.nextInt();
					System.out.print("Enter price     $ ");
					price = keyboard.nextDouble();
					System.out.print("Enter brew temperature (in Celsius): ");
					brewTemp = keyboard.nextInt();
					System.out.print("Enter number of passes: ");
					numPasses = keyboard.nextInt();

					// Create a Yerba, put into array
					inventory[count] = new YerbaMate(name, ounces, price, brewTemp, numPasses);

					System.out.println("Your Yerba Mate order has been added: " + inventory[count]);
					count++;
			}

		} while (choice != 3);

		//Average Price 
		double averagePrice = findAveragePrice(inventory, count);

        System.out.printf("Average Price of Beverages: $%.2f %n%n" , averagePrice);

        // Highest Priced YerbaMate
		YerbaMate highestPricedYerbaMate = findHighestPricedYerbaMate(inventory, count);
		
		if (highestPricedYerbaMate != null) 
		{
			System.out.printf("Highest Price of Yerba Mate: %S, Price: $%.2f%n%n", highestPricedYerbaMate.getName(), highestPricedYerbaMate.getPrice());
        } else {
            System.out.println("No Yerba Mate found in inventory.");
        }
		
	}
	
	public static double findAveragePrice(CaffeinatedBeverage[] inventory, int count)
	{
		double totalPrice = 0.0;
		for (int i = 0; i < count; i++) {
			totalPrice += inventory[i].getPrice();
		}

		return (totalPrice / (double) count);
	}
	
	//Used ChatGPT to troubleshoot this method and the checks needed to debug
	public static YerbaMate findHighestPricedYerbaMate(CaffeinatedBeverage[] inventory, int count)
	{
		YerbaMate highestPriced = null;

		for (int i = 0; i < count; i++) 
		{
			if (inventory[i] != null && inventory[i] instanceof YerbaMate) 
			{
				YerbaMate yerbaMate = (YerbaMate) inventory[i];

				if (highestPriced == null || yerbaMate.getPrice() > highestPriced.getPrice()) 
				{
					highestPriced = yerbaMate;
				}
			}
		}

		return highestPriced;
	}
		
}

	


