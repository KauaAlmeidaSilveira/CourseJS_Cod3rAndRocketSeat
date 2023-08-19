package TratandoExceptions;

import Model.Entities.Reservation;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AppReservation {
    public static void main(String[] args) {

        try{
            DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

            Scanner sc = new Scanner(System.in);

            System.out.print("Room number: ");
            int roomNumber = sc.nextInt();

            sc.nextLine();
            System.out.print("Check-in: ");
            String checkIn = sc.nextLine();

            System.out.print("Check-out: ");
            String checkOut = sc.nextLine();

            Reservation reservation = new Reservation(roomNumber, LocalDate.parse(checkIn, fmt), LocalDate.parse(checkOut, fmt));

            System.out.println(reservation);

            System.out.println("Enter data to update the reservation: ");

            System.out.print("Check-in: ");
            String newCheckIn = sc.nextLine();

            System.out.print("Check-out: ");
            String newCheckOut = sc.nextLine();

            reservation.updateDates(LocalDate.parse(newCheckIn, fmt), LocalDate.parse(newCheckOut, fmt));

            System.out.println(reservation);

            sc.close();
        }catch (IllegalArgumentException e){
            System.out.println("Error in reservation: " + e.getMessage());
        }


    }
}
