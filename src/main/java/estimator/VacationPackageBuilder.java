package estimator;

public class VacationPackageBuilder {

	private VacationPackage result;
	
	public VacationPackageBuilder() {
		this.result = new VacationPackage();
	}
	
	public void reset() {
		this.result = new VacationPackage();
	}
	
	// TODO: Setters with Pre-Validation
	
	public VacationPackage getResult() {
		return this.result;
	}
	
}
