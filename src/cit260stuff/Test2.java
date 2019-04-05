package cit260stuff;

public class Test2 {

	public static void main(String[] args) {
				
	
	//hard-coded values to test since we don't have user input yet-getters
	Dog doggie= new Dog("fluffy", "dog", "chihuahua", "female", 5, 3, "black", "downtown", "none", true, true, true,true, true);
	System.out.println("The dog's age is:" + doggie.getAgeYears());
	System.out.println("The dog's color is:" + doggie.getColor());

	int age= 4;
	doggie.setageYears(age);
	System.out.println("The dog's age is:" + doggie.getAgeYears());
	
	age= 24;
	doggie.setageYears(age);
	System.out.println("The dog's name is:" + doggie.getName());
	
	}

}
