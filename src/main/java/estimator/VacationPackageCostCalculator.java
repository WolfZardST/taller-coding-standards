package estimator;

public class VacationPackageCostCalculator {
	
	private VacationPackage vacationPackage; 
	
	public VacationPackageCostCalculator(VacationPackage vacationPackage) {
		this.vacationPackage = vacationPackage;
	}
	
	public void calculateCost() {
		calculateWithDestination();
		calculateWithNumberOfTravelers();
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
	
	private void calculateWithNumberOfTravelers() {
		int cost = this.vacationPackage.getCost();
		
		if (this.vacationPackage.getNumberOfTravelers() >= 4 && 
			this.vacationPackage.getNumberOfTravelers() < 10) {
			this.vacationPackage.setCost((int) Math.round(cost*0.9));
		}
		
		if (this.vacationPackage.getNumberOfTravelers() >= 10) {
			this.vacationPackage.setCost((int) Math.round(cost*0.8));
		}
	}
	
}
