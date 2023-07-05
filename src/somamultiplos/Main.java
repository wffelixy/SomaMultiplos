package somamultiplos;

public class Main {

	public static void main(String[] args) {
       
		SomaMultiplos objSoma = new SomaMultiplos();
		
		int x = 10;
        int resultado = objSoma.somaMultiplos(x);
        
        System.out.println("A soma dos múltiplos de 3 ou 5 até " + x + " é: " + resultado);
    }
}
