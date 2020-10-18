package desgn.patterns.java.state;

import java.util.List;

public class Branco extends Cor {
	public void busca(No no, List<No> list) {
		/*
		 * Cria uma nova referencia e assim a cor branca sofre um 
		 * polimorfismo para cor cinza.
		 * Isso foi possivel porque a referencia da Cor Branca herda a mesma classe abstrata da cor Cinza
		 * assim elas possuem a mesma estrutur.
		 * */
		no.setCor(new Cinza(), list);
	}
}
