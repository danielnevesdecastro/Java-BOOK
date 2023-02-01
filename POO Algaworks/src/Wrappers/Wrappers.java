package Wrappers;

public class Wrappers {
	public static void main(String[] args) {
		
	
	Integer idade = 5;
	Boolean tem = false;
	Double valor  = 2.1;
	Integer idade2 = 5;
	
	//conversão objeto para primitivo, usanot tipoValue() 
	int idadeint = idade2.intValue();
	
	//converter strings em tipos primitivos
	String numero = "55";
	int numeroInt = Integer.parseInt(numero);
			
	
	System.out.println(idade);
	System.out.println(tem);
	System.out.println(valor);
	System.out.println(idadeint);
	System.out.println(numeroInt+1);
	
	
}
}
