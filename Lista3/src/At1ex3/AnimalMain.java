package At1ex3;

public class AnimalMain {

	public static void main(String[] args) {
		Animal pavao = new Animal ();
		
		pavao.Nomepolpular = new String[5];
		
		
		pavao.nomecientifico = "Pavo";
		pavao.familia = "Phasianidae";
		pavao.reino = "Animal";
	    pavao.Nomepolpular[0]="Pavao plumagem";
	    pavao.Nomepolpular[1]="Pavao colorido";
	    pavao.Nomepolpular[2]="Pavao indiano";
	    pavao.Nomepolpular[3]="Pavao comum";
	    pavao.Nomepolpular[4]="Pavao azul";
	    
	    
	    System.out.println("Nome cientifo:" +"  "+ pavao.nomecientifico);
	    System.out.println("Familia:" +"  "+ pavao.familia);	   
	    System.out.println("Reino:" +"  "+ pavao.reino);
	    
	    for (int i = 0; i < pavao.Nomepolpular.length; i++) {
			System.out.println("Nome polpular:" + "  " + pavao.Nomepolpular[i]);
		}

	}

}
