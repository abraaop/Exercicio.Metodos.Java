package exerciciometodosjava;

public class Main {

	public static void main(String[] args) {
		System.out.println("Calculadora");
		Calculadora.soma(5, 5);
		Calculadora.subtracao(10, 5);
		Calculadora.multiplicacao(5, 5);
		Calculadora.divisao(15, 5);
		System.out.println("----------------------");
		System.out.println("Saudação!");
		Saudacao.mensagem(6);
		Saudacao.mensagem(15);
		Saudacao.mensagem(20);
		Saudacao.mensagem(27);
		System.out.println("----------------------");
		System.out.println("Empréstimo!");
		Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
		Emprestimo.calcular(2000, Emprestimo.getTresParcelas());
		Emprestimo.calcular(5000, 5);
		
	}

}
