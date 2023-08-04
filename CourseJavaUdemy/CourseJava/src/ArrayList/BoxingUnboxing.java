package ArrayList;

public class BoxingUnboxing {

	public static void main(String[] args) {
		
		int x = 20;
		
		Object obj = x;
		
		System.out.println(obj);

		int y = (int) obj;
		
		System.out.println(y);
		
		// WrapperClasses - Integer, Double, Boolean... - A utilizamos para evitar esse tipo de problema,
		// para evitar o casting.
		
		// Por que é recomendado utilizar wrapperClass em entidades ? Porque quando a utilizamos em entidades,
		// é aceito naturalmente o valor null. 
		
	}

}
