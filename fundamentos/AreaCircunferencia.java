package fundamentos;

public class AreaCircunferencia {
	public static void main(String[] args) {
		double raio = 3.4;
		final double PI = 3.14159; /*FINAL SERVE PARA NÃO HAVER ALTERAÇÃO NO ALGORÍTIMO.
		O PI N PODE SER MUDADO*/
		double area = PI*raio*raio;
		//double alfa = 3.4; (double é utilizado para números flutuantes)
		System.out.println(area);
		
		raio = 10;
		area = PI*raio*raio;
		System.out.println("Area = " +area+"m2.");
	}
}
