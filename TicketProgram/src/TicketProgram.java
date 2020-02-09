import static java.lang.System.*;
import java.util.Scanner;

public class TicketProgram {

	static City destination;
	static Passenger customers = new Passenger();
	static Payment payment = new Payment();
	static String city;

	public static void run() {
		Scanner in = new Scanner(System.in);

		boolean done = false;

		while (!done) {
			System.out.println("Where do you want to go? (Los Angeles, Paris, Tokyo, New Orleans, New York) :::: ");
			city = in.nextLine();
			if (city.equalsIgnoreCase("Los Angeles") || city.equalsIgnoreCase("Tokyo")
					|| city.equalsIgnoreCase("New Orleans") || city.equalsIgnoreCase("New York")
					|| city.equalsIgnoreCase("Paris")) {
				done = true;
			} else {
				System.out.println("Invalid Input; Retype city. ");
			}
		}

		if (city.equalsIgnoreCase("Los Angeles") || city.equalsIgnoreCase("New Orleans")
				|| city.equalsIgnoreCase("New York")) {
			destination = new Domestic();
		}

		else if (city.equalsIgnoreCase("Paris") || city.equalsIgnoreCase("Tokyo")) {
			destination = new Foreign();
		}
		
		
		out.println("How many adults? ");
		int a = in.nextInt();
		customers.setAdultNo(a);
		out.println("How many children? ");
		int c = in.nextInt();
		customers.setChildNo(c);

		String modeTrav = "";
		done = false;
		while(!done) {
		out.print("Choose your mode of travel? -");
		modeTrav = in.next();
		if(modeTrav.equalsIgnoreCase("train") || modeTrav.equalsIgnoreCase("plane")
				|| modeTrav.equalsIgnoreCase("bus")) {
			done = true;}
		else {
			out.println("Invalid mode of travel, please try again.");}
		}
		String classTier = "";
		done = false;
		while(!done){
		out.print("Choose your fair choice? -");
		in.nextLine();
		classTier = in.nextLine();
		if(classTier.equalsIgnoreCase("first class")||classTier.equalsIgnoreCase("coach")
				||classTier.equalsIgnoreCase("business"))
			done = true;
		else
			out.println("Invalid fair choice, please try again.");
		}
		destination.setProperties(city, modeTrav, classTier);
		
		int finalprice = customers.getFinalPrice(destination);
		out.println("\nYour total price is $" + finalprice+"\n");
		int count = 0;
		while ((count < 3)) {
			out.print("It's payment time, Card number: ");
			payment.setCnumber(in.next());
			out.print("Expiration date:");
			payment.setExDate(in.next());
			if (payment.verify(finalprice)) {
				out.println("Your order has been placed, thank you!");
				break;
			}
			count++;
			out.println("Invalid card info. You have " + (3 - count) + " tries(y) left.");
		}

	}

}
