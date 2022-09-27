package Aboutme;
//Abaixo segue um exemplo de código que você pode ou não utilizar:

import java.io.IOException;
import java.util.Scanner;

public class Problem {
	
	public static void main(String[] args) throws IOException {
			
	  Scanner leitor = new Scanner(System.in);
	  
	  int codigo = leitor.nextInt();
      int unidades = leitor.nextInt();
      double valor1 = leitor.nextDouble();
      
      int codigo2 = leitor.nextInt();
      int unidades2 = leitor.nextInt();
      double valor2 = leitor.nextDouble();
      
      double resultado = (valor1*unidades)+(valor2*unidades2);
      System.out.printf("VALOR A PAGAR: R$ %.2f\n",resultado);
	 }
	
}