package cit260stuff;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello, Maria! It worked!");
		
		System.out.println("Yay, you is a programmer NOW!!");
		
		System.out.println("Cool. We are awesome!");
		
		
	
	//hard-coded values to test since we don't have user input yet-getters
	Dog doggie= new Dog("fluffy", "dog", "chihuahua", "female", 5, 3, "black", "downtown", "none", true, true, true,true, true);
	System.out.println("The dog's age is:" + doggie.getAgeYears());
	System.out.println("The dog's color is:" + doggie.getColor());

	int age= 4;
	doggie.setageYears(age);
	System.out.println("The dog's age is:" + doggie.getAgeYears());
	
	age= 24;
	doggie.setageYears(age);
	System.out.println("The dog's age is:" + doggie.getAgeYears());
	}

}
