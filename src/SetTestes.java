import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTestes {

	public static void main(String[] args) {
		Set<String> cargos = new HashSet<>();
		cargos.add("Gerente");
		cargos.add("Diretor");
		cargos.add("Presidente");
		cargos.add("Secret�ria");
		cargos.add("Funcion�rio");
		cargos.add("Diretor"); // repetido, nao vai ser inserido

		// imprime na tela todos os elementos
		System.out.println("Todo Set: " + cargos);

		for (String palavra : cargos) {
			System.out.println("La�o: " + palavra);
		}

		Iterator<String> i = cargos.iterator();

		while (i.hasNext()) {
			System.out.println("Um cargo: " + i.next());
		}
	}

}
