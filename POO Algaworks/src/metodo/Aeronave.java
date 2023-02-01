package metodo;

public class Aeronave {

	int totalAssentosNormais;
	int totalAssentosEspeciais;
	int assentosNormaisReservados;
	int assentosEspeciaisReservados;

	void reservarAssentos(int assentos) {
		// objeto this, atribui o valor da
		// variável local a variável de instância
		this.assentosNormaisReservados += assentos;
	}
	//Sobrecarga de métodos , mesmo nome , asssinatura diferente (tipo argumentos)
	void reservarAssentos(int assentosNormais, int assentosEspeciais) {
		this.assentosNormaisReservados += assentosNormais;
		this.assentosEspeciaisReservados += assentosEspeciais;
	}
	int calcularAssentosDisponiveis() {
		return totalAssentosNormais - assentosNormaisReservados + totalAssentosEspeciais - assentosEspeciaisReservados;
	}

	void alterarTotalAssentosNormais(int totalAssentosNormais) {
		this.totalAssentosNormais = totalAssentosNormais;
	}
	void alterarTotalAssentosReservados(int totalAssentosEspeciais) {
		this.totalAssentosEspeciais = totalAssentosEspeciais;
	}
}
