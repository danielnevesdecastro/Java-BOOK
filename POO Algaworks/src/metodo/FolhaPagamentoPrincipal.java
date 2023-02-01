package metodo;

public class FolhaPagamentoPrincipal {
public static void main(String[] args) {
	//Tipo , objeto , intância 
	FolhaPagamento folha = new FolhaPagamento();
	//atributo recebendo objeto.método com prâmetros;
	double salario = folha.calcularSalario(160, 12, 32.5, 40.2);
	System.out.println("Salario calculado: " + salario);
}
}
