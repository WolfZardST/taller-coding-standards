package estimator;

import java.util.regex.*; 

public class VacationPackageBuilder {

	private VacationPackage result;
	
	public VacationPackageBuilder() {
		this.result = new VacationPackage();
	}
	
	public void reset() {
		this.result = new VacationPackage();
	}
	
	private boolean regexMatch(String regex, String target) {
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(target);
		return matcher.find();
	}
	
	public boolean setDestination(String destination) {
		
		boolean matchFound = regexMatch("^[a-zA-Z ]+$", destination);
		
		if (!matchFound) {
			System.out.println("Invalid Destination");
		}else {
			this.result.setDestination(destination);
		}		
		
		return matchFound;
	}
	
	public boolean setNumberOfTravelers(String numberOfTravelers) {
		
		boolean matchFound = regexMatch("^[0-9]+$", numberOfTravelers);
		
		if (!matchFound) {
			System.out.println("Número de viajeros inválido");
		}else if (Integer.valueOf(numberOfTravelers) >= 80){
			matchFound = false;
			System.out.println("There is no Vacation Package available for the specified Number of Travelers");
		}else {
			this.result.setNumberOfTravelers(Integer.valueOf(numberOfTravelers));
		}
		
		return matchFound;
	}
	
	public boolean setDurationInDays(String numberOfDays) {
		
		boolean matchFound = regexMatch("^[0-9]+$", numberOfDays);
		
		if (!matchFound) {
			System.out.println("Invalid Number of Days");
		}else {
			this.result.setDurationInDays(Integer.valueOf(numberOfDays));
		}
		
		return matchFound;
	}
	
	public VacationPackage getResult() {
		return this.result;
	}
	
}
