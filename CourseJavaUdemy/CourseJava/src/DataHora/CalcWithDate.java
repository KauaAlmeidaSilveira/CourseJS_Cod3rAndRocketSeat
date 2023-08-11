package DataHora;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class CalcWithDate {

	public static void main(String[] args) {
		
		LocalDate d04 = LocalDate.parse("2023-08-05");
		LocalDateTime d05 = LocalDateTime.parse("2023-08-05T18:14:39");
		Instant d06 = Instant.parse("2023-08-05T01:14:39Z");

		LocalDate pastWeekLocalDate = d04.minusDays(7);
		LocalDate nextWeekLocalDate = d04.plusDays(7);
		
		System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
		System.out.println("nextWeekLocalDate = " + nextWeekLocalDate);
		
		LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
		LocalDateTime nextWeekLocalDateTime = d05.plusHours(4);
		
		System.out.println("pastWeekLocalDateTime = " + pastWeekLocalDateTime);
		System.out.println("nextWeekLocalDateTime = " + nextWeekLocalDateTime);
		
		Instant pastWeekLocalDateInstant = d06.minus(7, ChronoUnit.DAYS);
		Instant nextWeekLocalDateInstant = d06.plus(7, ChronoUnit.DAYS);
		
		System.out.println("pastWeekLocalDateInstant = " + pastWeekLocalDateInstant);
		System.out.println("nextWeekLocalDateInstant = " + nextWeekLocalDateInstant);
		
		Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atStartOfDay());
		Duration t2 = Duration.between(pastWeekLocalDateTime, d05);
		Duration t3 = Duration.between(pastWeekLocalDateInstant, d06);
		Duration t4 = Duration.between(d06, pastWeekLocalDateInstant);
		
		System.out.println("t1 = " + t1.toDays());
		System.out.println("t2 = " + t2.toDays());
		System.out.println("t3 = " + t3.toDays());
		System.out.println("t4 = " + t4.toDays());
		
		LocalDate test = LocalDate.parse("2023-06-01");
		
		LocalDate testYear = test.plusYears(2);
		LocalDate testMonths = testYear.plusMonths(6);
		
		
		System.out.println(testMonths);
	}

}
