package ifsc;

import java.util.ArrayList;

public class MainVeiculo {

	public static void main(String[] args) {
		
		
		Veiculo carro1= new Veiculo();
		Veiculo carro2= new Veiculo();
		Veiculo moto= new Veiculo();
		
		carro1.setNome("WR-V(SUV)");
		carro1.setAno(2023);
		carro1.setNumeroderodas(4);
		carro1.setFabricante("Honda");
		carro1.setCor("Rosa");
		
	
		carro2.setNome("fit");
		carro2.setAno(2023);
		carro2.setNumeroderodas(4);
		carro2.setFabricante("Honda");
		carro2.setCor("Verde");
		
		
		moto.setNome("Reitwagen");
		moto.setAno(1885);
		moto.setNumeroderodas(2);
		moto.setFabricante("Motoantigas");
		moto.setCor("Azul");
				
		ArrayList<Veiculo> veiculos = new ArrayList<>();
		
		veiculos.add(carro1);
		veiculos.add(carro2);
		veiculos.add(moto);
		
		for (Veiculo veiculo : veiculos) {
			System.out.println("Nome:             " + veiculo.getNome());
			System.out.println("Ano:              " + veiculo.getAno());
			System.out.println("Numero de rodas:  " + veiculo.getNumeroderodas());
			System.out.println("Fabricante:       " + veiculo.getFabricante());
			System.out.println("Cor:              " + veiculo.getCor());
			System.out.println("               ");
			System.out.println("               ");
		}
	}

}
