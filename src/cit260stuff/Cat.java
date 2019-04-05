package cit260stuff;

public class Cat extends Animal {
	private boolean isDeclawed;
	private boolean isLitterBoxTrained;

	/** constructors */
	public Cat() {
		super();
		isDeclawed = true;
		isLitterBoxTrained = true;
	}

	/**
	 * instead of default value it changes to what the other class says- to new
	 * parameters
	 */
	public Cat(String name, String species, String breed, String sex, int ageYears, int ageMonths, String color,
			boolean isDeclawed, boolean isLitterBoxTrained) {
		// super is the class we are extending in this case Animal
		super(name, species, breed, sex, ageYears, ageMonths, color);
		this.isDeclawed = isDeclawed;
		this.isLitterBoxTrained = isLitterBoxTrained;
	}

	// the setters

	/** a method to set isDeclawed */
	public void setIsDeclawed(boolean isDeclawed) {
		this.isDeclawed = isDeclawed;
	}

	/** a method to set isLitterBoxTrained */
	public void setIsLitterBoxTrained(boolean isLitterBoxTrained) {
		this.isLitterBoxTrained = isLitterBoxTrained;
	}

	// the getters
	/** a method to return isDeclawed */
	public boolean getIsDeclawed() {
		return isDeclawed;
	}

	/** a method to return isLitterBoxTrained */
	public boolean getIsLitterBoxTrained() {
		return isLitterBoxTrained;
	}
}
