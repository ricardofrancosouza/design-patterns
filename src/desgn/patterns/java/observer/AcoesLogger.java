package desgn.patterns.java.observer;

public class AcoesLogger implements Observador {
	public void mudancaQuantidade(String acao, Integer qtd) {
		System.out.println("Alterada a quantidade da a��o " + acao + " para " + qtd);
	}
}
