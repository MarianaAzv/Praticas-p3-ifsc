package ifsc;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
	
		//oi
		//oiiiii
		
		//iii
        //oioioioi
	  Tutor mari = new Tutor();
	     mari.setNomeCompleto("Mariana de Azevedo");
	     
     Gato Olibano = new Gato();
     Olibano.setClasse("Mamalia");
     Olibano.setNomeCientifico("Felis catus domestic");
     Olibano.setApelido("Oli");
     Olibano.setPedigree("Vira-Lata");
     
     mari.setGato(Olibano);
     
     Tutor fe = new Tutor();
	 fe.setNomeCompleto("Fernanda Cardoso Serafin");
	 
     Gato Estrela = new Gato();
    Estrela.setClasse("Mamalia");
    Estrela.setNomeCientifico("Felis catus domestic");
    Estrela.setApelido("EStrela");
    Estrela.setPedigree("Vira-Lata");
     
    
    //Instaciar obje atribuir valores por hardcoding
    fe.setGato(Estrela);
	  Tutor anakin = new Tutor();
	  anakin.setNomeCompleto("Quilherme Galvao Schimit");
	  
      Gato Lisa = new Gato();
      Lisa.setClasse("Mamalia");
      Lisa.setNomeCientifico("Felis catus domestic");
      Lisa.setApelido("Lisa");
      Lisa.setPedigree("Vira-Lata");   
     
     anakin.setGato(Lisa);
     
     
     // Cada um (adiciona)
     ArrayList<Tutor> gtutor = new ArrayList<>();
     gtutor.add(mari);
     gtutor.add(fe);
     gtutor.add(anakin);
     
     for (Tutor Tutorg: gtutor) {
    	 // Tutorg :objeto existe somente no for
    	System.out.println("Tutor:\n" + Tutorg.getNomeCompleto());
    	System.out.println("Classe do gato:\n" + Tutorg.getGato().getClasse());
    	System.out.println("Nome Cientifico:\n" + Tutorg.getGato().getNomeCientifico());
    	System.out.println("Raca do gato\n:" + Tutorg.getGato().getPedigree());
    	System.out.println("Apelido do gato:\n" + Tutorg.getGato().getApelido());
    	System.out.println("\n");
    	
	}
     // Fazendo branch 

   

	}

}
