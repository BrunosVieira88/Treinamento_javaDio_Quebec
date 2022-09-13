
public class Operacoes {
		
		public static void soma(double n1 , double n2) {
			
			double total = n1 +n2;
			System.out.println("A soma de "+n1+" + "+n2+" = "+total);
			
		}
		
		public static void subtracao(double n1 , double n2) {
			
			double total = n1 - n2;
			System.out.println("A subtracao de "+n1+" + "+n2+" = "+total);
			
		}

		public static void divisao(double n1 , double n2) {
			
			if(n2 != 0) {
				double total = n1 / n2;
				System.out.println("A divisao de "+n1+" + "+n2+" = "+total);
			}else {
				System.out.println( n2+" precisa ser diferente de Zero");
			}
			
		}

		public static void multiplicacao(double n1 , double n2) {
	
			double total = n1 * n2;
			System.out.println("A multiplicação de "+n1+" * "+n2+" = "+total);
			
		}
		
		
}


