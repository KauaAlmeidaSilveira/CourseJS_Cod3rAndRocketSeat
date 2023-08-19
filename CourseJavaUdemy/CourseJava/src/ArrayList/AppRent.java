package ArrayList;

import java.util.Locale;
import java.util.Scanner;

import Model.Entities.People;
import Model.Entities.Room;

public class AppRent {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Room[] rooms = new Room[10];
		
		System.out.printf("How many rooms will be rented?");
		int roomsRented = sc.nextInt();
		
		for(int i = 0; i<roomsRented; i++) {
			System.out.printf("%nRent #%d:%n", (i+1));
			sc.nextLine();
			System.out.printf("Name: ");
			String nome = sc.nextLine();
			System.out.printf("Email: ");
			String email = sc.nextLine();
			System.out.printf("Room: ");
			int numRoom = sc.nextInt();
			
			People people = new People(nome, email);
			
			rooms[numRoom-1] = new Room(people, numRoom);
		}
		
		System.out.printf("%nBusy rooms: %n");
		
		for(int i = 0; i<rooms.length; i++) {
			if(rooms[i] != null) {
				rooms[i].showInfoRoom();
			}
		}
		
		sc.close();
	}

}
