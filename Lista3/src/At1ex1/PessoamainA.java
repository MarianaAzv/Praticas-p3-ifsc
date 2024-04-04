package At1ex1;

public class PessoamainA {

	public static void main(String[] args) {
		Pessoa A = new Pessoa();
		A.nome ="AAA";
		A.cpf =4785;
		A.datadenascimento ="41/547/7894";
		
		Pessoa b = new Pessoa();
		b.nome ="bbb";
		b.cpf = 98745;
		b.datadenascimento ="47/896/5412";
		
		
		Pessoa c = new Pessoa();
		c.nome ="ccc";
		c.cpf =54789;
		c.datadenascimento ="48/541/5232";
		
		
		System.out.println(A.nome);
		System.out.println(A.cpf);
		System.out.println(A.datadenascimento);
		
		System.out.println(b.nome);
		System.out.println(b.cpf);
		System.out.println(b.datadenascimento);
		
		System.out.println(c.nome);
		System.out.println(c.cpf);
		System.out.println(c.datadenascimento);
		
	}

}
