package estimator;

public class Main {

	public static void main(String[] args) {
		
		VacationPackageBuilder builder = new VacationPackageBuilder();
		
		System.out.println("Welcome to the E7 Vacation Package Cost Estimator\n");
		
		// TODO: request input and use Builder
		
		VacationPackage vacationPackage = builder.getResult();
		
		VacationPackageCostCalculator calculator = new VacationPackageCostCalculator(vacationPackage);
		calculator.calculateCost();
		
		System.out.printf("The total cost is: %d", vacationPackage.getCost());
	}

}
