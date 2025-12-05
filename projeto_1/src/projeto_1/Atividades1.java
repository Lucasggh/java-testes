package projeto_1;
import java.util.Locale;
import java.util.Scanner;

public class Atividades1 {
	
	static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) {
		Locale.setDefault(Locale.US);

		geometria();
		sc.close();
		//
	}
	
	
	private static void soma() {


		double Entrada1 = Double.parseDouble(sc.nextLine());
		double Entrada2 = Double.parseDouble(sc.nextLine());
		System.out.printf("SOMA = %.1f%n",Entrada1 + Entrada2);
	}
	private static void area() {
		double Entrada3 = Double.parseDouble(sc.nextLine());
		System.out.printf("A = %.4f%n",3.14159*Math.pow(Entrada3, 2));
	}
	private static void diferenca() {
		int Entrada1 = Integer.parseInt(sc.nextLine());
		int Entrada2 = Integer.parseInt(sc.nextLine());
		int Entrada3 = Integer.parseInt(sc.nextLine());
		int Entrada4 = Integer.parseInt(sc.nextLine());
		System.out.printf("DIFERENÇA = %d%n",Entrada1 * Entrada2 - Entrada3 * Entrada4);
		
	}
	private static void geometria() {
		double Entrada1 = Double.parseDouble(sc.nextLine());
		double Entrada2 = Double.parseDouble(sc.nextLine());
		double Entrada3 = Double.parseDouble(sc.nextLine());
		double triangulo = Entrada1 * Entrada3 / 2;
		double circulo = 3.14159*(Entrada3*Entrada3);
		double trapezio = (Entrada1 + Entrada2)*Entrada3/2;
		double quadrado = Entrada2*Entrada2;
		double retangulo = Entrada1*Entrada2;
		System.out.println(triangulo);
		System.out.println(circulo);
		System.out.println(trapezio);
		System.out.println(quadrado);
		System.out.println(retangulo);
	}
}
