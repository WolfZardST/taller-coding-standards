package estimator;

import java.util.Scanner;

public class Main {
	
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		VacationPackageBuilder builder = new VacationPackageBuilder();
		
		System.out.println("Welcome to the E7 Vacation Package Cost Estimator\n");
		
		System.out.println("Destination:\n");
		while(!builder.setDestination(Main.scanner.nextLine()));
		
		System.out.println("Number of travelers:\n");
		while(!builder.setNumberOfTravelers(Main.scanner.nextLine()));
		
		System.out.println("Duration (days):\n");
		while(!builder.setDurationInDays(Main.scanner.nextLine()));
		
		VacationPackage vacationPackage = builder.getResult();
		
		VacationPackageCostCalculator calculator = new VacationPackageCostCalculator(vacationPackage);
		calculator.calculateCost();
		
		System.out.printf("The total cost is: %d", vacationPackage.getCost());
	}

}
