package arrays;

public class ArrayMultidimensional {
	public static void main(String[] args) {
		//declarando array multi (matriz)
		String[][] locais = new String[3][];
		locais[0] = new String[3];
		locais[0][0] = "Uberl�ndia";
		locais[0][1] = "Uberaba";
		locais[0][2] = "Belo Horizonte";
		locais[1] = new String[1];
		locais[1][0] = "Rio de Janeiro";
		locais[2] = new String[2];
		locais[2][0] = "S�o Paulo";
		locais[2][1] = "Ribeir�o Preto";
		
		//declarando e atribuindo
		String[][] locais2 = {
				{ "Uberl�ndia", "Uberaba", "Belo Horizonte" },
				{ "Rio de Janeiro" },
				{ "S�o Paulo", "Ribeir�o Preto" }
				};
		locais2[2][1]="Jampa";
		//interando
		for (int i = 0; i < locais2.length; i++) {
			for (int j = 0; j < locais2[i].length; j++) {
			System.out.println("["+i+"."+j+"] - "+locais2[i][j]);
			}
			System.out.println();
			}
	}
}
