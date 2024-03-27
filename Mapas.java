package pjAula7;

import java.util.HashMap;
import java.util.Map;

public class Mapas {
	public static void main(String[] agrs) {
		Map<Integer, Produto> mapa = new HashMap<Integer, Produto>();

		for (Produto p : Robo.gerarlista()) {
			mapa.put(p.getCodigo(), p);
		}

		System.out.println(mapa.get(12) != null ? mapa.get(12) : " Nao localizado");

	}
}
