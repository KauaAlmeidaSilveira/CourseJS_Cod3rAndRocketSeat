package Entities;

public class Room {

	private int num;
	private People people;

	public Room(){}
	
	public Room(People people) {
		this.people = people;
	}

	public People getPeople() {
		return people;
	}

	public void setPeople(People people) {
		this.people = people;
	}

}
