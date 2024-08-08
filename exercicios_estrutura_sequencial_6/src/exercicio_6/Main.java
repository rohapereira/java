package exercicio_6;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		final double pi = 3.14159;
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		double areaTrianguloRetangulo = a * c / 2.0;
		double areaCirculo = pi * (Math.pow(c, 2.0));
		double areaTrapezio = (a + b) / 2.0 * c;
		double areaQuadrado = b * b;
		double areaRetangulo = a * b;
		
		System.out.printf("TRIANGULO: %.3f%n", areaTrianguloRetangulo);
		System.out.printf("CIRCULO: %.3f%n", areaCirculo);
		System.out.printf("TRAPEZIO: %.3f%n", areaTrapezio);
		System.out.printf("QUADRADO: %.3f%n", areaQuadrado);
		System.out.printf("RETANGULO: %.3f%n", areaRetangulo);
		
		sc.close();
	}

}
