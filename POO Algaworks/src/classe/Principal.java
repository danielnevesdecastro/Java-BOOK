package classe;

public class Principal {
	public static void main(String[] args) {
		
		//intanciação de um objeto do tipo carro
		Carro meuCarro; //declaração de variável
		meuCarro = new Carro(); // instância de um carro 
		//Carro seuCarro = new Carro();
		
		Carro seuCarro = new Carro();
		seuCarro.modelo = "CIVICAUM";
		Proprietario dono1 = new Proprietario();
		dono1.cidade = "Jampa";
		dono1.idade = 25;
		dono1.nome = "Daniel Neves";
		
		meuCarro.anoFabricacao = 2021;
		meuCarro.modelo = "PALIO";
		//Atributo de compõe objeto;
		meuCarro.dono = dono1;
		//ou 
		meuCarro.dono.bairro = "gramame";
		
		
		System.out.println("Modelo: "+meuCarro.modelo);
		System.out.println("Ano: "+meuCarro.anoFabricacao);
		System.out.println("Dono do carro: "+ meuCarro.dono.nome);
		System.out.println("Onde mora:"+ dono1.bairro);
		meuCarro.ligar();
		seuCarro.ligar();
		
	}
}
