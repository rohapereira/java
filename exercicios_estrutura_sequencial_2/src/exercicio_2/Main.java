package exercicio_2;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		final double pi = 3.14159;
		double raio = sc.nextDouble();
		
		double area = pi * (Math.pow(raio, 2.0));
		
		System.out.printf("AREA = %.4f%n", area);
		
		sc.close();
	}

}
