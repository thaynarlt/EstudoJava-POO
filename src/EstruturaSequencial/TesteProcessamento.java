package EstruturaSequencial;

public class TesteProcessamento {
	public static void main(String[]args) {
		
		//Exemplo 1
		int x, y;
		x = 5;
		y = 2 * x;
		
		System.out.println(x);
		System.out.println(y);
		
		//Exemplo 2
		
		double b, B, h, area;
		b = 6.0;
		B = 8.0;
		h = 5.0;
		
		area = (b + B)/ 2.0 *h;
		
		System.out.println(area);
		
		//Exemplo 3
		
		int e, f;
		double resultado;
		
		e = 5;
		f = 2;
		
		resultado = (double) e/f; // (double) em parênteses é o casting!
		
		System.out.println(resultado);
		
		
	}
}
