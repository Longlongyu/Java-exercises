package inidi.longlongyu.a808;

abstract class Animal {
	String name;
	int year;
	
	public Animal(String name,int year) {
		this.name = name;
		this.year = year;
	}
	
	public void eat() {
		System.out.println(name + ": I eat.");
	}
	
	public void sleep() {
		System.out.println(name + ": ZZZZZZ");
	}
	
	public void getYearsOld() {
		System.out.println(name + ": I'm " + year + " years old.");
	}
	
	public void changeOld() {
		year++;
		System.out.println(name + ": I'm " + year + " years old.");
	}
	
	public String getName() {
		return name;
	}
}
