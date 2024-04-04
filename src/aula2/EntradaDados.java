package aula2;

import java.util.Scanner;

public class EntradaDados {

	public static void main(String [] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe seu nome: ");
		String nome = input.nextLine();
		
		System.out.println("Informe o seu sexo: ");
		String sexo = input.nextLine();
			
		System.out.println("Informe o seu estado civil: ");
		String estadoCivil = input.nextLine();
		
		System.out.println("Informe a quantidade de filhos: ");
		int filhos = input.nextInt();
		
		input.nextLine();
		
		System.out.println("Informe a sua escolaridade: ");
		String escolaridade = input.nextLine();
		
		System.out.println("Informe a sua renda mensal: ");
		double renda = input.nextDouble();
		
		System.out.println("Nome: " + nome);
		System.out.println("Sexo: " + sexo);
		System.out.println("Estado Civil: "+ estadoCivil);
		System.out.println("Filhos: " + filhos);
		System.out.println("Escolaridade: " + escolaridade);
		System.out.println("Renda Mensal: " + renda + "R$");
				
	}
}
