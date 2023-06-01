package estimator;

public class VacationPackage {
	
    private int cost;
    private String destination;
    private int numberOfTravelers;
    private int durationInDays;

    /**
     * 
     */
    public VacationPackage() {
        this.cost = 1000;
    }

    /**
     * 
     * @param cost
     */
    public void setCost(final int cost) {
	this.cost = cost;
    }

    /**
     * 
     * @return
     */
    public int getCost() {
	return this.cost;
    }

    /**
     * 
     * @return
     */
    public String getDestination() {
	return destination;
    }

    /**
     * 
     * @param destination
     */
    public void setDestination(final String destination) {
    	this.destination = destination;
    }
    
	/**
	 * 
	 * @return
	 */
    public int getNumberOfTravelers() {
    	return numberOfTravelers;
    }

    /**
     * 
     * @param numberOfTravelers
     */
    public void setNumberOfTravelers(final int numberOfTravelers) {
    	this.numberOfTravelers = numberOfTravelers;
    }

    /**
     * 
     * @return
     */
    public int getDurationInDays() {
        return durationInDays;
    }

    /**
     * 
     * @param durationInDays
     */
    public void setDurationInDays(final int durationInDays) {
        this.durationInDays = durationInDays;
    }

}
