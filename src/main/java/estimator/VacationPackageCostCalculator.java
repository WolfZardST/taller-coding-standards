package estimator;

public class VacationPackageCostCalculator {
	
	private VacationPackage vacationPackage; 
	
	public VacationPackageCostCalculator(VacationPackage vacationPackage) {
		this.vacationPackage = vacationPackage;
	}
	
	public void calculateCost() {
		calculateWithDestination();
		// TODO: call private methods
		
	}
	
	// TODO: Private Condition Methods for Cost Calculation
	private void calculateWithDestination() {
		int cost = this.vacationPackage.getCost();
		
		if (this.vacationPackage.getDestination().equals("Paris")) {
			this.vacationPackage.setCost(cost += 500);
		}
		else if (this.vacationPackage.getDestination().equals("New York")) {
			this.vacationPackage.setCost(cost += 600);
		}
	}
	
}
