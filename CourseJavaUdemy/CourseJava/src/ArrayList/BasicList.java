package ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BasicList {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Kaua");
		list.add("Ana");
		list.add("Bob");
		list.add("Leandro");
		
		list.forEach((itemName) -> {
			System.out.println(itemName);
		});
		
		System.out.println("-------------------");

		list.remove(0);
		
		list.removeIf((name) -> name.charAt(0) == 'B');
		
		list.forEach((itemName) -> {
			System.out.println(itemName);
		});
		
		System.out.println("-------------------");
		
		System.out.println("Index of Ana: " + list.indexOf("Ana"));
		
		if(list.indexOf("Leandro") == -1) {
			System.out.println("User not Founded!");
		}else {
			System.out.println("Index of Leandro: " + list.indexOf("Leandro"));
		}
		
		System.out.println("-------------------");
		
		List<String> nomesQueComecaComA = list.stream().filter((name) -> name.charAt(0) == 'A').toList();
		
		nomesQueComecaComA.forEach((itemName) -> {
			System.out.println(itemName);
		});
		
		System.out.println("-------------------");
		
		String primeiroNome = list.stream().filter((name) -> name.charAt(0) == 'L').findFirst().orElse(null);
		
		System.out.println(primeiroNome);
		
		
		sc.close();
	}

}
