package cit260stuff;

/**
 * create a parent class that contains the info that will be inherited by the
 * child classes
 * 
 * @author mariazubia
 *
 */

public class Animal {
	/** default values or data field-declare */
	private String name;
	private String species;
	private String breed;
	private String sex;
	private int ageYears;
	private int ageMonths;
	private String color;
	private String location;
	private String notes;

	/** constructors */
	// no-args ***We might want to change this to protected***
	public Animal() {
		
		// ***The first one is the default constructor and is empty. If we need to set initial values,
		//they could go up above where you declared them, but I am not sure we need to.***
		name = " ";
		species = " ";
		breed = " ";
		sex = " ";
		ageYears = 0;
		ageMonths = 0;
		color = " ";
		location = " ";
		notes = " ";

	}

	// args This looks good!
	public Animal(String name, String species, String breed, String sex, int ageYears, int ageMonths, String color,
			String location, String notes) {
		this.name = name;
		this.species = species;
		this.breed = breed;
		this.sex = sex;
		this.ageYears = ageYears;
		this.ageMonths = ageMonths;
		this.color = color;
		this.location = location;
		this.notes = notes;
	}
//***The getters look good - you need to add setters, too.***
	/** a method to return name */
	public String getName() {
		return name;
	}

	/** a method to return species */
	public String getSpecies() {
		return species;
	}

	/** a method to return breed */
	public String getBreed() {
		return breed;
	}

	/** a method to return sex */
	public String getSex() {
		return sex;
	}

	/** a method to return ageYears */
	public int getAgeYears() {
		return ageYears;
	}

	/** a method to return ageMonths */
	public int getAgeMonths() {
		return ageMonths;
	}

	/** a method to return color */
	public String getColor() {
		return color;
	}

	/** a method to return location */
	public String getLocation() {
		return location;
	}

	/** a method to return notes */
	public String getNotes() {
		return notes;
	}
}
