
public class Main {

	public static void main(String[] args) {

		System.out.println("Operações");
		Operacoes.soma(2,2);
		Operacoes.subtracao(2,2);
		Operacoes.divisao(2,2);
		Operacoes.multiplicacao(5,2);
		
		System.out.println("Mensagem!");
		HoraAtendimento.mensagem(8);
		HoraAtendimento.mensagem(13);
		HoraAtendimento.mensagem(21);
		
		System.out.println("Parcelas!");
		
		System.out.println("o valor da parcela é igual a " + valorJuros.valorParcela(1500,2));
		System.out.println("o valor da parcela é igual a " + valorJuros.valorParcela(1500,3));
		System.out.println("o valor da parcela é igual a " + valorJuros.valorParcela(1500,4));
		
		
		
	
	}

}
