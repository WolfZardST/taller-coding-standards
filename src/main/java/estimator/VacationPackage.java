package estimator;

public class VacationPackage {
	
    private int cost;
    private String destination;
    private int numberOfTravelers;
    private int durationInDays;
    private AddsOns addOn;

    /**
     * Only constructor for the VacationPackage object.
     */
    public VacationPackage() {
        this.cost = 1000;
        this.addOn = AddsOns.NO_ADDS_ON;
    }

    /**
     * Returns the cost of the VacationPackage instance.
     * 
     * @return	An int representing the cost for the VacationPackage instance.
     */
    public int getCost() {
        return this.cost;
    }

    /**
     * Sets the cost of the VacationPackage instance.
     * 
     * @param cost
     */
    public void setCost(final int cost) {
        this.cost = cost;
    }

    /**
     * Returns the destination of the VacationPackage instance.
     * 
     * @return  The String containing the destination for the VacationPackage instance.
     */
    public String getDestination() {
        return destination;
    }

    /**
     * Sets the destination of the VacationPackage instance.
     * 
     * @param destination
     */
    public void setDestination(final String destination) {
    	this.destination = destination;
    }
    
	/**
	 * Returns the number of travelers of the VacationPackage instance.
	 * 
	 * @return	An int with the number of travelers for the VacationPackage instance.
	 */
    public int getNumberOfTravelers() {
    	return numberOfTravelers;
    }

    /**
     * Sets the number of travelers of the VacationPackage instance.
     * 
     * @param numberOfTravelers
     */
    public void setNumberOfTravelers(final int numberOfTravelers) {
    	this.numberOfTravelers = numberOfTravelers;
    }

    /**
     * Returns the duration in days of the VacationPackage instance.
     * 
     * @return	An int representing the duration in days for the VacationPackage instance.
     */
    public int getDurationInDays() {
        return durationInDays;
    }

    /**
     * Sets the duration in days of the VacationPackage instance.
     * 
     * @param durationInDays
     */
    public void setDurationInDays(final int durationInDays) {
        this.durationInDays = durationInDays;
    }

	public AddsOns getAddOn() {
		return addOn;
	}

	public void setAddOn(AddsOns addOn) {
		this.addOn = addOn;
	}

}
