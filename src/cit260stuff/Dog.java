package cit260stuff;

public class Dog extends Animal {
	/** default values or data field-declare */
	private boolean getsAlongDogs;
	private boolean isPottyTrained;

	/** constructors */
	public Dog() {
		// baseline/default numbers can be anything we want
		super();
		getsAlongDogs = true;
		isPottyTrained = true;

	}

	/**
	 * instead of default value it changes to what the other class says- to new
	 * parameters
	 */

	public Dog(String name, String species, String breed, String sex, int ageYears, int ageMonths, String color,
			boolean getsAlongDogs, boolean isPottyTrained) {
		// super is the class we are extending in this case Animal
		super(name, species, breed, sex, ageYears, ageMonths, color);
		this.getsAlongDogs = getsAlongDogs;
		this.isPottyTrained = isPottyTrained;

	}
//the setters

	/** a method to set getsAlongDogs */
	public void setGetsAlongDogs(boolean getsAlongDogs) {
		this.getsAlongDogs = getsAlongDogs;
	}
	
	/** a method to set isPottyTrained */
	public void setIsPottyTrained(boolean isPottyTrained) {
		this.isPottyTrained = isPottyTrained;
	}

//the getters
	/** a method to return getsAlongDogs */
	public boolean getGetsAlongDogs() {
		return getsAlongDogs;
	}

	/** a method to return isPottyTrained */
	public boolean getIsPottyTrained() {
		return isPottyTrained;
	}

}
