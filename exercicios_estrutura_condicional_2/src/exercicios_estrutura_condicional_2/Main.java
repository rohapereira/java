package exercicios_estrutura_condicional_2;

import java.util.Scanner;

//Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero inteiro: ");
		int a = sc.nextInt();
		
		if (a % 2 == 0) {
			System.out.println("PAR");
		}
		else {
			System.out.println("IMPAR");
		}
		
		sc.close();
	}

}
