package person;

public class App {
	public static void main(String[] args) {
		PersonManager personManager = new PersonManager();

		personManager.addPerson(new Person("A name", 2, "worker"));

		personManager.addCat("A name", new Cat("kitten", 1, "black"));
		personManager.addCat("A name", new Cat("cat", 2, "red"));
		personManager.addCat("A name", new Cat("old cat", 20, "grey"));

		personManager.findPersonByName("A name").findCatByName("old cat").speak();

//		personManager.findPersonByName("A name")
//				.removeCat(personManager.findPersonByName("A name").findCatByName("old cat"));

		personManager.removeCat("A name", "old cat");

		// testing name not found
		personManager.removeCat("C name", "old cat");
		personManager.removeCat("A name", "very old cat");

		personManager.addPerson(new Person("B name", 2, "dogo owner"));

		personManager.findPersonByName("B name").addDog(new Dog("a", 1, "blue"));
		personManager.findPersonByName("B name").addDog(new Dog("B", 2, "Red"));

		personManager.findPersonByName("B name").removeDog(personManager.findPersonByName("B name").findDogByName("B"));

		personManager.findPersonByName("B name").findDogByName("B").speak();

		personManager.print();

		return;
	}
}
