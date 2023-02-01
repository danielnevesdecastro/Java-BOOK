package metodo;

public class AeronavePrincipal {
	public static void main(String[] args) {

		Aeronave gol = new Aeronave();
		gol.totalAssentosNormais = 100;

		Aeronave tam = new Aeronave();
		tam.totalAssentosNormais = 130;

		gol.reservarAssentos(10);
		tam.reservarAssentos(5);

		System.out.println("Assentos GOL: " + gol.calcularAssentosDisponiveis());
		System.out.println("Assentos TAM: " + tam.calcularAssentosDisponiveis());
	}
}
