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
			String location, String notes, boolean isDeclawed, boolean isLitterBoxTrained) {
		// super is the class we are extending in this case Animal
		super(name, species, breed, sex, ageYears, ageMonths, color, location, notes);
		this.isDeclawed = isDeclawed;
		this.isLitterBoxTrained = isLitterBoxTrained;
	}

	/** a method to return isDeclawed */
	public boolean getIsDeclawed() {
		return isDeclawed;
	}

	/** a method to return isLitterBoxTrained */
	public boolean getIsLitterBoxTrained() {
		return isLitterBoxTrained;
	}
}
