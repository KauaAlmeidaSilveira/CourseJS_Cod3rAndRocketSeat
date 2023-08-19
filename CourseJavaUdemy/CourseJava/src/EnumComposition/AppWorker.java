package EnumComposition;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import Model.Entities.Department;
import Model.Entities.HourContract;
import Model.Entities.Worker;
import Model.Enums.WorkerLevel;

public class AppWorker {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Enter department's name: ");
		String department = sc.nextLine();
		
		System.out.println("Enter worker data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Level: ");
		String level = sc.nextLine();
		System.out.print("Base salary: ");
		Double baseSalary = sc.nextDouble();
		
		Worker worker = new Worker(name, WorkerLevel.valueOf(level), baseSalary, new Department(department));
		
		System.out.print("How many contracts to this worker? ");
		int numContracts = sc.nextInt();
		
		for(int i = 1; i<=numContracts; i++) {
			System.out.printf("Enter contract #%d data:%n", i);
			System.out.print("Date (DD/MM/YYYY): ");
			Date date = sdf1.parse(sc.next());
			System.out.print("Value per hour: ");
			double vlrPerHour = sc.nextDouble();
			System.out.print("Duration (hours): ");
			int hours = sc.nextInt();
			
			HourContract contract = new HourContract(date, vlrPerHour, hours);
			worker.addContract(contract);
		}
		
		sc.nextLine();
		System.out.print("Enter month and year to calculate income: ");
		Date date = sdf1.parse("01/" + sc.nextLine());
		
		SimpleDateFormat formatLocalDate = new SimpleDateFormat("yyyy-MM-dd");
		
		LocalDate localDate = LocalDate.parse(formatLocalDate.format(date));
		int month = localDate.getMonthValue();
		int year = localDate.getYear();
		
		System.out.printf("Name: %s%n"
						+ "Department: %s%n", worker.getName(), worker.getDepartment());
		
		System.out.printf("Income for %s: %.2f", sdf1.format(date), worker.income(year, month));
		
		sc.close();
	} 

}
