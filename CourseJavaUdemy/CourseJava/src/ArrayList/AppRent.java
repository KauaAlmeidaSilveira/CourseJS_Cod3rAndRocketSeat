package ArrayList;

import java.util.Locale;
import java.util.Scanner;

import Entities.Room;

public class AppRent {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.printf("How many rooms will be rented?");
		int roomsRented = sc.nextInt();
		
		Room[] rooms = new Room[roomsRented];
		
		
		
		sc.close();
	}

}
