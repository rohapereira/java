package exercicio_7;

import java.util.Locale;
import java.util.Scanner;

/*
Fazer um programa para ler as duas notas que um aluno obteve no primeiro e segundo semestres de uma disciplina anual.
Em seguida, mostrar a nota final que o aluno obteve no ano juntamente com um texto explicativo.
Caso a nota do aluno seja inferior a 60.00, mostrar a mensagem "REPROCADO".
Todos os valores devem ter uma casa decimal.
*/

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double nota1 = sc.nextDouble();
		double nota2 = sc.nextDouble();
		
		double notaFinal = nota1 + nota2;
		
		System.out.printf("NOTA FINAL = %.1f%n", notaFinal);
		
		if (notaFinal < 60.0) {
			System.out.println("REPROVADO");
		}
		
		sc.close();
	}

}
