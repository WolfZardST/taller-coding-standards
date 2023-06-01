package estimator;

import java.util.regex.*; 

public class VacationPackageBuilder {

    private VacationPackage result;
	/**
	 * Only constructor for the VacationPackageBuilder object.
	 */
    public VacationPackageBuilder() {
    	this.result = new VacationPackage();
    }
	
    /**
     * Resets the VacationPackage instance of the builder.
     * 
     * @see VacationPackage
     */
    public void reset() {
    	this.result = new VacationPackage();
    }
	
    /**
     * Verifies if the given regular expression and target matches.
     * 
     * @param regex		The String containing the regular expression.
     * @param target	The target String.
     * @return			A boolean containing the matching result.
     */
    private boolean regexMatch(final String regex, final String target) {
    	Pattern pattern = Pattern.compile(regex);
    	Matcher matcher = pattern.matcher(target);
    	return matcher.find();
    }
	
    /**
     * Validates and sets the destination of the VacationPackage instance.
     * 
     * @param destination	The String containing the destination for the VacationPackage instance.
     * @return				A boolean indicating if the set operation was successful.
     */
    public boolean setDestination(final String destination) {
    	
    	boolean matchFound = regexMatch("^[a-zA-Z ]+$", destination);
		
    	if (!matchFound) {
            System.out.println("Invalid Destination");
    	}
    	else {
            this.result.setDestination(destination);
        }		
		
        return matchFound;
    }
	
    /**
     * Validates and sets the number of travelers of the VacationPackage instance.
     * 
     * @param numberOfTravelers		An int with the number of travelers for the VacationPackage instance.
     * @return						A boolean indicating if the set operation was successful.
     */
    public boolean setNumberOfTravelers(final String numberOfTravelers) {
	
        boolean matchFound = regexMatch("^[0-9]+$", numberOfTravelers);

        if (!matchFound) {
            System.out.println("Número de viajeros inválido");
        }
        else if (Integer.valueOf(numberOfTravelers) >= 80){
            matchFound = false;
            System.out.println("There is no Vacation Package available for the specified Number of Travelers");
        } else {
            this.result.setNumberOfTravelers(Integer.valueOf(numberOfTravelers));
        }
	
        return matchFound;
    }

    /**
     * Validates and sets the duration in days of the VacationPackage instance.
     * 
     * @param numberOfDays		An int representing the duration in days for the VacationPackage instance.
     * @return					A boolean indicating if the set operation was successful.
     */
    public boolean setDurationInDays(final String numberOfDays) {
	
    	boolean matchFound = regexMatch("^[0-9]+$", numberOfDays);

    	if (!matchFound) {
            System.out.println("Invalid Number of Days");
    	}else {
            this.result.setDurationInDays(Integer.valueOf(numberOfDays));
    	}
	
    	return matchFound;
    }

    /**
     * Returns the VacationPackage instance of the builder.
     * 
     * @return		The VacationPackage instance of the builder.
     */
    public VacationPackage getResult() {
    	return this.result;
    }
	
}
