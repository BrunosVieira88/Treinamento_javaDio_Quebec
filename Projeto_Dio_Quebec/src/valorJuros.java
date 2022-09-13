
public class valorJuros {
	
	public static double duasParcelas() {
		
		return 0.05; 
	}
	
	public static double tresPArcelas() {
			
		return 0.1; 
	}

	public static double maisPArcelas() {
			
		return 0.25; 
	}
	
	public static double valorParcela(double n1 , int n2) {

		
		if(n2 == 2) {
			double juros = n1 * duasParcelas();
			System.out.println("juros de "+juros);
			return (n1+juros)/n2;
			
		}else if(n2 == 3) {
			double juros = n1 * tresPArcelas();
			System.out.println("juros de "+juros);
			return (n1+juros)/n2;
		}
		
		double juros = n1 * maisPArcelas();
		System.out.println("juros de "+juros);
		return (n1+juros)/n2;
		
		
		
	}

}
