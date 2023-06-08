package estimator;

import java.util.Scanner;

public class Main {
	
	private Main() {
	// Constructor
	}
	
    private static Scanner scanner = new Scanner(System.in);
//CHECKSTYLE:OFF
	public static void main(String[] args) {
//CHECKSTYLE:ON		
	VacationPackageBuilder builder = new VacationPackageBuilder();
		
	System.out.println("\nWelcome to the E7 Vacation Package Cost Estimator");
		
	do {
	    System.out.print("\nDestination: ");
	}
	while(!builder.setDestination(Main.scanner.nextLine()));
		
	do {
	    System.out.print("\nNumber of travelers: ");
	}
	while(!builder.setNumberOfTravelers(Main.scanner.nextLine()));
	
	do {
	    System.out.print("\nDuration (days): ");
	}
	while(!builder.setDurationInDays(Main.scanner.nextLine()));
	do {
		System.out.print("\nChoose an optional add on (Number of the add on): ");
		AddsOns.showAllAddons();
	}
	while(!builder.setAddOn(Main.scanner.nextLine()));
	
	VacationPackage vacationPackage = builder.getResult();
	
	VacationPackageCostCalculator calculator = new VacationPackageCostCalculator(vacationPackage);
	calculator.calculateCost();
	
	System.out.printf("\nThe total cost is: $ %d.00", vacationPackage.getCost());
    }

}
