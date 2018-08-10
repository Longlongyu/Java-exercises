package inidi.longlongyu.a808;

import inidi.longlongyu.a808.Animal;

public class People extends Animal {
	Animal pet;
	
	public People(String name,int year) {
		super(name, year);
	}
	
	public void setMyPet(Animal pet) {
		this.pet = pet;
	}
	
	public boolean havePet() {
		if (pet != null) {
			System.out.println(name + " :I have a pet! It's name is " + pet.getName() + ".");
			return true;
		} else {
			System.out.println(name + " :Oh no! I don't have a pet!");
			return false;
		}
	}
}
