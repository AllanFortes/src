package fundamentos;

import java.util.Scanner;
public class DesafioConversao {
	public static void main(String[] args) {
		
		 Scanner converter = new Scanner(System.in);
		 
		 System.out.print("Salario 1: ");
		 String salario1 = converter.nextLine().replace(",", ".");
		 System.out.print("Salario 2: ");
		 String salario2 = converter.nextLine().replace(",", ".");
		 System.out.print("Salario 3: ");
		 String salario3 = converter.nextLine().replace(",", ".");
		 
		 double s1 = Double.parseDouble(salario1);
		 double s2 = Double.parseDouble(salario2);
		 double s3 = Double.parseDouble(salario3);
		 
		 double soma = s1+s2+s3;
		 System.out.println("A soma dos salarios e " +soma);
		 
		 double media = soma/3;
		 System.out.print("A media do salario e " +media);
		 
		 converter.close();
	}
	
}
