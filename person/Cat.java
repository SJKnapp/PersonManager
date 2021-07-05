package person;

public class Cat {
	String name;
	int age;
	String colour;

	public Cat(String name, int age, String colour) {
		this.name = name;
		this.age = age;
		this.colour = colour;
	}

	protected void speak() {
		System.out.println("prrrr");
	}

	protected void print() {
		System.out.println("name: " + name);
		System.out.println("age: " + age);
		System.out.println("colour: " + colour);
	}
}
