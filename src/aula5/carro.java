package aula5;

public class carro {
	String modelo;
	String marca;
	int ano;
	String placa;
	String cor;
	
	public void ligar() {
		System.out.println(marca + " " + modelo + " está ligando.");
		
	}
	
	public void desligar() {
		System.out.println(marca + " " + modelo + " está desligando.");
		
	}
	
	public void acelerar() {
		System.out.println(marca + " " + modelo + " está acelerando.");
	
	}
	
	public void frear() {
		System.out.println(marca + " " + modelo + " está freando.");
		
	}
	
	public void imprimirDados() {
		System.out.println("=================");
		System.out.println("Modelo: " + modelo);
		System.out.println("Marca: " + marca);
		System.out.println("Ano: " + ano);
		System.out.println("Placa: " + placa);
		System.out.println("Cor: " + cor);
		
	}

}
