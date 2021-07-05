package person;

import java.util.ArrayList;

public class PersonManager {

	ArrayList<Person> people = new ArrayList<>();

	public PersonManager() {

	}

	protected void addPerson(Person person) {
		this.people.add(person);
	}

	protected void removePerson(Person person) {
		this.people.remove(person);
	}

	protected void addCat(String owner, Cat cat) {
		Person person = findPersonByName(owner);
		person.addCat(cat);
	}

	protected void removeCat(String owner, String catName) {
		Person person = findPersonByName(owner);
		if (person == null) {
			System.out.println("owner not found");
			return;
		}
		Cat cat = person.findCatByName(catName);
		if (cat == null) {
			System.out.println("cat not found");
		}
		person.removeCat(cat);
	}

	protected Person findPersonByName(String person) {
		for (int i = 0; i < this.people.size(); i++) {
			if (this.people.get(i).name == person) {
				return this.people.get(i);
			}
		}

		return null;
	}

	protected void print() {

		for (Person i : people) {
			i.print();
		}
	}
}
