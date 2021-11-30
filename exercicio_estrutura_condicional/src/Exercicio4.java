import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int duracao;
		
		System.out.println("Hora inicial");
		int horaInicial = sc.nextInt();
		System.out.println("Hora final");
		int horaFinal = sc.nextInt();
			
			//3				//16
		if (horaInicial < horaFinal) {
			duracao = horaFinal - horaInicial;		
		} else {
			duracao = 24 - horaInicial + horaFinal;
		}
		
		System.out.println("Duração: " + duracao);
		
		sc.close();
	}
}