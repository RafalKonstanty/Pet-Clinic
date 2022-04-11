package pl.konstanty.sfgpetclinic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SfgPetClinicApplication {

	public static void main(String[] args) {
		SpringApplication.run(SfgPetClinicApplication.class, args);
	}

//5 Principles of OOP
//Single Responsibility Principle - just because you can doesnt mean you should
//	- every class should have a single responsibility
//	- there should never be more then one reason for a class to change
//	- your classes should be small, no more than a screen full of code
//	- avoid 'god' classes
//	- split big classes into smaller classes

//Open Closed Principle - open chest surgery is not needed when putting on a coat
// - your classes should be open for extension but closed for modification
// - you should be able to extend a classes behavior, without modifying it
// - use private variables with getters and setters - only when you need them
// - use abstract base classes

//Liskov Substitution principle - If it looks like a duck, quacks like a duck, but need batteries - you probably have the wrong abstraction
	// - objects in a program would be replaceable with instances of their substypes without altering the correctness of the program
	// - violations will often fail the "Is a" test.
	// - a square "Is a" rectangle, however the rectangle is not a square

//Interface segregation principle - you want me to plug this in, where?
	// - make fine grained interfaces that are client specific
	// - many client specific interfaces are better than one "general purpose" interface
	// - keep your components focused and minimize dependencies between them
	// - notice relationship to the single responsibility principle? i.e. avoid 'god' interfaces

//Dependency Inversion Principle - would you solder a lamp directly to the electrical wiring in a wall?
	// - abstractions should not depend upon details
	// - details should depend upon abstractions
	// - important that higher level and lower level objects depend on the same abstract interaction
	// - this is not the same as Dependency Injection - which is how objects obtain dependent objects

}
