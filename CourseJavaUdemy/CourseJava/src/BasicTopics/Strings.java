package BasicTopics;

public class Strings {

	public static void main(java.lang.String[] args) {
		
		String original = "abcde FGHIJ ABC abc DEFG   ";
		
		System.out.println("Original: -" + original + "-");	
		
		String s1 = original.toLowerCase();
		String s2 = original.toUpperCase();
		System.out.println("toLowerCase: -" + s1 + "-");		
		System.out.println("toUpperCase: -" + s2 + "-");

		String s3 = original.trim(); // Remove os espaços no fim
		System.out.println("trim: -" + s3 + "-");	
		
		String s4 = original.substring(2); // Começa 2 caracteres depois da string
		String s5 = original.substring(2, 9); // Começa 2 caracteres depois da string e para no 9º caracter
		System.out.println("substring(2): -" + s4 + "-");		
		System.out.println("substring(2, 9): -" + s5 + "-");	
		
		String s6 = original.replace("a", "x");
		String s7 = original.replace("abc", "xy");
		System.out.println("replace('a', 'x'): -" + s6 + "-");
		System.out.println("replace('abc', 'xy'): -" + s7 + "-");
		
		int x = original.indexOf("bc");
		int y = original.lastIndexOf("bc");
		System.out.println("Index of 'bc': " + x);
		System.out.println("Last index of 'bc': " + y);
		
		String[] nomes = s3.split(" "); 
		
		for(int i = 0; i < nomes.length; i++) {
			System.out.println(nomes[i]);
		}

	}

}
