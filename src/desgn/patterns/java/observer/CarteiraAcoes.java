package desgn.patterns.java.observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CarteiraAcoes {
	private Map<String, Integer> acoes = new HashMap<>();
	
	/**
	 *  A lista obs é a representação de todos os objetos que possuiem 
	 *  interesse em objser o obj CarteiraAcoes.
	 */
	private List<Observador> obs = new ArrayList<>();

	public void adicionaAcoes(String acao, Integer qtd) {
		if (acoes.containsKey(acao)) {
			qtd += acoes.get(acao);
		}
		acoes.put(acao, qtd);
		/**
		 * Observe que toda vez que é adionado uma ação
		 *  o metodo executa o metodo notificar 
		 **/
		notificar(acao, qtd);
	}

	
	private void notificar(String acao, Integer qtd) {
		/*
		 * todos os Observadores que estão observando a classe CarteiraAcoes
		 * vão ser notificados que foram incluídos novas ações
		 * */
		for (Observador o : obs)
			o.mudancaQuantidade(acao, qtd);
	}

	public void addObservador(Observador o) {
		obs.add(o);
	}
}
