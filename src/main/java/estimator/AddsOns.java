package estimator;

public enum AddsOns {
	NO_ADDS_ON("No adds on",0,0), ALL_INCLUSIVE("All Inclusive",200,1), ADVENTURE_ACTIVITIES("Adventure activities",150,2), 
	SPA_WELLNESS("Span and Wellnes",100,3);
	
	private int key;
	private int value;
	private String name;
	
	AddsOns(String name, int value, int key) {
		this.value = value;
		this.name = name;
		this.key = key;
	}
	
	public Integer getValue() {
		return this.value;
	}
	
	public Integer getKey() {
		return this.key;
	}
	
	public String getName() {
		return this.name;
	}

	public static void showAllAddons() {
	    System.out.println("Available addons:");
	    for (AddsOns addon : AddsOns.values()) {
	        System.out.println(addon.getKey() + "." + addon.getName() + ": " + addon.getValue());
	    }
	}
	
	public static AddsOns getAddonByKey(int key) {
	    for (AddsOns addon : AddsOns.values()) {
	        if (addon.getKey() == (key)) {
	            return addon;
	        }
	    }
	    return null; 
	}
	
}
