import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class ExercTestePerformance {
	
	public static void main(String[] args) {
		System.out.println("Inicio");
		
		Collection<Integer> teste = new HashSet();
		long inicio = System.currentTimeMillis();
		long fim;
		long tempo;
		int total = 30000;
		
		for (int i = 0; i < total; i++) {
			teste.add(i);
		}
		
		for (int i = 0; i < total; i++) {
			teste.contains(i);
		}
		
		fim = System.currentTimeMillis();
		tempo = fim - inicio;
		System.out.println("Tempo gasto: " + tempo);
		
		// 723 com arraylist
		// 50 com hashset
	}

}
