package com.zaurtregulov.spring.IoC_DI.spring_introduction;

public class Person {
	
	private Pet pet;
	
//	public Person(Pet pet) {
//		System.out.println("Person been is created");
//		this.pet = pet;
//	}
	
	public Person() {
		System.out.println("Person been is created");
	}
	
	//Pet -> setPet
	public void setPet(Pet pet) {
		System.out.println("Class person: set Pet");
		this.pet = pet;
	}
	
	public void callYourPet() {
		System.out.println("Hello, my lovely pet!");
		pet.say();
	}
}
