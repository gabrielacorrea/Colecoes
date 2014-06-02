import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListTestes {

	public static void main(String[] args) {
		List<String> lista = new ArrayList<>();
		lista.add("Manoel");
		lista.add("Joaquim");
		lista.add("Maria");

		System.out.println(Math.random());
		System.out.println("Lista=" + lista);
		System.out.println("Maior elemento=" + Collections.max(lista));
		Collections.sort(lista);
		System.out.println("Lista ordenada=" + lista);
		
		for(String x : lista) {
			System.out.println("->" + x);
		}
		
		ComparadorPorTamanho comparador = new ComparadorPorTamanho();
		int z = comparador.compare("a", "aio");
		Collections.sort(lista, comparador);
		System.out.println("compa=" + lista);
		System.out.println("aaa=" + z);
	}
}
