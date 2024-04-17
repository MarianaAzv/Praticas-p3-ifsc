package ifsc;

import java.util.ArrayList;

public class MainProduto {

	public static void main(String[] args) {

		// **************************************************************//

		ArrayList<Desktop> desktop = new ArrayList<>();

		// ********************************************************//
		Desktop obja = new Desktop();

		obja.setGamer(false);
		obja.setCodBarras(4588l);
		obja.setFabricante("AAAAAA");

		ArrayList<String> peca = new ArrayList<>();

		peca.add("Mouse");
		peca.add("Monitor1");
		peca.add("Monitor2");

		obja.setPecas(peca);

		desktop.add(obja);

		// **********************************************//

		Desktop objb = new Desktop();

		objb.setCodBarras(879654120l);
		objb.setFabricante("BBBBBB");
		objb.setGamer(true);

		ArrayList<String> pecas2 = new ArrayList<>();

		pecas2.add("Monitor");
		pecas2.add("Mouse");
		pecas2.add("teclado");

		objb.setPecas(pecas2);

		desktop.add(objb);

		// *******************************************************************//

		Desktop objc = new Desktop();

		objc.setCodBarras(787987547767267l);
		objc.setFabricante("CCCCC");
		objc.setGamer(false);

		ArrayList<String> pecas3 = new ArrayList<>();

		pecas3.add("Mouse");
		pecas3.add("Placamae");
		pecas3.add("Teclado");

		objc.setPecas(pecas3);

		desktop.add(objc);

		// ************************************************************************//
		// ***********************************************************************//

		ArrayList<Smartphone> smartphone = new ArrayList<>();

		// *********************************************************************//

		Smartphone celular1 = new Smartphone();

		celular1.setCodBarras(7878787878l);
		celular1.setFabricante("Samsung");
		celular1.setDimensoesTela("abn");
		celular1.setArmazenamento(4785789789l);

		smartphone.add(celular1);

		// *********************************************************//

		Smartphone celular2 = new Smartphone();

		celular2.setCodBarras(457845784578l);
		celular2.setFabricante("Motorola");
		celular2.setDimensoesTela("acvv");
		celular2.setArmazenamento(787878787878l);

		smartphone.add(celular2);

		// *******************************************************//

		Smartphone celular3 = new Smartphone();

		celular3.setCodBarras(78797898789l);
		celular3.setFabricante("iphone");
		celular3.setDimensoesTela("aqnm");
		celular3.setArmazenamento(789789789789l);

		smartphone.add(celular3);

		// ***************************************************//
		// Mostrar na tela//
		// **************************************************//

		for (Desktop objvisualizar : desktop) {
            
			System.out.println("Desktop:                                      ");
			System.out.println("                                              ");
			System.out.println("Codigo de Barra:" + objvisualizar.getCodBarras());
			System.out.println("Fabricante:"    +  objvisualizar.getFabricante());
			System.out.println("Gamer:"                + objvisualizar.isGamer());

			for (String pecaDeskto : objvisualizar.getPecas()) {
				System.out.println("Pecas:"   );
				System.out.println(pecaDeskto);
			}
		}

		System.out.println("                              ");
		// ************************************************//

		for (Smartphone objvisualizar2 : smartphone) {
	
			System.out.println("Smartphone"                 );
			System.out.println("                           ");
			System.out.println("Codigo de Barra:"+ objvisualizar2.getCodBarras());
			System.out.println("Fabricante:"    + objvisualizar2.getFabricante());
			System.out.println("Dimensoes de Tela:"+objvisualizar2.getDimensoesTela());
			System.out.println("Armazenamento do smartphone:"+ objvisualizar2.getArmazenamento());
		}

	}

}
