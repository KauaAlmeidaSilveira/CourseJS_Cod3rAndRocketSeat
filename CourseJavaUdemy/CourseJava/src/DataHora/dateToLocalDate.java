package DataHora;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class dateToLocalDate {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat formatLocalDate = new SimpleDateFormat("yyyy-MM-dd");
		
		System.out.println("Enter date: (DD/MM/YYYY)");
		Date date = formatDate.parse(sc.nextLine());
				
		System.out.println(date);
		
		LocalDate localDate = LocalDate.parse(formatLocalDate.format(date));
		
		System.out.println(localDate);
		System.out.println(localDate.getMonthValue());
		
		sc.close();
	}

}
