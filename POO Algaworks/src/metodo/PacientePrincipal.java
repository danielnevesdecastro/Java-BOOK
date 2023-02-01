package metodo;

public class PacientePrincipal {
	public static void main(String[] args) {
		Paciente p1 = new Paciente();
		p1.peso = 20.5;
		p1.altura = 1.75;
		
		IMC imc = p1.calcularIMC();
		
		
		System.out.println("Abaixo do peso ideal: "
		+ imc.abaixoDoPesoIdeal);
		System.out.println("Peso ideal: " + imc.pesoIdeal);
		System.out.println("Obeso: " + imc.obeso);
		System.out.println("Grau de obesidade: " + imc.grauObesidade);
	}
}
