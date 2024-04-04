package aula6;

public class Galinha {
	
	String nome;
	int quantidadeOvos;
	static int quantidadeOvosGranja = 0;
	
	public void botar() {
		
		quantidadeOvos++;
		quantidadeOvosGranja++;
	}
}
