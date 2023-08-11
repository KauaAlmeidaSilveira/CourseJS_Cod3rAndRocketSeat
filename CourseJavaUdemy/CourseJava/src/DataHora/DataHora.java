package DataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DataHora {

	public static void main(String[] args) {
		
		// ttps://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

		/*
		 * LocalDate - Data
		 * LocalDateTime - Data e Tempo
		 * Instant - Data, Tempo e o Fuso
		*/
		
		LocalDate d01 = LocalDate.now(); //Data
		LocalDateTime d02 = LocalDateTime.now(); //DataTempo
		Instant d03 = Instant.now(); //DataTempoFuso do GMT/UTC - Londres
		
		LocalDate d04 = LocalDate.parse("2023-08-05");
		LocalDateTime d05 = LocalDateTime.parse("2023-08-05T18:14:39");
		Instant d06 = Instant.parse("2023-08-05T18:14:39Z");
		Instant d07 = Instant.parse("2023-08-05T18:14:39-03:00");
		
		LocalDate d08 = LocalDate.parse("05/08/2023", fmt1);
		LocalDateTime d09 = LocalDateTime.parse("05/08/2023 22:36", fmt2);
		
		LocalDate d10 = LocalDate.of(2023, 8, 5);
		LocalDateTime d11 = LocalDateTime.of(2023, 8, 5, 22, 40);
		
		System.out.println("D01 = " + d01 + "\n");
		System.out.println("D02 = " + d02 + "\n");
		System.out.println("D03 = " + d03 + "\n");

		System.out.println("D04 = " + d04 + "\n");
		System.out.println("D05 = " + d05 + "\n");
		System.out.println("D06 = " + d06 + "\n");
		System.out.println("D07 = " + d07 + "\n");
		
		System.out.println("D08 = " + d08 + "\n");
		System.out.println("D09 = " + d09 + "\n");
		
		System.out.println("D10 = " + d10 + "\n");
		System.out.println("D11 = " + d11 + "\n");
		
		
	}

}
