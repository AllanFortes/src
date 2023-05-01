package fundamentos;

public class temperatura {
	public static void main(String[] args) {
		// (ºF - 32) x 5/9 = ºc
		
		final int BETA = 32;
		final double CHARLIE = 5/9.0;
		
		double F = 78;
		double total = (F - BETA) * CHARLIE;
		System.out.println("A temperatura e de "+total+" graus celsius");
		
		F = 102;
		total = (F - BETA) * CHARLIE;
		System.out.println("A temperatura e de "+total+" graus celsius");
		
	}
}
