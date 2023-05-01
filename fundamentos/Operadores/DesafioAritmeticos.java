package fundamentos.Operadores;

public class DesafioAritmeticos {
	public static void main(String[] args) 
	{
		//int a = 2 + 8 * 2;
		//int b = (int) Math.pow(a, 2);
		
		//System.out.println(b);
		
		
		
	// Primeira Conta
	int a  = 6*(3+2);
	int aq = (int) Math.pow(a, 2);
	int b = 3*2;
	int c = aq/b;
	
	System.out.println(c);
	
	// Segunda Conta
	int a2 = (1-5) * (2-7);
	int b2 = 2;
	int c2 = a2 / b2;
	int cq = (int) Math.pow(c2, 2);

	System.out.println(cq);
	
	// Terceira Conta
	int a3 = c - cq;
	
	int b3 = 10; 
	
	// Quarta Conta < FINAL >
	int a4 = (int) Math.pow(a3, 3);
	int b4 = (int) Math.pow(b3, 3);
	int c5 = a4 / b4;
	
	System.out.println(c5);
		
		
		
		
		
		
		
		
	}
}
