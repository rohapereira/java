package exercicios_estrutura_condicional_5;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o codigo do item: ");
		int cod = sc.nextInt();
		
		System.out.println("Digite a quantidade do item: ");
		int qtd = sc.nextInt();
		
		double total;
		if (cod == 1) {
			total = qtd * 4.00;
		}
		else if (cod == 2) {
			total = qtd * 4.50;
		}
		else if (cod == 3) {
			total = qtd * 5.00;
		}
		else if (cod == 4) {
			total = qtd * 2.00;
		}
		else {
			total = qtd * 1.50;
		}
		
		System.out.printf("Total = R$ %.2f%n", total);
		
		sc.close();
	}

}
