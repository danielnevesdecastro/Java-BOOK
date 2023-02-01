package arrays;

public class Arrays {
	public static void main(String[] args) {
		// declra��o e instancia��o do array
		double[] pesoProdutos = new double[10];
		// atribuindo valor
		pesoProdutos[5] = 10;

		// declarando e atribuindo
		double[] pesoProdutos2 = { 2.2, 5, 7, 9 };

		System.out.println(pesoProdutos[1]);
		System.out.println(pesoProdutos[5]);
		System.out.println(pesoProdutos2[0]);

		// iterar array
		for (int i = 0; i < pesoProdutos.length; i++) {// length = saber tamanho do array
			System.out.println("�ndice:" + i + ": " + pesoProdutos[i]);

		}
		//interar usanmdo for each
		double total = 0;
		for (double peso2 : pesoProdutos2) {
			System.out.println(peso2);
			total += peso2;
		}
		System.out.println("total "+total+"\n\n");
	
		//Expandindo arrays
		double[] arrayEx = java.util.Arrays.copyOf(pesoProdutos, 20);
		arrayEx[19]=50;
		int cont = 0;
		for (double array : arrayEx) {
			System.out.print(cont+": ");
			System.out.println(array);
			cont++;
		}
		
	}
}
