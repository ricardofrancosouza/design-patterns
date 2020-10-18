package desgn.patterns.java.observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CarteiraAcoes {
	private Map<String, Integer> acoes = new HashMap<>();
	
	/**
	 *  A lista obs � a representa��o de todos os objetos que possuiem 
	 *  interesse em objser o obj CarteiraAcoes.
	 */
	private List<Observador> obs = new ArrayList<>();

	public void adicionaAcoes(String acao, Integer qtd) {
		if (acoes.containsKey(acao)) {
			qtd += acoes.get(acao);
		}
		acoes.put(acao, qtd);
		/**
		 * Observe que toda vez que � adionado uma a��o
		 *  o metodo executa o metodo notificar 
		 **/
		notificar(acao, qtd);
	}

	
	private void notificar(String acao, Integer qtd) {
		/*
		 * todos os Observadores que est�o observando a classe CarteiraAcoes
		 * v�o ser notificados que foram inclu�dos novas a��es
		 * */
		for (Observador o : obs)
			o.mudancaQuantidade(acao, qtd);
	}

	public void addObservador(Observador o) {
		obs.add(o);
	}
}
