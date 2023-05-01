package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		System.out.println("Olá pessoal".charAt(4));
		
		String s = "Boa tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.toUpperCase().endsWith("TARDE"));
		System.out.println(s.length());
		System.out.println(s.toLowerCase().equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 15;
		var salario = 12345.987;
		
		System.out.println(
				"Nome: " + nome + 
				"\nSobrenome: " +sobrenome +
				"\nIdade: " +idade + 
				"\nSalario: " +salario + "\n\n");
		
		System.out.printf("O senhor %s  %s "
				+ "tem %d anos de idade"
				+ " e ganha R$%.2f por ano\n\n"
				, nome
				, sobrenome
				, idade
				, salario);
		
		
		String frase = String.format("O senhor %s  %s "
				+ "tem %d anos de idade"
				+ " e ganha R$%.2f por ano"
				, nome
				, sobrenome
				, idade
				, salario);
		
		System.out.println(frase);
		
		
		System.out.println("Frase Qualquer".contains("Qual"));
		System.out.println("Frase Qualquer".indexOf("Qual"));
		System.out.println("Frase Qualquer".substring(6,10));
	}
}
