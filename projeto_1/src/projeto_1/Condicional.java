package projeto_1;

import java.util.Scanner;

public class Condicional {
	static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) {
		double precoDollar = sc.nextDouble();
		double quatidade = sc.nextDouble();
		double resultado = CurrencyConverter.calcularDollar(precoDollar, quatidade);
		System.out.println(resultado);
		
		
		sc.close();
	}
	private static void calcHoras() {
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if (x > y) {
			System.out.printf("O jogo durou %d hora(s)",24-(x-y));
		}else if(x < y) {
			System.out.printf("O jogo durou %d hora(s)",(y-x));
		}else {
			System.out.println("24hrs");
		}
	}
	private static void numeros() {
		int x = sc.nextInt();
		int y = sc.nextInt();
	
		if (y % x == 0 || x % y == 0) {
			System.out.println("Multiplo");
		}else {
			System.out.println("Nao são multiplos");
		}
		if (x % 2 == 0) {
			System.out.println("Par");
		}else {
			System.out.println("Impar");
		}
		if (x > 0) {
			System.out.println("Positivo");
		}else if (x < 0) {
			System.out.println("Negativo");
		}else {
			System.out.println(0);
		}
	}
}
