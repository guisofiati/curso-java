public class Main {

	public static void main(String[] args) {
		
		double preco = 34.5;
		double desconto = (preco < 20.0) ? preco * 0.01 : preco * 0.05;
		
//		if (preco < 20.0) {
//			desconto = preco * 0.01;
//		} else {
//			desconto = preco * 0.05;
//		}
		System.out.println(desconto);
	}
}