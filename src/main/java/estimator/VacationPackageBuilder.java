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
		}	
		
		return matchFound;
	}
	
	public VacationPackage getResult() {
		return this.result;
	}
	
}
