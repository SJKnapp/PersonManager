package person;

import java.util.ArrayList;

public class Person {
	String name;
	int age;
	String jobTitle;
	private ArrayList<Cat> cats;
	private ArrayList<Dog> dogs;

	public Person(String name, int age, String jobTitle) {
		this.name = name;
		this.age = age;
		this.jobTitle = jobTitle;
		this.cats = new ArrayList<>();
		dogs = new ArrayList<>();
	}

	protected boolean addCat(Cat cat) {
		return this.cats.add(cat);
	}

	protected boolean removeCat(Cat cat) {
		return this.cats.remove(cat);
	}

	protected boolean addDog(Dog dog) {
		return this.dogs.add(dog);
	}

	protected boolean removeDog(Dog dog) {
		return this.dogs.add(dog);
	}

	protected void print() {

		System.out.println("name: " + name);
		System.out.println("age: " + age);
		System.out.println("job title: " + jobTitle);

		System.out.println("cats:");
		for (Cat i : cats) {
			i.print();
		}

		System.out.println("dogs:");
		for (Dog i : dogs) {
			i.print();
		}
	}

	protected Cat findCatByName(String name) {
		for (int i = 0; i < this.cats.size(); i++) {
			if (this.cats.get(i).name == name) {
				return this.cats.get(i);
			}
		}

		return null;
	}

	protected Dog findDogByName(String name) {
		for (int i = 0; i < this.dogs.size(); i++) {
			if (this.dogs.get(i).name == name) {
				return this.dogs.get(i);
			}
		}

		return null;
	}
}