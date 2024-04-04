package At1ex2;

import java.util.Scanner;

import At1ex1.Pessoa;

public class PessoaMainB {

	public static void main(String[] args) {
	Pessoa[] pessoas = new Pessoa [3];
	Scanner leitura = new Scanner(System.in);

	
	for (int i = 0; i < pessoas.length; i++) {
		Pessoa objp = new Pessoa();
		
		System.out.println("Nome da Pessoa" + i);
		objp.nome = leitura.nextLine();
		System.out.println("Cpf da pessoa" + i);
		objp.cpf = Long.valueOf(leitura.nextLine());
		System.out.println("Data de nascimento da pessoa" + i);
		objp.datadenascimento = leitura.nextLine();
		
		pessoas[i]= objp;
	}
	
	for (int i = 0; i < pessoas.length; i++) {
		System.out.println(pessoas[i].nome);
		System.out.println(pessoas[i].cpf);
		System.out.println(pessoas[i].datadenascimento);
	}
	}

}
