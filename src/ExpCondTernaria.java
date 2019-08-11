/*Expressão Condicional Ternária*/

public class ExpCondTernaria{
	public static void main(String[] args) {
		double preco = 10.00;
		double desconto = preco < 20.00 ? preco * 0.1 : preco * 0.05;
		
		double Total = preco - desconto;
		
		System.out.printf("Desconto = R$ %.2f%n", desconto);
		System.out.printf("Total = R$ %.2f", Total);
		
	}
}