package inidi.longlongyu.a808;

import inidi.longlongyu.a808.Animal;

public class Car extends Animal {
	public Car(String name,int year) {
		super(name, year);
	}
	
	public void eat() {
		System.out.println(name + ": I eat. Mu~");
	}
	
	public void run() {
		System.out.println(name + ": I run. Mu~");
	}
}
