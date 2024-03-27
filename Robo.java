package pjAula7;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/* Classe de Modelagem Conceitual de Produto
 * @autor Caio Rodrigues da Silva
 * @data 26/03/2024
 */

public class Robo {
	public static List<Produto> gerarlista() {
		List<Produto> listaGerada = new ArrayList<Produto>();
		int posicoes = new Random().nextInt(10_000);

		long inicio = System.currentTimeMillis();

		for (int i = 0; i < posicoes; i++) {
			Produto p = new Produto();
			p.setCodigo(i);
			p.setDescricao("Produto " + i);
			p.setQuantidade(new Random().nextFloat());
			p.setStatus(true);

			listaGerada.add(p);
		}
		System.out.println("Levou " + (System.currentTimeMillis() - inicio));

		return listaGerada;
	}
}
