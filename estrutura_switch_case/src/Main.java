import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero;
		String dia;
		
		System.out.print("Digite um numero de 1 a 7: ");
		numero = sc.nextInt();
		
		sc.close();
		
		switch (numero) {
			case 1:
				dia = "domingo";
				break;
			
			case 2: 
				dia = "segunda";
				break;
				
			case 3: 
				dia = "ter�a";
				break;
				
			case 4: 
				dia = "quarta";
				break;
				
			case 5: 
				dia = "quinta";
				break;
				
			case 6: 
				dia = "sexta";
				break;
				
			case 7:
				dia = "s�bado";
				break;
				
			default:
				dia = "valor inv�lido";
				break;
		}
		System.out.printf("O dia da semana �: %s", dia);
	}
}