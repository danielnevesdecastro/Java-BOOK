package classe;

// Classe, que é um tipo/nao representa um tipo real , só como deve ser (objeto) 
public class Carro {
	// Atributos, variáveis de instância
	String fabricante;
	String modelo;
	String cor;
	String combustivel;
	int anoFabricacao;
	double valorMercado;
	// atributo que faz referencia a Classe proprietario;
	// Composição de objetos
	// = valor padrão pra evitar Null Pointer excepetion
	Proprietario dono = new Proprietario();
	//método sem retorno
void ligar () {
	//no caso o método para de funcionar caso a variavel abaixo seja null;
	if (modelo == null) {
	return;
	}
	System.out.println("Ligadno Carro "+ modelo);
	}
}
