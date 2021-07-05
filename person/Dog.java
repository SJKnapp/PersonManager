package person;

public class Dog {
	String name;
	int age;
	String colour;

	public Dog(String name, int age, String colour) {
		this.name = name;
		this.age = age;
		this.colour = colour;
	}

	protected void speak() {
		System.out.println("woof");
	}

	protected void print() {
		System.out.println("name: " + name);
		System.out.println("age: " + age);
		System.out.println("colour: " + colour);
	}
}
