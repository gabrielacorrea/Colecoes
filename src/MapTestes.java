import java.util.HashMap;
import java.util.Map;


public class MapTestes {
	
	public static void main(String[] args) {
		
		Map<String, Double> mapaProdutos = new HashMap<>();
		mapaProdutos.put("Bebidas", 10.90);
		mapaProdutos.put("Comidas", 9.85);
		mapaProdutos.put("Higiene", 7.20);
		
		System.out.println(mapaProdutos.keySet()); // chaves do mapa
		System.out.println(mapaProdutos.values()); // valores que foram associados
		
		
	}

}
