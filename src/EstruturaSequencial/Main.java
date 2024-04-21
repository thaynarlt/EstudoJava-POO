package EstruturaSequencial;

import java.util.Locale;


public class Main {
	public static void main(String[]args) {
		
		System.out.println("Olá mundo!"); //println possui quebra de linha
		System.out.println("Bom dia!");
		
		
		int y = 32;
		System.out.println(y);
		
		double x = 10.35784;
		System.out.println(x);
		//para controlar as casas decimais e ainda arrendondou o número:
		
		//Locale.setDefault(Locale.US); // para definir a linguagem para inglês
		System.out.printf("%.2f\n", x);	//2 casas decimais
		
		//Concatenação:
		System.out.println("RESULTADO =" + x + " METROS");
		
		System.out.printf("RESULTADO = %.2f metros%n", x);
		
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
		
	} 
		
}
