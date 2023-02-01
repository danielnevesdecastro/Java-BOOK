package arrays;

public class ArrayObjetos {
	public static void main(String[] args) {
		VagaEmprego[] vagasPublicadas = new VagaEmprego[3];
		
		// instancia a vaga e depois atribui ao array
		VagaEmprego vaga = new VagaEmprego();
		vaga.titulo = "Programador Java";
		vaga.salario = 80000;
		vagasPublicadas[0] = vaga;
		// instancia e atribui a vaga ao array ao mesmo tempo
		vagasPublicadas[2] = new VagaEmprego();
		vagasPublicadas[2].titulo = "Web designer";
		vagasPublicadas[2].salario = 65000;
		
		//Percorrendo o array
		for (int i = 0; i < vagasPublicadas.length; i++) {
			if (vagasPublicadas[i] != null) {//previnir das referencias nulas 
			System.out.println(vagasPublicadas[i].titulo + " = "
			+ vagasPublicadas[i].salario);
			}
	}
}
}