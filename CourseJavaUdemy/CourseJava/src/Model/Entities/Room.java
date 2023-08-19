package Model.Entities;

import java.io.PrintStream;

public class Room {

	private int numRoom;
	private People people;
	
	public Room(People people, int numRoom) {
		this.people = people;
		this.numRoom = numRoom;
	}

	public People getPeople() {
		return people;
	}

	public void setPeople(People people) {
		this.people = people;
	}

	public int getnumRoom() {
		return numRoom;
	}

	public PrintStream showInfoRoom() {
		return System.out.printf("%d: %s, %s%n", (numRoom), people.getNome(), people.getEmail());
	}

}
