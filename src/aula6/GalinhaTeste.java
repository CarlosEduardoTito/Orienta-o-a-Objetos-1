package aula6;

public class GalinhaTeste {

	public static void main(String[] args) {
		
		Galinha galinha1 = new Galinha();
		Galinha galinha2 = new Galinha();
		Galinha galinha3 = new Galinha();
		
		galinha1.nome = "Giselda";
		galinha2.nome = "Matilda";
		galinha3.nome = "Clotilde";
		
		galinha1.botar();
		galinha1.botar();
		galinha1.botar();

		galinha2.botar();
		galinha2.botar();
		galinha2.botar();
		
		galinha3.botar();
		galinha3.botar();
		galinha3.botar();
		System.out.println(galinha1.nome + ": " + galinha1.quantidadeOvos + " ovos");
		System.out.println(galinha2.nome + ": " + galinha2.quantidadeOvos + " ovos");
		System.out.println(galinha3.nome + ": " + galinha3.quantidadeOvos + " ovos");
		System.out.println("Total: " + Galinha.quantidadeOvosGranja);
	}
}
