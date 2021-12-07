
public class Main {

	public static void main(String[] args) {

		/*
		 * 89 (0101 1001)
		 * 60 (0011 1100)
		 * 
		 * &: (0001 1001)  (24)
		 * |: (0111 1101) (125)
		 * ^: (0110 0101) (101)
		 * 
		*/
		
		int n1 = 89;
		int n2 = 60;
		
		System.out.println(n1 & n2);
		System.out.println(n1 | n2);
		System.out.println(n1 ^ n2);
	}
}