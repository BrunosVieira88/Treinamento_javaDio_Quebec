package Aboutme;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;
public class Aboutme {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		try {
			System.out.println("Digite seu nome");
			String nome = scanner.next();
			
			System.out.println("Digite seu nome");
			int idade = scanner.nextInt();
			
			System.out.println(nome);
		}catch(InputMismatchException e) {
			
			System.out.println("ESsa entrada nao é valida");
			
		}
		

	}

}
