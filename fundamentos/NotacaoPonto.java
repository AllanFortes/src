package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		
		String S = "Bom dia X";
		S = S.replace("X", "Senhora");
		S = S.toUpperCase();
		S = S.concat("!!!");
		
		System.out.println(S);
		
		String x = "Leo".toUpperCase();
		System.out.println(x);
		
		String y = "Bom dia X"
				.replace("X", "Gui")
				.toUpperCase()
				.concat("!!!");
				System.out.println(y);
				
		// Tipos primitivos não tem o operador "."
		int a = 3;
		System.out.println(a);
		
		
		
		
		
		
		
	}
}
