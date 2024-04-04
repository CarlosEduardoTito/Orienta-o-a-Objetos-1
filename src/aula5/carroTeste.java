package aula5;

public class carroTeste {
	public static void main(String[] args) {
		
		carro carro1 = new carro();
		carro carro2 = new carro();
		
		carro1.modelo = "Gol";
		carro1.marca = "Volkswagen";
		carro1.ano = 2015;
		carro1.placa = "ABC-1234";
		carro1.cor = "Vermelho";
		
		carro2.modelo = "Onix";
		carro2.marca = "chevrolet";
		carro2.ano = 2024; 
		carro2.placa = "MNO-9876";
		carro2.cor = "Preto";
		
		carro1.imprimirDados();
		carro2.imprimirDados();
		
		carro1.ligar();
		carro1.acelerar();
		carro1.frear();
		carro2.ligar();
		carro2.acelerar();
		carro2.frear();
		
	}
}
