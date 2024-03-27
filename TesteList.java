package pjAula7;

import java.util.ArrayList;
import java.util.List;

/* Classe de Modelagem Conceitual de Produto
 * @autor Caio Rodrigues da Silva
 * @data 26/03/2024
 */

public class TesteList {

	public static void main(String[] args) {

		List<Produto> lista = new ArrayList<Produto>();

		lista = Robo.gerarlista();

		/*
		 * System.out.println(lista.size()); long limite = 24_116_400_000l; long inicio
		 * = System.currentTimeMillis();
		 * 
		 * System.out.println("Tempo" + (System.currentTimeMillis() - inicio));
		 */

		for (Produto p : lista) {
			System.out.println("Codigo " + p.getCodigo() + "  Descricao " + p.getDescricao() + " Quantidade "
					+ p.getQuantidade() + (p.isStatus() ? " Ativo" : " Inativo"));

		}

		// avancado
		lista.stream().forEach(p -> System.out.println(p));
		lista.stream().filter(p -> p.getDescricao().contains("6")).forEach(p -> System.out.println(p));

	}
}
