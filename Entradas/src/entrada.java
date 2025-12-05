import java.util.Locale;
import java.util.Scanner;

public class entrada {
	public static void main (String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		String x = sc.nextLine();
		String y = sc.nextLine();
		double x1 = Double.parseDouble(x);
		double y1 = Double.parseDouble(y);
		double raiz = Math.sqrt(Math.abs(x1));
		double expo = Math.pow(x1,2);
		System.out.println(raiz);
		System.out.println(expo);
		sc.close();
		
	}
}
