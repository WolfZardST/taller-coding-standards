package estimator;

public class VacationPackageBuilder {

	private VacationPackage result;
	
	public VacationPackageBuilder() {
		this.result = new VacationPackage();
	}
	
	public void reset() {
		this.result = new VacationPackage();
	}
	
	// TODO: Setters
	// TODO: Checkers
	
	public VacationPackage getResult() {
		return this.result;
	}
	
}
