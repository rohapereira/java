package exercicios_estrutura_condicional_1;

import java.util.Scanner;

//Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero inteiro: ");
		int a = sc.nextInt();
		
		if (a >= 0) {
			System.out.println("POSITIVO");
		}
		else {
			System.out.println("NEGATIVO");
		}
		
		sc.close();
	}

}
