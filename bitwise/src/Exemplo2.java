import java.util.Scanner;

public class Exemplo2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 89 tem o 6 dígito falso (0101 1001)
		// 24 tem o 6 dígito falso (0001 1000)
		// 113 tem o 6 dígito verdadeiro (0111 0001)
		
		int mask = 0b100000;
		int n = sc.nextInt();
		
		if ((n & mask) != 0) {
			System.out.println("O 6 dígito é verdadeiro");
		} else {
			System.out.println("O 6 dígito é falso");
		}
		
		sc.close();
	}
}