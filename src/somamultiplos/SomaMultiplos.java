package somamultiplos;

import java.util.ArrayList;
import java.util.List;

public class SomaMultiplos {
    
	

	public int somaMultiplos(int x) {
        int soma = 0;
        List<Integer> lstNumMultiplos = new ArrayList<>();
        
        for (int i = 1; i < x; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                soma += i;
                lstNumMultiplos.add(i);                 
            }
        }
        System.out.println("Multíplos encontrados = " + lstNumMultiplos);
        return soma;
    }
}