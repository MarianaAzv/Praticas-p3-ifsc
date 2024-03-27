package aulapoo1;

public class main {

	public static void main(String[] args) {
		
		// Instanciar a classe = mema coisa que criar a variavel da classe
		Pessoa thalles = new Pessoa();
		
		
		thalles.cpf = "123456";
		thalles.primeiroNome = "Thalles";
		thalles.sobrenome = "Santos";
		
		Pessoa Mariana = new Pessoa();
		Mariana.cpf = "789456";
		Mariana.primeiroNome = "Mariana";
		Mariana.sobrenome = "Azevedo";
		
		Pessoa Fernanda = new Pessoa();
		Fernanda.cpf = "129876";
		Fernanda.primeiroNome = "Fernanda";
		Fernanda.sobrenome = "Cardoso Serafim";
		
		Pessoa Anne = new Pessoa();
		Anne.cpf = "75412309";
		Anne.primeiroNome = "Anne";
		Anne.sobrenome = "Junks";
		
		Pessoa Jaqueline = new Pessoa();
	    Jaqueline.cpf = "0124589736";
		Jaqueline.primeiroNome = "Jaqueline";
		Jaqueline.sobrenome = "Brandão";
		
		
		//Exibir valores
		System.out.println(thalles.cpf);
		System.out.println(thalles.primeiroNome);
		System.out.println(thalles.sobrenome);
		
		Pessoa[] pessoas = new Pessoa[2];
		
		pessoas[0]= thalles;
		pessoas[1]=Mariana;

	}

}
