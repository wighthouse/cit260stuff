package cit260stuff;

public class Dog extends Animal {
	/** default values or data field-declare */
	private boolean getsAlongDogs;
	private boolean getsAlongCats;
	private boolean isGoodWithKids;
	private boolean isPottyTrained;
	private boolean isDogDoorTrained;

	/** constructors */
	public Dog() {
		// baseline/default numbers can be anything we want
		super();
		getsAlongDogs = true;
		getsAlongCats = true;
		isGoodWithKids = true;
		isPottyTrained = true;
		isDogDoorTrained = true;
	}

	/**
	 * instead of default value it changes to what the other class says- to new
	 * parameters
	 */

	public Dog(String name, String species, String breed, String sex, int ageYears, int ageMonths, String color,
			String location, String notes, boolean getsAlongDogs, boolean getsAlongCats, boolean isGoodWithKids,
			boolean isPottyTrained, boolean isDogDoorTrained) {
		// super is the class we are extending in this case Animal
		super(name, species, breed, sex, ageYears, ageMonths, color, location, notes);
		this.getsAlongDogs = getsAlongDogs;
		this.getsAlongCats = getsAlongCats;
		this.isGoodWithKids = isGoodWithKids;
		this.isPottyTrained = isPottyTrained;
		this.isDogDoorTrained = isDogDoorTrained;

	}
//the setters
	
	/** a method to set getsAlongDogs */
	public void setGetsAlongDogs(boolean getsAlongDogs) {
		this.getsAlongDogs= getsAlongDogs;
	}
	
	/** a method to set getsAlongCats */
	public void setGetsAlongCats(boolean getsAlongCats) {
		this.getsAlongCats= getsAlongCats;
	}
	
	/** a method to set isGoodWithKids */
	public void setIsGoodWithKids(boolean isGoodWithKids) {
		this.isGoodWithKids= isGoodWithKids;
	}
	
	
	
//the getters
	/** a method to return getsAlongDogs */
	public boolean getGetsAlongDogs() {
		return getsAlongDogs;
	}

	/** a method to return getsAlongCats */
	public boolean getGetsAlongCats() {
		return getsAlongCats;
	}

	/** a method to return isGoodWithKids */
	public boolean getIsGoodWithKids() {
		return isGoodWithKids;
	}

	/** a method to return isPottyTrained */
	public boolean getIsPottyTrained() {
		return isPottyTrained;
	}

	/** a method to return isDogDoorTrained */
	public boolean getIsDogDoorTrained() {
		return isDogDoorTrained;
	}

}
