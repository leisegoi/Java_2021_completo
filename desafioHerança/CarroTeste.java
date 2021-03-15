package oo.heranca.desafio;

public class CarroTeste {

	public static void main(String[] args) {
		
		Carro civic = new Civic();	
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		
		System.out.println(civic);
		
		Ferrari ferrari = new Ferrari();
		ferrari.acelerar();
//		ferrari.ligarTurbo();
		ferrari.acelerar();
		ferrari.acelerar();
		
		System.out.println(ferrari);
	}
	
	
	
	
	
	
	
}
