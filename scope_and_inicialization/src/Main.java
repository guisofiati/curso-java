
public class Main {

	public static void main(String[] args) {

//		Vai dar erro pois o if pode ser pulado e não vai poder imprimir o discount
//
//		double price = 400.00;
//		double discount;
//		
//		if (price < 200.00) {
//			discount = 10.0;
//		}
//		
//		System.out.println(discount);
//
// *************************************
//		Vai dar erro pois discount esta declarado no escopo do if
//
//		double price = 400.00;
//		
//		if (price < 200.00) {
//			double discount = 10.0;
//		}
//		
//		System.out.println(discount);
		
		double price = 400.00;
		double discount;
		
		if (price < 200.00) {
			discount = 10.00;
		} else {
			discount = 5.00;
		}
		
		System.out.println(discount);
	}
}