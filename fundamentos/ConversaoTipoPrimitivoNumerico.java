package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	public static void main(String[] args) {
		
		double a = 1; //implicita
		System.out.println(a);
		
		float b = (float) 1.12345; //explicita (CAST)
		System.out.println(b);
		
		int c = 340;
		byte d = (byte) c; //explicita (CAST)
		System.out.println(d);
		
		double e = 1;
		int f = (int) e; //explicita (CAST)
		System.out.println(f);
		
		
		
		
		
		
		
		
	}
}