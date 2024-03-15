package aula3;

public class CarroTeste {
	public static void main(String[] args) {
		
		Carro carro1 = new Carro();
		Carro carro2 = new Carro();
		
		carro1.modelo = "Gol";
		carro1.marca = "Volkswagen";
		carro1.ano = 2015;
		carro1.placa = "ABC-1234";
		carro1.cor = "Vermelho";
		
		System.out.println("============= Carro 1 =============");
		System.out.println("Modelo: " + carro1.modelo);
	}
}
