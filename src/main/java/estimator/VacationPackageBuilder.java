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
	
	// TODO: Setters with Pre-Validation
	public boolean setDestination(String destination) {
		Pattern pattern = Pattern.compile("[a-zA-Z]");
		Matcher matcher = pattern.matcher(destination);
		boolean matchFound = matcher.find();
		
		if (!matchFound) {
			System.out.println("Destino inválido");
		}else {
			this.result.setDestination(destination);
		}		
		
		return matchFound;
	}
	
	public boolean setNumberOfTravelers(String numberOfTravelers) {
		Pattern pattern = Pattern.compile("^[0-9]+$");
		Matcher matcher = pattern.matcher(numberOfTravelers);
		boolean matchFound = matcher.find();
		
		if (!matchFound) {
			System.out.println("Número de viajeros inválido");
		}else if (Integer.valueOf(numberOfTravelers) >= 80){
			matchFound = false;
			System.out.println("Paquetes de viaje no disponibles para la cantidad de viajeros solicitada");
		}else {
			this.result.setNumberOfTravelers(Integer.valueOf(numberOfTravelers));
		}
		
		return matchFound;
	}
	
	public boolean setDurationInDays(String numberOfDays) {
		Pattern pattern = Pattern.compile("^[0-9]+$");
		Matcher matcher = pattern.matcher(numberOfDays);
		boolean matchFound = matcher.find();
		
		if (!matchFound) {
			System.out.println("Número de días inválido");
		}else {
			this.result.setDurationInDays(Integer.valueOf(numberOfDays));
		}
		
		return matchFound;
	}
	
	public VacationPackage getResult() {
		return this.result;
	}
	
}
