import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String a;
		
		a = sc.next();
		
		System.out.println("Você digitou: " + a);
		System.out.println();
		System.out.println("**********************");
		
		int b;
		
		b = sc.nextInt();
		
		System.out.println("Você digitou: " + b);
		System.out.println();
		System.out.println("**********************");
		
		double c;
		
		c = sc.nextDouble();
		
		System.out.println("Você digitou: " + c);
		System.out.println();
		System.out.println("**********************");
		
		char d;
		
		d = sc.next().charAt(0);
		
		System.out.println("Você digitou: " + d);
		System.out.println();
		System.out.println("**********************");
		
		String x;
		int y;
		double z;
		
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		
		System.out.println("Entradas digitadas:");
		System.out.println();
		System.out.println(x);
		System.out.println(y);
		System.out.printf("%.2f%n", z);
		System.out.println();
		System.out.println("**********************");
		
		String a1, a2, a3;
		
		sc.nextLine();
		a1 = sc.nextLine();
		a2 = sc.nextLine();
		a3 = sc.nextLine();
		
		System.out.println("Entradas digitadas:");
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println();
		System.out.println("**********************");
		
		int c1;
		String b1, b2, b3;
		
		c1 = sc.nextInt();
		sc.nextLine();
		b1 = sc.nextLine();
		b2 = sc.nextLine();
		b3 = sc.nextLine();
		
		System.out.println("Entradas digitadas:");
		System.out.println(c1);
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println();
		System.out.println("**********************");
		
		sc.close();
	}
}