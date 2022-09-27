package Aboutme;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemplosLista {
	public static void main(String[] args) {
		List<Double> notas = new ArrayList<>();
		notas.add(1.9);
		notas.add(2.9);
		notas.add(3.9);
		notas.add(4.9);
		notas.add(5.9);
		notas.add(6.9);
		notas.add(7.9);
		notas.add(8.9);
		
		System.out.println(notas.toString());
		System.out.println(notas.get(1));
		notas.add(0,2.0);
		System.out.println(notas.toString());
		System.out.println("a menor nota da coleção é "+ Collections.min(notas));
		System.out.println("a maior nota da coleção é "+ Collections.max(notas));
		
		System.out.println("Fazendo uma soma com java ");
		
		Iterator<Double> proximo = notas.iterator();
		Double total =0d;
		
		while(proximo.hasNext()) {
			total  += proximo.next();
		}
		System.out.println(String.format("%.2f", total));
		System.out.println("A media das notas sao " +String.format("%.2f",total/notas.size()));
		//notas.remove();
		//Apagar toda a lista
		//notas.clear();
		System.out.println(notas.isEmpty() ? "A lista esta vazia" : "A lista não esta vazia"); 
		 
			
		
		
		

		
	}
	
}
